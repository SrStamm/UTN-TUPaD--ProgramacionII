package ejercicio1;

import java.util.ArrayList;
import java.util.List;

import ejercicio1.CategoriaProducto;

public class Inventario {
  private List<Producto> productos;

  public Inventario() {
    this.productos = new ArrayList<>();
  }

  public void agregarProducto(Producto p) {
    if (p != null) {
      productos.add(p);
    }
  }

  public void listarProductos() {
    for (Producto producto : productos) {
      producto.mostrarInfo();
    }
  }

  public Producto buscarProductoPorId(String id) {
    for (Producto producto : productos) {
      if (producto.getId().equals(id)) {
        return producto;
      }
    }

    return null;
  }

  public void eliminarProducto(String id) {
    Producto producto = buscarProductoPorId(id);

    if (producto != null) {
      productos.remove(producto);
    }
  }

  public void actualizarStock(String id, int nuevaCantidad) {
    Producto producto = buscarProductoPorId(id);

    if (producto != null) {
      producto.setCantidad(nuevaCantidad);
    }
  }

  public void filtrarPorCategoria(CategoriaProducto categoria) {
    for (Producto p : productos) {

      if (p.getCategoria().equals(categoria)) {
        p.mostrarInfo();
      }
    }
  }

  public void obtenerTotalStock() {
    int total = 0;

    for (Producto p : productos) {
      total += p.getCantidad();
    }

    System.out.println("Stock: " + total);
  }

  public Producto obtenerProductoConMayorStock() {
    // Valida que el array no este vacío
    if (productos.isEmpty()) {
      return null;
    }

    // Se asume que el primer producto es el que tiene mayor stock
    Producto mayor = productos.get(0);

    // Recorre el array
    for (Producto p : productos) {
      // Si el producto tiene más stock, se actualiza el mayor
      if (mayor.getCantidad() < p.getCantidad()) {
        mayor = p;
      }
    }

    return mayor;
  }

  public void filtrarProductosPorPrecio(double min, double max) {
    // Valida que el array no este vacío
    if (productos.isEmpty()) {
      System.out.println("");
      return;
    }

    for (Producto p : productos) {
      if (p.tienePrecioEntre(min, max)) {
        p.mostrarInfo();
      }
    }
  }

  public void mostrarCategoriasDisponibles() {
    // Obtiene el arreglo con todas las constantes
    CategoriaProducto[] values = CategoriaProducto.values();

    for (CategoriaProducto c : values) {
      System.out.println("Categoría: " + c + " Descripción: " + c.getDescripcion());
    }
  }
}
