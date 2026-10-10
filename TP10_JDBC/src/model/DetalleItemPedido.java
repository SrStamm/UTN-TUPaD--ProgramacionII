package model;

import java.time.LocalDateTime;

public class DetalleItemPedido {
  private int pedidoId;
  private LocalDateTime fecha;
  private double total;
  private String nombreProducto;
  private String categoria;
  private double precioUnitario;
  private int cantidad;
  private double subtotal;

  public DetalleItemPedido(int pedidoId, LocalDateTime fecha, double total, String nombreProducto, String categoria,
      double precioUnitario, int cantidad, double subtotal) {
    this.pedidoId = pedidoId;
    this.fecha = fecha;
    this.total = total;
    this.nombreProducto = nombreProducto;
    this.categoria = categoria;
    this.precioUnitario = precioUnitario;
    this.cantidad = cantidad;
    this.subtotal = subtotal;
  }

  @Override
  public String toString() {
    return "DetalleItemPedido{" + "pedidoId=" + pedidoId + ", fecha=" + fecha + ", total=" + total + ", nombreProducto="
        + nombreProducto + ", categoria=" + categoria + ", precioUnitario=" + precioUnitario + ", cantidad=" + cantidad
        + ", subtotal=" + subtotal + '}';
  }

  public int getPedidoId() {
    return pedidoId;
  }

  public void setPedidoId(int pedidoId) {
    this.pedidoId = pedidoId;
  }

  public LocalDateTime getFecha() {
    return fecha;
  }

  public void setFecha(LocalDateTime fecha) {
    this.fecha = fecha;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public String getNombreProducto() {
    return nombreProducto;
  }

  public void setNombreProducto(String nombreProducto) {
    this.nombreProducto = nombreProducto;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public double getPrecioUnitario() {
    return precioUnitario;
  }

  public void setPrecioUnitario(double precioUnitario) {
    this.precioUnitario = precioUnitario;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public double getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(double subtotal) {
    this.subtotal = subtotal;
  }

}
