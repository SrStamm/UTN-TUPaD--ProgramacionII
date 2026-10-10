package model;

public class ItemPedido {
  private int id;
  private int pedidoId;
  private int productoId;
  private int cantidad;
  private double subtotal;

    public ItemPedido(int id, int pedidoId, int productoId, int cantidad, double subtotal) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public ItemPedido(int pedidoId, int productoId, int cantidad, double subtotal) {
        this(0, pedidoId, productoId, cantidad, subtotal);
    }

    @Override
    public String toString() {
        return "ItemPedido{" + "id=" + id + ", pedidoId=" + pedidoId + ", productoId=" + productoId + ", cantidad=" + cantidad + ", subtotal=" + subtotal + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
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
