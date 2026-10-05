package casoPractico;

import java.util.Comparator;

public class ComparadorPorFecha implements Comparator<Pedido> {
  @Override
  public int compare(Pedido p1, Pedido p2) {
    return p1.getFecha().compareTo(p2.getFecha());
  }
}
