package service;

import java.util.List;

import dao.ProductoDAOImpl;
import model.Producto;

public class ProductoServiceImpl {
  private final ProductoDAOImpl prodDAO;

  public ProductoServiceImpl(ProductoDAOImpl prodDAO) {
    this.prodDAO = prodDAO;
  }

  private void validarNombre(String nombre) {
    if (nombre == null || nombre.trim().isEmpty()) {
      throw new IllegalArgumentException("El nombre no puede estar vacío");
    }
  }

  public Producto crearProducto(Producto p) {
    // Valida que el nombre no este vacío
    validarNombre(p.getNombre());

    // Valida que no existan otras categorías con el mismo nombre
    boolean existe = this.prodDAO.existeNombre(p.getNombre());

    if (existe) {
      throw new IllegalArgumentException("Ya existe una Producto con el mismo nombre");
    }

    return this.prodDAO.crear(p);
  }

  public Producto leerProducto(int id) {
    return this.prodDAO.leer(id);
  }

  public List<Producto> listarProductos() {
    return this.prodDAO.listar();
  }

  public boolean actualizarProducto(Producto c) {
    return this.prodDAO.actualizar(c);
  }

  public boolean eliminarProductoPorId(int id) {
    return this.prodDAO.eliminar(id);
  }
}
