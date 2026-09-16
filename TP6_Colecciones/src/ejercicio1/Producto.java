package ejercicio1;

public class Producto {
  private String id;
  private String nombre;
  private double precio;
  private int cantidad;
  private CategoriaProducto categoria;

  public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
    this.cantidad = cantidad;
    this.categoria = categoria;
  }

  public Producto(String id, String nombre, double precio) {
    this(id, nombre, precio, 0, CategoriaProducto.HOGAR);
  }

  public String getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    if (precio >= 0) {
      this.precio = precio;
    } else {
      System.out.println("Error: El precio no puede ser negativo.");
    }
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    if (cantidad >= 0) {
      this.cantidad = cantidad;
    } else {
      System.out.println("Error: La cantidad no puede ser cero o negativo.");
    }
  }

  public CategoriaProducto getCategoria() {
    return categoria;
  }

  public void setCategoria(CategoriaProducto categoria) {
    this.categoria = categoria;
  }

  // Mostrar en consola la info del producto
  public void mostrarInfo() {
    System.out.println("Producto = ID:" + id + " Nombre: " + nombre + " Precio: " + precio + " Cantidad: " + cantidad
        + " Categoria: " + categoria.getDescripcion());
  }

  // Valida si el precio del producto se encuentra entre ambos valores
  public boolean tienePrecioEntre(double min, double max) {
    return precio >= min && precio <= max;
  }
}
