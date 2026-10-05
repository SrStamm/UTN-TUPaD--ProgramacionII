package casoPractico;

import java.util.Collection;

public class Buscador {
  public static <T extends Identificable<K>, K> T buscar(Collection<? extends T> elementos, K idBuscado) {
    if (elementos == null || idBuscado == null) {
      return null;
    }

    for (T elemento : elementos) {
      if (idBuscado.equals(elemento.getId())) {
        return elemento;
      }
    }

    return null;
  }
}
