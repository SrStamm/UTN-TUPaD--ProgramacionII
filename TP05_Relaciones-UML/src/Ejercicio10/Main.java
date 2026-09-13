package Ejercicio10;

public class Main {
  public static void main(String[] args) {
    // 1. Instanciamos el Titular
    Titular titular = new Titular("Esteban Quito", 38999000);

    // 2. Instanciamos CuentaBancaria (crea internamente su ClaveSeguridad por
    // composición)
    CuentaBancaria cuenta = new CuentaBancaria(123456789, 150000.50, 4321, "2026-09-01");

    // 3. Establecemos la relación bidireccional
    cuenta.setTitular(titular);

    // 4. Salida por consola
    System.out.println("=== DATOS DE LA CUENTA BANCARIA ===");
    System.out.println("CBU: " + cuenta.getCbu());
    System.out.println("Saldo: $" + cuenta.getSaldo());

    System.out.println("\n=== COMPOSICIÓN (Clave de Seguridad) ===");
    System.out.println("Código Clave: " + cuenta.getClave().getCodigo());
    System.out.println("Última Modificación: " + cuenta.getClave().getUltimaModificacion());

    System.out.println("\n=== NAVEGACIÓN BIDIRECCIONAL (Cuenta <-> Titular) ===");
    System.out.println("Titular desde Cuenta: " + cuenta.getTitular().getNombre());
    System.out.println("CBU desde Titular: " + titular.getCuentaBancaria().getCbu());
  }
}
