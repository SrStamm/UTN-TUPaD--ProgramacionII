package Ejercicio13;

public class GeneradorQR {
  public CódigoQR generar(String valor, Usuario usuario) {
    // Combina el valor junto al email del usuario
    String contenidoQR = valor + " | Pertenece a: " + usuario.getEmail();

    // Se instancian las dependencias dentro del método y se retorna
    return new CódigoQR(contenidoQR, usuario);
  }
}
