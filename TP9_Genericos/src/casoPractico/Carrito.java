package casoPractico;

import java.util.ArrayList;
import java.util.List;

public class Carrito<T extends Producto<?>> {
  private final List<T> lista;

  public Carrito() {
    this.lista = new ArrayList<>();
  }

  /**
   *
   * @param producto
   */
  public void agregarProducto(T producto) {
    lista.add(producto);
  }

  public void eliminarProducto(String Id) {
    for (T t : lista) {
      if (t.getId().equals(Id)) {
        lista.remove(t);
        return;
      }
    }
  }

  public double calcularTotal() {
    double total = 0;
    for (T t : lista) {
      total += t.getPrecio();
    }

    return total;
  }

}
