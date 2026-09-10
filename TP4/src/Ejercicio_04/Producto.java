package Ejercicio_04;

/**
 *
 * @author mirko
 */
public class Producto {
  private String nombre;
  private double precioBase;
  private static double IVA = 0.21;

  @Override
  public String toString() {
    return "Producto = {nombre= " + nombre + " precioBase=" + precioBase + " precioFinal=" + calcularPrecioFinal()
        + "}";
  }

  public Producto(String nombre, double precioBase) {
    setNombre(nombre);
    setPrecioBase(precioBase);
  }

  public Producto(String nombre) {
    this(nombre, 100.0);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    if (nombre == null || nombre.isEmpty()) {
      System.out.println("Error: El nombre no puede estar vacio");
    } else {
      this.nombre = nombre;
    }
  }

  public double getPrecioBase() {
    return precioBase;
  }

  public void setPrecioBase(double precioBase) {
    if (precioBase < 0) {
      System.out.println("Error: No se puede ingresar un número negativo.");
    } else {
      this.precioBase = precioBase;
    }
  }

  public static double getIVA() {
    return IVA;
  }

  public static void cambiarIVA(double nuevo) {
    if (nuevo < 0) {
      System.out.println("Error: El IVA no puede ser negativo");
    } else {
      Producto.IVA = nuevo;
    }
  }

  public void aplicarDescuento(double pct) {
    if (pct < 0 || pct > 1) {
      System.out.println("Error: El porcentaje debe estar entre 0 y 1.");
      return;
    }

    double nuevo = this.precioBase - (this.precioBase * pct);
    setPrecioBase(nuevo);
  }

  public void aplicarDescuento(double pct, double precioMinimo) {
    if (pct < 0 || pct > 1) {
      System.out.println("Error: El porcentaje debe estar entre 0 y 1.");
      return;
    }
    double nuevoPrecio = this.precioBase - (this.precioBase * pct);

    if (nuevoPrecio < precioMinimo) {
      setPrecioBase(precioMinimo);
    } else {
      setPrecioBase(nuevoPrecio);
    }
  }

  public double calcularPrecioFinal() {
    return this.precioBase + this.precioBase * IVA;
  }

}
