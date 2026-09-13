package Ejercicio8;

public class Documento {
  private String titulo;
  private String contenido;
  private FirmaDigital firmaDigital;

  public Documento(String titulo, String contenido, String codigoHash, String fecha) {
    this.titulo = titulo;
    this.contenido = contenido;
    this.firmaDigital = new FirmaDigital(codigoHash, fecha);
  }

  public String getTitulo() {
    return titulo;
  }

  public String getContenido() {
    return contenido;
  }

  public FirmaDigital getFirmaDigital() {
    return firmaDigital;
  }

}
