
package EjercicioCuatro;

public class Perro extends Animal {
  public Perro(String nombre, int edad) {
    super(nombre, edad, "Perro");
  }

  @Override
  public void hacerSonido() {
    System.out.println("Woff Woff");
  }
}
