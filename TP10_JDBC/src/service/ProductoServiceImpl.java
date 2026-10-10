package service;

import java.util.List;

import dao.CategoriaDAO;
import dao.ProductoDAO;
import model.Producto;

public class ProductoServiceImpl {
  private final ProductoDAO prodDAO;

  public ProductoServiceImpl(ProductoDAO prodDAO) {
    this.prodDAO = prodDAO;
  }

  private void validarNombre(String nombre) {
    if (nombre == null || nombre.trim().isEmpty()) {
      throw new IllegalArgumentException("El nombre no puede estar vacío");
    }
  }

  private void validarPrecio(double precio) {
    if (precio <= 0)
      throw new IllegalArgumentException("Error: el precio debe ser mayor a 0");
  }

  private void validarCantidad(int cantidad) {
    if (cantidad <= 0)
      throw new IllegalArgumentException("Error: la cantidad debe ser mayor a 0");
  }

  private void validarCategoriaValida(int id) {
    if (!this.prodDAO.existeCategoria(id))
      throw new IllegalArgumentException("Error: el ID de categoria no es válido");
  }

  public Producto crearProducto(Producto p) {
    // Valida que el nombre no este vacío
    validarNombre(p.getNombre());
    validarCategoriaValida(p.getId_categoria());
    validarCantidad(p.getCantidad());
    validarPrecio(p.getPrecio());

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

  public List<Producto> listarPorCategoria(int idCategoria) {
    return prodDAO.listarPorCategoria(idCategoria);
  }
}
