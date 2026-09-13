package Ejercicio1;

public class Titular {
  private String nombre;
  private int dni;
  private Pasaporte pasaporte;

  public Titular(String nombre, int dni) {
    this.nombre = nombre;
    this.dni = dni;
  }

  public String getNombre() {
    return this.nombre;
  }

  public int getDni() {
    return this.dni;
  }

  public Pasaporte getPasaporte() {
    return this.pasaporte;
  }

  public void setPasaporte(Pasaporte pasaporte) {
    this.pasaporte = pasaporte;

    // Valida que el pasaporte no sea nulo y si el titular no es el mismo
    // Si es así, modifica el titular para que sea el actual
    if (pasaporte != null && pasaporte.getTitular() != this) {
      pasaporte.setTitular(this);
    }
  }
}
