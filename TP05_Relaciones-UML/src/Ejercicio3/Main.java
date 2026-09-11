package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciación independiente de Autor y Editorial
        Autor autor = new Autor("George Orwell", "Británica");
        Editorial editorial = new Editorial("Penguin Books", "Londres, Reino Unido");

        // 2. Creación del Libro con su Autor (Asociación unidireccional)
        Libro libro = new Libro("1984", "978-0451524935", autor);

        // 3. Asignación de la Editorial (Agregación mediante setter)
        libro.setEditorial(editorial);

        // 4. Muestra de resultados
        System.out.println("=== DATOS DEL LIBRO ===");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("ISBN: " + libro.getIsbn());
        
        System.out.println("\n=== ASOCIACIÓN UNIDIRECCIONAL (AUTOR) ===");
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Nacionalidad: " + libro.getAutor().getNacionalidad());

        System.out.println("\n=== AGREGACIÓN (EDITORIAL) ===");
        System.out.println("Editorial: " + libro.getEditorial().getNombre());
        System.out.println("Dirección: " + libro.getEditorial().getDireccion());
    }
}
