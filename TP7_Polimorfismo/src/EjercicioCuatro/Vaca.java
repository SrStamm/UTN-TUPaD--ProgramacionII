
package EjercicioCuatro;

public class Vaca extends Animal {
  public Vaca(String nombre, int edad) {
    super(nombre, edad, "Vaca");
  }

  @Override
  public void hacerSonido() {
    System.out.println("Mooooooooo");
  }
}
