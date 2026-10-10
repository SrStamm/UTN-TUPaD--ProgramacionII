package service;

import java.sql.Connection;
import java.time.format.DateTimeFormatter;
import java.util.List;

import config.DatabaseConnection;
import dao.PedidoDAO;
import dao.ProductoDAO;
import dao.ItemPedidoDAO;
import excepciones.DataAccessException;
import java.sql.SQLException;
import model.DetalleItemPedido;
import model.ItemPedido;
import model.Pedido;
import model.Producto;

public class PedidoServiceImpl {
  private final PedidoDAO pedidoDAO;
  private final ProductoDAO prodDAO;
  private final ItemPedidoDAO itemDAO;

  public PedidoServiceImpl(PedidoDAO pedidoDAO, ProductoDAO prodDAO, ItemPedidoDAO itemDAO) {
    this.pedidoDAO = pedidoDAO;
    this.prodDAO = prodDAO;
    this.itemDAO = itemDAO;
  }

  private void validarPedido(Pedido p) {
    if (p == null)
      throw new IllegalArgumentException("El pedido no puede ser nulo");
    if (p.getItems() == null || p.getItems().isEmpty())
      throw new IllegalArgumentException("El pedido debe tener al menos un item");
    for (ItemPedido item : p.getItems()) {
      if (item.getProductoId() <= 0)
        throw new IllegalArgumentException("Item con producto inválido");
      if (item.getCantidad() <= 0)
        throw new IllegalArgumentException("La cantidad debe ser mayor a 0 (producto ID=" + item.getProductoId() + ")");
    }
  }

  public Pedido crearPedido(Pedido p) {
    validarPedido(p);

    try (Connection conn = DatabaseConnection.getConnection()) {
      // Desabilita el AutoCommit
      conn.setAutoCommit(false);

      try {
        // Paso 1: leer precios, calcular subtotales y total
        double total = 0;
        for (ItemPedido item : p.getItems()) {
          Producto prod = prodDAO.leer(item.getProductoId(), conn);
          if (prod == null)
            throw new IllegalArgumentException("Producto inexistente ID=" + item.getProductoId());
          item.setSubtotal(prod.getPrecio() * item.getCantidad());
          total += item.getSubtotal();
        }
        p.setTotal(total);

        // PASO 2: persistir
        Pedido guardado = pedidoDAO.crear(p, conn);

        // Por cada item del pedido, lo persiste en la DB
        for (ItemPedido item : p.getItems()) {
          item.setPedidoId(guardado.getId());
          itemDAO.crear(item, conn);

          // Si no se puede descontar del stock, lanza excepcion
          if (!prodDAO.descontarStock(item.getProductoId(), item.getCantidad(), conn))
            throw new IllegalArgumentException("Stock insuficiente para el producto ID=" + item.getProductoId());
        }
        // Despues de realizar todas las modificaciones, hace el commit de todo junto
        conn.commit();
        return guardado;
      } catch (Exception e) {
        // Si hubo un error, deshace TODAS las modificaciones
        conn.rollback();
        throw new DataAccessException("No se pudo crear el pedido: " + e.getMessage(), e);
      }
    } catch (SQLException e) {
      throw new DataAccessException("Error de conexión al crear el pedido", e);
    }
  }

  public void mostrarDetallePedido(Integer pedidoId) {
    List<DetalleItemPedido> lista = (pedidoId != null)
        ? pedidoDAO.listarDetalle(pedidoId)
        : pedidoDAO.listarTodosConDetalle();

    if (lista == null || lista.isEmpty()) {
      System.out.println(pedidoId != null
          ? "No existe el pedido " + pedidoId
          : "No hay pedidos registrados");
      return;
    }

    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    int pedidoActual = -1;
    double total = 0;

    for (DetalleItemPedido d : lista) {
      if (d.getPedidoId() != pedidoActual) {
        if (pedidoActual != -1)
          System.out.printf("%84s%n", "TOTAL: " + plata(total));

        pedidoActual = d.getPedidoId();
        total = 0;

        System.out.println();
        System.out.println("PEDIDO #" + pedidoActual + "   " + d.getFecha().format(f));
        System.out.println("  ----------------------------------------------------------------");
        System.out.printf("  %-24s %-14s %4s %18s %18s%n",
            "Producto", "Categoría", "Cant", "P. Unitario", "Subtotal");
      }

      total += d.getSubtotal();
      System.out.printf("  %-24s %-14s %4d %18s %18s%n",
          d.getNombreProducto(), d.getCategoria(), d.getCantidad(),
          plata(d.getPrecioUnitario()), plata(d.getSubtotal()));
    }

    System.out.printf("%84s%n", "TOTAL: " + plata(total));

  }

  private static String plata(double v) {
    return String.format("$ %,.2f", v);
  }

}
