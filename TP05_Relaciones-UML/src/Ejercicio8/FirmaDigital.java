package Ejercicio8;

public class FirmaDigital {
  private String codigoHash;
  private String fecha;
  private Usuario usuario;

  public FirmaDigital(String codigoHash, String fecha) {
    this.codigoHash = codigoHash;
    this.fecha = fecha;
  }

  public String getCodigoHash() {
    return codigoHash;
  }

  public String getFecha() {
    return fecha;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

}
