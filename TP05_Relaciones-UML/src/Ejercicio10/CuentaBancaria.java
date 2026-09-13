package Ejercicio10;

public class CuentaBancaria {
  private int cbu;
  private double saldo;
  private ClaveSeguridad clave;
  private Titular titular;

  public CuentaBancaria(int cbu, double saldo, int codigo, String ultimaModificacion) {
    this.cbu = cbu;
    this.saldo = saldo;
    this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
  }

  public int getCbu() {
    return cbu;
  }

  public double getSaldo() {
    return saldo;
  }

  public ClaveSeguridad getClave() {
    return clave;
  }

  public Titular getTitular() {
    return titular;
  }

  public void setTitular(Titular titular) {
    this.titular = titular;

    if (titular != null && titular.getCuentaBancaria() != this) {
      titular.setCuentaBancaria(this);
    }
  }
}
