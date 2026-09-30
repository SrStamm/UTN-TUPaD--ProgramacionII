package interfaces;

public class Producto implements Pagable {
  private String nombre;
  private double precio;

  public Producto(String nombre, double precio) {
    this.nombre = nombre;
    this.precio = precio;
  }

  public String getNombre() {
    return nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public void mostrarInfo() {
    System.out.println("----------------------------------------");
    System.out.println("Producto: " + nombre);
    System.out.println(" Precio:  \"" + precio + "\"");
    System.out.println("----------------------------------------");
  }

  @Override
  public double calcularTotal() {
    return precio;
  }

}
