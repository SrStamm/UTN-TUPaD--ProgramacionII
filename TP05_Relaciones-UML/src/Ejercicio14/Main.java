package Ejercicio14;

public class Main {
  public static void main(String[] args) {
    // 1. Instanciamos el Proyecto
    Proyecto proyecto = new Proyecto("Documental Cortometraje", 45);

    // 2. Instanciamos el EditorVideo
    EditorVideo editor = new EditorVideo();

    // 3. Exportamos el video (crea internamente la instancia de Render)
    Render renderResultado = editor.exportar("MP4 / H.264", proyecto);

    // 4. Verificación por consola
    System.out.println("\n=== RENDER RESULTANTE ===");
    System.out.println("Formato: " + renderResultado.getFormato());
    System.out.println("Proyecto exportado: " + renderResultado.getProyecto().getNombre());
    System.out.println("Duración: " + renderResultado.getProyecto().getDuracionMin() + " minutos");
  }
}
