package excepciones;

public class Main {
  public static void main(String[] args) {
    System.out.println("=== 1. DIVISIÓN SEGURA ===");
    DivisionSegura div = new DivisionSegura();
    div.divisionSegura(10, 2);
    div.divisionSegura(10, 0);

    System.out.println("\n=== 2. CONVERSIÓN DE CADENA A NÚMERO ===");
    ConversionNumero conv = new ConversionNumero();
    conv.convertir("123");
    conv.convertir("12a3");

    System.out.println("\n=== 3. LECTURA DE ARCHIVO (FileReader + finally) ===");
    LecturaArchivo lect = new LecturaArchivo();
    lect.leerArchivo("archivo_inexistente.txt");
    lect.leerArchivo("archivo_texto.txt");

    System.out.println("\n=== 4. EXCEPCIÓN PERSONALIZADA (ValidarEdad) ===");
    ValidarEdad validador = new ValidarEdad();

    try {
      validador.validar(25);
      System.out.println("Edad validada correctamente.");
      validador.validar(-5); // Lanza la excepción
    } catch (EdadInvalidaException e) {
      System.out.println("Excepción capturada: " + e.getMessage());
    }

    System.out.println("\n=== 5. TRY-WITH-RESOURCES ===");
    TryWithResources tryRes = new TryWithResources();
    tryRes.leerArchivo("archivo_inexistente.txt");
    tryRes.leerArchivo("archivo_texto.txt");
  }
}