package Ejercicio1;

public class Pasaporte {
  private int numero;
  private String fechaEmision;
  private Foto foto;
  private Titular titular;

  public Pasaporte(int numero, String fechaEmision, String imagen, String imagenFormato) {
    this.numero = numero;
    this.fechaEmision = fechaEmision;
    this.foto = new Foto(imagen, imagenFormato);
  }

  public Foto getFoto() {
    return this.foto;
  }

  public int getNumero() {
    return this.numero;
  }

  public Titular getTitular() {
    return this.titular;
  }

  public void setTitular(Titular titular) {
    this.titular = titular;

    // Valida que el titular no sea nulo y si el pasaporte no es el mismo
    // Si es así, modifica el pasaporte para que sea el actual
    if (titular != null && titular.getPasaporte() != this) {
      titular.setPasaporte(this);
    }
  }

}
