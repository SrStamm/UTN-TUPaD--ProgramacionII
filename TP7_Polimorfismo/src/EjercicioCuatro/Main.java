package EjercicioCuatro;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // 1. Crear una lista de tipo Animal
    List<Animal> granja = new ArrayList<>();

    // 2. Agregar subclases a la lista
    granja.add(new Perro("Firulais", 3));
    granja.add(new Gato("Michi", 2));
    granja.add(new Vaca("Mimu", 5));

    // 3. Recorrer la lista invocando los métodos polimórficos
    for (Animal a : granja) {
      System.out.println("----------------------------------------");
      a.describirAnimal();
      System.out.print("Sonido: ");
      a.hacerSonido();
    }
  }
}
