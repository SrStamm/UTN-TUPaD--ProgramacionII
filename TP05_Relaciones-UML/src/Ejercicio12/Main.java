package Ejercicio12;

public class Main {
  public static void main(String[] args) {
    // 1. Instanciamos el Contribuyente
    Contribuyente contribuyente = new Contribuyente("Juan Pérez", "20-38123456-9");

    // 2. Instanciamos el Impuesto y le asignamos el Contribuyente (asociación
    // unidireccional)
    Impuesto impuesto = new Impuesto(15000);
    impuesto.setContribuyente(contribuyente);

    // 3. Instanciamos la Calculadora
    Calculadora calculadora = new Calculadora();

    // 4. Invocamos la dependencia de uso
    calculadora.calcular(impuesto);
  }
}
