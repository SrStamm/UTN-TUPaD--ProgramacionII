package Ejercicio_05;

/**
 *
 * @author mirko
 */
public class Cuenta {
  private final int numero;
  private String titular;
  private double saldo;
  private static int ultimoNumero;
  private static int totalCuentas;

  @Override
  public String toString() {
    return "Cuenta = {titular= " + titular + " saldo=" + saldo + " numero=" + numero + "}";
  }

  public Cuenta(String titular, double saldoInicial) {
    this.numero = ++ultimoNumero;
    setTitular(titular);
    setSaldo(saldoInicial);

    totalCuentas++;
  }

  public Cuenta(String titular) {
    this(titular, 0.0);
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    if (titular == null || titular.isEmpty()) {
      System.out.println("Error: El titular no puede estar vacio");
    } else {
      this.titular = titular;
    }
  }

  public static int getUltimoNumero() {
    return ultimoNumero;
  }

  public static int getTotalCuentas() {
    return totalCuentas;
  }

  private void setSaldo(double nuevo) {
    if (nuevo < 0.0) {
      System.out.println("Error: El monto no puede ser negativo");
      return;
    }

    this.saldo = nuevo;

  }

  public double consultarSaldo() {
    return this.saldo;
  }

  public double consultarSaldo(double cotizacionDolar) {
    if (cotizacionDolar <= 0.0) {
      System.out.println("Error: El monto debe ser mayor a 0.");
      return 0.0;
    }
    return this.saldo / cotizacionDolar;
  }

  public void depositar(double cantidad) {
    if (cantidad <= 0.0) {
      System.out.println("Error: El monto debe ser mayor a 0.");
      return;
    }

    setSaldo(saldo + cantidad);
  }

  public void extraer(double cantidad) {
    if (cantidad <= 0.0) {
      System.out.println("Error: El monto no puede ser negativo");
      return;
    }

    double nuevoSaldo = this.saldo - cantidad;

    if (nuevoSaldo < 0) {
      System.out.println("Error: El monto no puede superar al saldo disponible");
      return;
    }

    setSaldo(nuevoSaldo);
  }

  public static void mostrarTotalCuentas() {
    System.out.println("La cantidad total de cuentas son: " + totalCuentas);
  }

}
