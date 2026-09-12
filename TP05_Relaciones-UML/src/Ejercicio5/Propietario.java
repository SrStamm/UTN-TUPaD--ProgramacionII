public class Propietario {
  private String nombre;
  private int dni;
  private Computadora computadora;

  public Propietario(String nombre, int dni) {
    this.nombre = nombre;
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public int getDni() {
    return dni;
  }

  public Computadora getComputadora() {
    return computadora;
  }

  public void setComputadora(Computadora computadora) {
    this.computadora = computadora;

    if (computadora != null && computadora.getPropietario() != this) {
      computadora.setPropietario(this);
    }
  }
}
