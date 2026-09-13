package Ejercicio2;

public class Celular {
  private String imei;
  private String marca;
  private String modelo;
  private Usuario usuario;
  private Bateria bateria;

  public Celular(String imei, String marca, String modelo) {
    this.imei = imei;
    this.marca = marca;
    this.modelo = modelo;
  }

  public String getImei() {
    return imei;
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setBateria(Bateria bateria) {
    this.bateria = bateria;
  }

  public Bateria getBateria() {
    return this.bateria;
  }

  public Usuario getUsuario() {
    return this.usuario;
  }

  public void setUsuario(Usuario nuevoUsuario) {
    this.usuario = nuevoUsuario;

    if (nuevoUsuario != null && nuevoUsuario.getCelular() != this) {
      nuevoUsuario.setCelular(this);
    }
  }
}
