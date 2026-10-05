package casoPractico;

public class Producto<T> {
  private T id;
  private String nombre;
  private double precio;

  public Producto(T id, String nombre, double precio) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
  }

  @Override
  public String toString() {
    return "Producto = {id= " + id + " nomre=" + nombre + " precio=" + precio + "}";
  }

  public T getId() {
    return id;
  }

  public void setId(T id) {
    this.id = id;
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
    if (precio <= 0)
      return;

    this.precio = precio;
  }

}
