
package EjercicioCuatro;

public class Animal {
  protected String nombre;
  protected int edad;
  protected String especie;

  public Animal(String nombre, int edad, String especie) {
    this.nombre = nombre;
    this.edad = edad;
    this.especie = especie;
  }

  public void hacerSonido() {
    System.out.println("El animal hace un sonido.");
  }

  public void describirAnimal() {
    System.out.println("Especie: " + especie + " | Nombre: " + nombre + " | Edad: " + edad + " años");
  }

}
