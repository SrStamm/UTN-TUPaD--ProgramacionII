package excepciones;

public class ConversionNumero {
  public void convertir(String cadena) {
    try {
      Integer.parseInt(cadena);
      System.out.println("La " + cadena + " se convirtió a número exitosamente!");
    } catch (NumberFormatException e) {
      System.out.println("Error: la cadena no se puede converir a Integer");
    }
  }
}
