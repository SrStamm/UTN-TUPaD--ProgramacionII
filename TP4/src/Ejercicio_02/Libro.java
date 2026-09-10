/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author mirko
 */
public class Libro {
  private String titulo;
  private String autor;
  private static String editorial = "Independiente";

  @Override
  public String toString() {
    return "Libro = {titulo= " + titulo + " autor=" + autor + " editorial=" + editorial + "}";
  }

  public Libro(String titulo, String autor, String editorial) {
    setAutor(autor);
    setTitulo(titulo);
    cambiarEditorial(editorial);
  }

  public Libro(String titulo, String autor) {
    this(titulo, autor, editorial);
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    if (titulo == null || titulo.isEmpty()) {
      System.out.println("Error: El titulo no puede estar vacio");
    } else {
      this.titulo = titulo;
    }
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    if (autor == null || autor.isEmpty()) {
      System.out.println("Error: El autor no puede estar vacio");
    } else {
      this.autor = autor;
    }
  }

  public static String getEditorial() {
    return editorial;
  }

  public void actualizarTitulo(String titulo) {
    setTitulo(titulo);
  }

  public void actualizarTitulo(String prefijo, String titulo) {
    if (titulo == null || titulo.trim().isEmpty()) {
      System.out.println("Error: El nuevo título no puede estar vacío.");
    } else {
      setTitulo(prefijo + " " + titulo);
    }
  }

  public static void cambiarEditorial(String nueva) {
    if (nueva == null || nueva.isEmpty()) {
      System.out.println("Error: La editorial no puede estar vacio");
    } else {
      Libro.editorial = nueva;
    }
  }

}
