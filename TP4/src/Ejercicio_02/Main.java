package Ejercicio_02;


import Ejercicio_02.Libro;


public class Main {
  public static void main(String[] args) {
    // 1. Instanciación usando ambos constructores
    Libro libro1 = new Libro("Ficciones", "Jorge Luis Borges");
    Libro libro2 = new Libro("El Aleph", "Jorge Luis Borges", "Sur");

    System.out.println(libro1);
    System.out.println(libro2);

    // 2. Probar actualizarTitulo (válido e inválido)
    libro1.actualizarTitulo("Nuevas Ficciones"); // Sobrecarga 1
    libro2.actualizarTitulo("Edición Especial", "El Aleph"); // Sobrecarga 2
    libro1.actualizarTitulo(""); // Intento de título inválido (debe mostrar error)

    System.out.println("\n--- Después de actualizar títulos ---");
    System.out.println(libro1);
    System.out.println(libro2);

    // 3. Modificar la editorial global desde la clase y verificar impacto
    Libro.cambiarEditorial("Penguin Random House");

    System.out.println("\n--- Después de cambiar la editorial global ---");
    System.out.println(libro1);
    System.out.println(libro2);
  }
}
