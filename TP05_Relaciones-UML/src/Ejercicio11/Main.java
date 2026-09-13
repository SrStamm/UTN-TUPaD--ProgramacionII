package Ejercicio11;

public class Main {
  public static void main(String[] args) {
    // 1. Instanciamos el Artista
    Artista artista = new Artista("Daft Punk", "Electrónica");

    // 2. Instanciamos la Canción (asociación unidireccional)
    Canción cancion = new Canción("One More Time", artista);

    // 3. Instanciamos el Reproductor
    Reproductor reproductor = new Reproductor();

    // 4. Invocamos la dependencia de uso (se pasa la Canción por parámetro)
    reproductor.reproducir(cancion);
  }
}
