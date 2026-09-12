public class Cliente {
  private String nombre;
  private int dni;
  private TarjetaDeCrédito tarjeta;

  public Cliente(int dni, String nombre) {
    this.dni = dni;
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public int getDni() {
    return dni;
  }

  public TarjetaDeCrédito getTarjeta() {
    return this.tarjeta;
  }

  public void setTarjeta(TarjetaDeCrédito tarjeta) {
    this.tarjeta = tarjeta;

    if (tarjeta != null && tarjeta.getCliente() != this) {
      tarjeta.setCliente(this);
    }
  }

}
