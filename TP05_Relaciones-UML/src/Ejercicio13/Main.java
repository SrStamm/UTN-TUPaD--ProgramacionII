package Ejercicio13;

public class Main {
  public static void main(String[] args) {
    // 1. Instanciamos el Usuario
    Usuario usuario = new Usuario("Carlos Gómez", "carlos@gmail.com");

    // 2. Instanciamos el Generador
    GeneradorQR generador = new GeneradorQR();

    // 3. Ejecutamos la creación del QR a través del generador
    CódigoQR qr = generador.generar("https://mi-sitio.com/acceso", usuario);

    // 4. Verificación por consola
    System.out.println("=== CÓDIGO QR GENERADO ===");
    System.out.println("Valor del QR: " + qr.getValor());
    System.out.println("Asociado al Usuario: " + qr.getUsuario().getNombre());
  }
}
