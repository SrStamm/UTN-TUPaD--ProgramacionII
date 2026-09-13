package Ejercicio12;

public class Calculadora {
  public void calcular(Impuesto impuesto) {
    // Accedemos a los datos de Impuesto y a su Contribuyente
    double totalConRecargo = impuesto.getMonto() * 1.21;
    System.out.println("Calculando impuesto para: " + impuesto.getContribuyente().getNombre());
    System.out.println("Monto base: $" + impuesto.getMonto());
    System.out.println("Total a pagar (con IVA): $" + totalConRecargo);
  }
}
