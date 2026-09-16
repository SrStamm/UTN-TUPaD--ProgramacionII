package ejercicio2;

public class Libro {
  private String isbn;
  private String titulo;
  private int anioPublicacion;
  private Autor autor;

  public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.anioPublicacion = anioPublicacion;
    this.autor = autor;
  }

  public Libro(String isbn, String titulo) {
    Autor defaultAutor = new Autor("UNDEFINED", "UNDEFINED", "UNDEFINED");
    this(isbn, titulo, 0, defaultAutor);
  }

  public String getIsbn() {
    return isbn;
  }

  public String getTitulo() {
    return titulo;
  }

  public int getAnioPublicacion() {
    return anioPublicacion;
  }

  public void setAnioPublicacion(int anioPublicacion) {
    this.anioPublicacion = anioPublicacion;
  }

  public Autor getAutor() {
    return autor;
  }

  public void mostrarAutor() {
    autor.mostrarInfo();
  }

  public void setAutor(Autor autor) {
    if (autor != null && autor != this.autor) {
      this.autor = autor;
    }
  }

  public void mostrarInfo() {
    System.out.println("----------------------------------------");
    System.out.println(" Titulo:  \"" + titulo + "\"");
    System.out.println(" ISBN:    " + isbn);
    System.out.println(" Año:     " + anioPublicacion);
    System.out.println(" Autor:   " + autor.getNombre() + " (" + autor.getNacionalidad() + ")");
    System.out.println("----------------------------------------");
  }
}
