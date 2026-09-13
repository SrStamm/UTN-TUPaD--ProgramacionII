package Ejercicio14;

public class EditorVideo {

  public Render exportar(String formato, Proyecto proyecto) {
    System.out.println("Exportando proyecto '" + proyecto.getNombre() + "' en formato " + formato + "...");

    // Instancia internamente el Render (creación) asociándole el proyecto
    return new Render(formato, proyecto);
  }
}
