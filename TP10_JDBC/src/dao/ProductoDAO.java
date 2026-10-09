package dao;

import model.Producto;

public interface ProductoDAO extends GenericDAO<Producto> {
  public boolean existeNombre(String nombre);
}
