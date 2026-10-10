package model;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
  private int id;
  private LocalDateTime fecha;
  private double total;
  private List<ItemPedido> items;

  public Pedido(int id, LocalDateTime fecha, double total, List<ItemPedido> items) {
    this.id = id;
    this.fecha = fecha;
    this.total = total;
    this.items = items;
  }

  public Pedido(double total, List<ItemPedido> items) {
    this(0, LocalDateTime.now(), total, items);
  }

  @Override
  public String toString() {
    return "Pedido = {id= " + id + " fecha= " + fecha + " total=" + total + " cantidad de Items= " + items.size() + "}";
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public List<ItemPedido> getItems() {
    return items;
  }

  public void setItems(List<ItemPedido> items) {
    this.items = items;
  }
}
