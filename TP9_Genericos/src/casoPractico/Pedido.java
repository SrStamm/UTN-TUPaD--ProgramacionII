package casoPractico;

import casoPractico.Identificable;

public class Pedido implements Comparable<Pedido>, Identificable<String> {
  private String id;
  private String fecha;
  private double total;

  public Pedido(String id, double total, String fecha) {
    this.id = id;
    this.total = total;
    this.fecha = fecha;
  }

  public Pedido(String id, String fecha) {
    this(id, 0.0, fecha);
  }

  @Override
  public String toString() {
    return "Pedido = {id= " + id + " fecha=" + fecha + " total=" + total + "}";
  }

  @Override
  public String getId() {
    return id;
  }

  public double getTotal() {
    return this.total;
  }

  public String getFecha() {
    return this.fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  @Override
  public int compareTo(Pedido otroPedido) {
    return Double.compare(this.total, otroPedido.total);
  }
}
