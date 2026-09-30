package excepciones;

import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {
  public void leerArchivo(String fileName) {
    FileReader reader = null;
    try {
      // Instancia el lector
      reader = new FileReader(fileName);
      int caracter;

      // Dentro del loop imprime cada carácter del archivo
      while ((caracter = reader.read()) != -1) {
        System.out.print((char) caracter);
      }
      System.out.println();
    } catch (IOException e) {
      System.out.println("Error al procesar el archivo: " + e.getMessage());
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException e) {
          System.out.println("Error al cerrar el archivo.");
        }
      }
    }
  }
}
