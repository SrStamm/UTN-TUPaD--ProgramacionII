package ejercicio2;

public class Main {
  public static void main(String[] args) {
    // 1. Instanciar la biblioteca
    Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

    // 2. Crear al menos 3 autores
    Autor a1 = new Autor("A01", "H.P. Lovecraft", "Estadounidense");
    Autor a2 = new Autor("A02", "Yevgeny Zamyatin", "Rusa");
    Autor a3 = new Autor("A03", "Thomas Ligotti", "Estadounidense");
    Autor a4 = new Autor("A04", "George Orwell", "Inglés");

    System.out.println("--- 1. Agregar libros a la biblioteca ---");
    biblioteca.agregarLibro("978-1", "En las montañas de la locura", 1936, a1);
    biblioteca.agregarLibro("978-2", "Nosotros", 1924, a2);
    biblioteca.agregarLibro("978-3", "Noctuario", 1994, a3);
    biblioteca.agregarLibro("978-4", "La llamada de Cthulhu", 1928, a1); // Se repite Lovecraft
    biblioteca.agregarLibro("978-5", "1984", 1949, a4);

    System.out.println("\n--- 2. Listar todos los libros ---");
    biblioteca.listarLibros();

    System.out.println("\n--- 3. Obtener cantidad de libros ---");
    biblioteca.obtenerCantidadLibros();

    System.out.println("\n--- 4. Buscar libro por ISBN ---");
    Libro buscado = biblioteca.buscarLibroPorIsbn("978-2");
    if (buscado != null)
      buscado.mostrarInfo();

    System.out.println("\n--- 5. Filtrar libros por año ---");
    biblioteca.filtrarLibrosPorAnio(1924);

    System.out.println("\n--- 6. Mostrar autores disponibles ---");
    biblioteca.mostrarAutoresDisponibles();

    System.out.println("\n--- 7. Eliminar un libro por ISBN y verificar ---");
    biblioteca.eliminarLibro("978-1");
    biblioteca.listarLibros();
    
    System.out.println("\n--- 8. Mostrar la cantidad total de libros en la biblioteca ---");
    biblioteca.obtenerCantidadLibros();

    System.out.println("\n--- 9. Listar todos los autores disponibles ---");
    biblioteca.mostrarAutoresDisponibles();
  }
}
