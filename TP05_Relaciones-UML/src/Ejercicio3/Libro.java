package Ejercicio3;

public class Libro {
  private String titulo;
  private String isbn;
  private Autor autor;
  private Editorial editorial;

  public Libro(String titulo, String isbn, Autor autor) {
    this.titulo = titulo;
    this.isbn = isbn;
    this.autor = autor;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getIsbn() {
    return isbn;
  }

  public Autor getAutor() {
    return autor;
  }

  public Editorial getEditorial() {
    return editorial;
  }

  public void setEditorial(Editorial editorial) {
    this.editorial = editorial;
  }
}
