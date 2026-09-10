/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Libro;


/**
 *
 * @author mirko
 */
public class mainLibro {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Libro libro = new Libro();
    
    libro.setAnoPublicacion(2999);
    
    libro.setTitulo("1984");
    libro.setAutor("George Orwell");
    libro.setAnoPublicacion(1949);
    
    libro.mostrarInfo();
  }

}
