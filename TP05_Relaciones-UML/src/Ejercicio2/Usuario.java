package Ejercicio2;

public class Usuario {
  private String nombre;
  private int dni;
  private Celular celular;

  public Usuario(String nombre, int dni) {
    this.nombre = nombre;
    this.dni = dni;
  }

  public String getNombre() {
    return this.nombre;
  }

  public int getDni() {
    return this.dni;
  }

  public Celular getCelular() {
    return this.celular;
  }

  public void setCelular(Celular nuevoCelular) {
    this.celular = nuevoCelular;

    if (nuevoCelular != null && nuevoCelular.getUsuario() != this) {
      nuevoCelular.setUsuario(this);
    }
  }
}
