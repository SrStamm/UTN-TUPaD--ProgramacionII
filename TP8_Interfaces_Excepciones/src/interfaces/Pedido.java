package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
  private List<Producto> productos;
  private Cliente cliente;
  private String estado;

  public Pedido(Cliente cliente, String estado) {
    this.cliente = cliente;
    this.estado = estado;
    this.productos = new ArrayList<>();
  }

  public void mostrarProductos() {
    for (Producto producto : productos) {
      producto.mostrarInfo();
    }
  }

  public void mostrarCliente() {
    cliente.mostrarInfo();
  }

  public String getEstado() {
    return estado;
  }

  public void agregarProducto(Producto nuevoProducto) {
    productos.add(nuevoProducto);
  }

  public double calcularTotal() {
    double total = 0;

    for (Producto p : productos) {
      total += p.calcularTotal();
    }

    return total;
  }

  public void cambiarEstado(String nuevoEstado) {
    // Actualiza el estado
    this.estado = nuevoEstado;

    // Notifica al usuario
    cliente.notificar(nuevoEstado);
  }
}
