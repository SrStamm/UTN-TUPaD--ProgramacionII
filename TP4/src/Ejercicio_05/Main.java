package Ejercicio_05;

import Ejercicio_05.Cuenta;

public class Main {
  public static void main(String[] args) {
    // 1. Instanciación usando ambos constructores
    Cuenta c1 = new Cuenta("Carlos Gómez", 500000.0);
    Cuenta c2 = new Cuenta("Mariana López"); // Saldo inicial 0.0 por defecto

    System.out.println(c1);
    System.out.println(c2);

    // 2. Pruebas de depósito y extracción válidas
    System.out.println("\n--- Operaciones en c1 y c2 ---");
    c1.depositar(100000.0);
    c2.depositar(250000.0);
    c1.extraer(50000.0);

    System.out.println("Saldo c1 (ARS): $" + c1.consultarSaldo());
    System.out.println("Saldo c2 (ARS): $" + c2.consultarSaldo());

    // 3. Prueba de defensividad (monto negativo o superior al disponible)
    System.out.println("\n--- Pruebas de defensividad ---");
    c2.extraer(300000.0); // Intento de extracción mayor al saldo disponible
    c1.depositar(-1000.0); // Intento de depósito inválido

    // 4. Sobrecarga de consultarSaldo (Conversión a dólares)
    System.out.println("\n--- Consulta de saldo en USD (Cotización: $1200.0) ---");
    double saldoUSD = c1.consultarSaldo(1200.0);
    System.out.printf("Saldo de %s en USD: $%.2f\n", c1.getTitular(), saldoUSD);

    // 5. Total de cuentas globales creadas
    System.out.println();
    Cuenta.mostrarTotalCuentas();
  }
}
