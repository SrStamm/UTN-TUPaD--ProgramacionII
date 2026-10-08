package service;

import java.util.List;

import dao.CategoriaDAO;
import model.Categoria;

public class CategoriaServiceImpl {
  private final CategoriaDAO categoriaDAO;

  public CategoriaServiceImpl(CategoriaDAO categoriaDAO) {
    this.categoriaDAO = categoriaDAO;
  }

  private void validarNombre(String nombre) {
    if (nombre == null || nombre.trim().isEmpty()) {
      throw new IllegalArgumentException("El nombre no puede estar vacío");
    }
  }

  public Categoria crearCategoria(Categoria c) {
    // Valida que el nombre no este vacío
    validarNombre(c.getNombre());

    // Valida que no existan otras categorías con el mismo nombre
    boolean existe = this.categoriaDAO.existeNombre(c.getNombre());
    if (existe) {
      throw new IllegalArgumentException("Ya existe una Categoria con el mismo nombre");
    }

    return this.categoriaDAO.crear(c);
  }

  public Categoria leerCategoria(int id) {
    return this.categoriaDAO.leer(id);
  }

  public List<Categoria> listarCategorias() {
    return this.categoriaDAO.listar();
  }

  public boolean actualizarCategoria(Categoria c) {
    return this.categoriaDAO.actualizar(c);
  }

  public boolean eliminarCategoriaPorId(int id) {
    return this.categoriaDAO.eliminar(id);
  }
}
