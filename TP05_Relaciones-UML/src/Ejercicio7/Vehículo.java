
package Ejercicio7;

public class Vehículo {
  private String patente;
  private String modelo;
  private Motor motor;
  private Conductor conductor;

  public Vehículo(String patente, String modelo) {
    this.patente = patente;
    this.modelo = modelo;
  }

  public String getPatente() {
    return patente;
  }

  public String getModelo() {
    return modelo;
  }

  public Motor getMotor() {
    return motor;
  }

  public void setMotor(Motor motor) {
    this.motor = motor;
  }

  public Conductor getConductor() {
    return conductor;
  }

  public void setConductor(Conductor conductor) {
    this.conductor = conductor;

    if (conductor != null && conductor.getVehículo() != this) {
      conductor.setVehículo(this);
    }
  }
}
