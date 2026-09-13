package Ejercicio7;

public class Conductor {
  private String nombre;
  private String licencia;
  private Vehículo vehículo;

  public Conductor(String nombre, String licencia) {
    this.nombre = nombre;
    this.licencia = licencia;
  }

  public String getNombre() {
    return nombre;
  }

  public String getLicencia() {
    return licencia;
  }

  public Vehículo getVehículo() {
    return vehículo;
  }

  public void setVehículo(Vehículo vehículo) {
    this.vehículo = vehículo;

    if (vehículo != null && vehículo.getConductor() != this) {
      vehículo.setConductor(this);
    }
  }

}
