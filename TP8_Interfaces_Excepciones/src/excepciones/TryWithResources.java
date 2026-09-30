package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
  public void leerArchivo(String archivoDir) {
    // Instancia dentro del try para cerrar de forma automática el Buffer
    try (BufferedReader br = new BufferedReader(new FileReader(archivoDir))) {
      String linea;
      while ((linea = br.readLine()) != null) {
        System.out.println(linea);
      }
    } catch (IOException e) {
      System.out.println("Hubo un error al leer el mensaje: " + e.getMessage());
    }
  }
}
