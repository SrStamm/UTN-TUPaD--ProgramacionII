package dao;

import java.util.List;
import model.Producto;

public interface ProductoDAO extends GenericDAO<Producto> {
  public boolean existeNombre(String nombre);

  public List<Producto> listarPorCategoria(int idCategoria);

  public boolean existeCategoria(int idCategoria);
}
