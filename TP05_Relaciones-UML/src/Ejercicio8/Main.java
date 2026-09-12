package Ejercicio8;

public class Main {
  public static void main(String[] args) {
    // 1. Instanciamos el Usuario (agregación)
    Usuario usuario = new Usuario("Lucía Fernández", "lucia@email.com");

    // 2. Instanciamos el Documento (crea su FirmaDigital internamente por
    // composición)
    Documento documento = new Documento(
        "Contrato de Servicio",
        "Este es el contenido del contrato...",
        "a8f9c123e456b789",
        "2026-09-12");

    // 3. Asociamos el Usuario a la FirmaDigital del Documento
    documento.getFirmaDigital().setUsuario(usuario);

    // 4. Salida por consola
    System.out.println("=== DATOS DEL DOCUMENTO ===");
    System.out.println("Título: " + documento.getTitulo());
    System.out.println("Contenido: " + documento.getContenido());

    System.out.println("\n=== COMPOSICIÓN (Firma Digital) ===");
    System.out.println("Hash: " + documento.getFirmaDigital().getCodigoHash());
    System.out.println("Fecha: " + documento.getFirmaDigital().getFecha());

    System.out.println("\n=== AGREGACIÓN (Usuario) ===");
    System.out.println("Firmado por: " + documento.getFirmaDigital().getUsuario().getNombre());
    System.out.println("Email: " + documento.getFirmaDigital().getUsuario().getEmail());
  }
}
