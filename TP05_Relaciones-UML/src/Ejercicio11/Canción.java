package Ejercicio11;

public class Canción {
  private String titulo;
  private Artista artista;

  public Canción(String titulo, Artista artista) {
    this.titulo = titulo;
    this.artista = artista;
  }

  public String getTitulo() {
    return titulo;
  }

  public Artista getArtista() {
    return artista;
  }

  public void setArtista(Artista artista) {
    this.artista = artista;
  }

}
