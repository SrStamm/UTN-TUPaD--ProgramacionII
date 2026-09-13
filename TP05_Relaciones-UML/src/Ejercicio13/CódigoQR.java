package Ejercicio13;

public class CódigoQR {
  private String valor;
  private Usuario usuario;

  public CódigoQR(String valor, Usuario usuario) {
    this.valor = valor;
    this.usuario = usuario;
  }

  public String getValor() {
    return valor;
  }

  public Usuario getUsuario() {
    return usuario;
  }

}
