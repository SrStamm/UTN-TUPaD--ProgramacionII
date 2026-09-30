package excepciones;

public class DivisionSegura {
  public void divisionSegura(int num1, int num2) {
    try {
      System.out.println("La división entre " + num1 + " y " + num2 + " es: " + (num1 / num2));
    } catch (ArithmeticException e) {
      System.out.println("Error: No se puede dividir por 0");
    }
  }
}
