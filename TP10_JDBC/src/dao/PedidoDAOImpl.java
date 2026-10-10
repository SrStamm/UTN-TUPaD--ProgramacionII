package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Pedido;
import config.DatabaseConnection;
import excepciones.DataAccessException;
import model.DetalleItemPedido;

public class PedidoDAOImpl implements PedidoDAO {
  @Override
  public Pedido crear(Pedido p) {
    try (Connection conn = DatabaseConnection.getConnection()) {
      return crear(p, conn);
    } catch (SQLException e) {
      throw new DataAccessException("Error de conexión al intentar crear el Pedido", e);
    }
  }

  public Pedido crear(Pedido p, Connection c) {
    String sql = "INSERT INTO pedidos (fecha, total) VALUES (?, ?)";

    try (
        PreparedStatement stmt = c.prepareStatement(
            sql,
            Statement.RETURN_GENERATED_KEYS)) {

      stmt.setTimestamp(1, Timestamp.valueOf(p.getFecha()));
      stmt.setDouble(2, p.getTotal());
      stmt.executeUpdate();

      try (ResultSet rs = stmt.getGeneratedKeys()) {
        if (rs.next()) {
          p.setId(rs.getInt(1));
        }
      }

      return p;
    } catch (Exception e) {
      throw new DataAccessException("Error al persistir un nuevo pedido: ", e);
    }

  }

  @Override
  public Pedido leer(int id) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                   // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public boolean actualizar(Pedido t) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                   // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public boolean eliminar(int id) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                   // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public List<Pedido> listar() {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                   // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  private List<DetalleItemPedido> ejecutarDetalle(String sql, Integer pedidoId) {
    List<DetalleItemPedido> listaDetalles = new ArrayList<DetalleItemPedido>();

    try (Connection c = DatabaseConnection.getConnection();
        PreparedStatement stmt = c.prepareStatement(sql)) {

      if (pedidoId != null)
        stmt.setInt(1, pedidoId);

      try (ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
          int id = rs.getInt("pedido_id");
          LocalDateTime fecha = rs.getTimestamp("fecha").toLocalDateTime();
          double total = rs.getDouble("total");
          int cantidad = rs.getInt("cantidad");
          double subtotal = rs.getDouble("subtotal");
          String nombreProducto = rs.getString("producto");
          double precio = rs.getDouble("precio");
          String categoria = rs.getString("categoria");

          listaDetalles
              .add(new DetalleItemPedido(id, fecha, total, nombreProducto, categoria, precio, cantidad, subtotal));
        }

        return listaDetalles;
      }

    } catch (Exception e) {
      if (pedidoId != null) {
        throw new DataAccessException("Error al obtener todos los detalles del Pedido con ID=" + pedidoId, e);
      } else {
        throw new DataAccessException("Error al obtener todos los detalles de los Pedidos", e);
      }
    }
  }

  @Override
  public List<DetalleItemPedido> listarDetalle(int pedidoId) {
    String sql = """
        SELECT ped.id AS pedido_id, ped.fecha, ped.total,
               ip.cantidad, ip.subtotal,
               p.nombre AS producto, p.precio,
               c.nombre AS categoria
        FROM pedidos ped
        JOIN items_pedido ip ON ip.pedido_id = ped.id
        JOIN productos p ON ip.producto_id = p.id
        JOIN categoria c ON p.id_categoria = c.id
        WHERE ped.id = ?
        ORDER BY ped.id, ip.id
        """;

    return this.ejecutarDetalle(sql, pedidoId);
  }

  @Override
  public List<DetalleItemPedido> listarTodosConDetalle() {
    String sql = """
        SELECT ped.id AS pedido_id, ped.fecha, ped.total,
               ip.cantidad, ip.subtotal,
               p.nombre AS producto, p.precio,
               c.nombre AS categoria
        FROM pedidos ped
        JOIN items_pedido ip ON ip.pedido_id = ped.id
        JOIN productos p ON ip.producto_id = p.id
        JOIN categoria c ON p.id_categoria = c.id
        ORDER BY ped.id, ip.id
        """;

    return this.ejecutarDetalle(sql, null);
  }
}
