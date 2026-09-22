
package EjercicioCuatro;

public class Gato extends Animal {
  public Gato(String nombre, int edad) {
    super(nombre, edad, "Gato");
  }

  @Override
  public void hacerSonido() {
    System.out.println("Miau Miau!");
  }
}
