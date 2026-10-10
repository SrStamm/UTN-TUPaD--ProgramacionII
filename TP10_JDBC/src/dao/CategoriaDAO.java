package dao;

import model.Categoria;

public interface CategoriaDAO extends GenericDAO<Categoria> {
  public boolean existeNombre(String nombre);
}
