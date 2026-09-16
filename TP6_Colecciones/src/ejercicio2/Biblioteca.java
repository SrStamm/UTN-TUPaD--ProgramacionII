package ejercicio2;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
  private String nombre;
  private List<Libro> libros;

  public Biblioteca(String nombre) {
    this.nombre = nombre;
    this.libros = new ArrayList<>();
  }

  public String getNombre() {
    return nombre;
  }

  public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
    if (isbn != null && autor != null) {
      Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
      libros.add(nuevoLibro);
    }
  };

  public void listarLibros() {
    // Valida que la lista no esté vacía
    if (libros.isEmpty()) {
      System.out.println("Error: La lista de libros está vacía.");
      return;
    }

    for (Libro l : libros) {
      l.mostrarInfo();
    }
  };

  public Libro buscarLibroPorIsbn(String isbn) {
    // Valida que el array no este vacío
    if (libros.isEmpty()) {
      return null;
    }

    // Recorre el array
    for (Libro l : libros) {
      // Valida si el ISBN es el mismo y lo devuelve
      if (l.getIsbn().equals(isbn)) {
        return l;
      }
    }

    // Devuelve null si no
    return null;
  };

  public void eliminarLibro(String isbn) {
    // Busca el libro
    Libro libroEncontrado = buscarLibroPorIsbn(isbn);

    // Si no se encontró, da un mensaje de error
    if (libroEncontrado == null) {
      System.out.println("Error: No se encontro ningún libro con ISBN" + isbn);
      return;
    }

    // Elimina del array
    libros.remove(libroEncontrado);
  };

  public void obtenerCantidadLibros() {
    if (libros.isEmpty()) {
      System.out.println("Error: No hay libros almacenados.");
      return;
    }

    System.out.println("Cantidad de Libros: " + libros.size());
  };

  public void filtrarLibrosPorAnio(int anio) {
    if (libros.isEmpty()) {
      System.out.println("Error: No hay libros almacenados.");
      return;
    }

    for (Libro l : libros) {
      if (l.getAnioPublicacion() == anio) {
        l.mostrarInfo();
      }
    }
  };

  public void mostrarAutoresDisponibles() {
    if (libros.isEmpty()) {
      System.out.println("Error: No hay libros almacenados.");
      return;
    }

    // Lista para almacenar los autores mostrados
    List<String> autoresMostrados = new ArrayList<>();

    for (Libro l : libros) {
      Autor autor = l.getAutor();

      // Verifica si ya se mostró este autor
      if (!autoresMostrados.contains(autor.getId())) {
        l.mostrarAutor();
        autoresMostrados.add(autor.getId());
      }
    }
  };
}
