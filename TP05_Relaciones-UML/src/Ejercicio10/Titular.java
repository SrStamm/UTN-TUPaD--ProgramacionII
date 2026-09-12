package Ejercicio10;

public class Titular {
  private String nombre;
  private int dni;
  private CuentaBancaria cuentaBancaria;

  public Titular(String nombre, int dni) {
    this.nombre = nombre;
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public int getDni() {
    return dni;
  }

  public CuentaBancaria getCuentaBancaria() {
    return cuentaBancaria;
  }

  public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
    this.cuentaBancaria = cuentaBancaria;

    if (cuentaBancaria != null && cuentaBancaria.getTitular() != this) {
      cuentaBancaria.setTitular(this);
    }
  }

}
