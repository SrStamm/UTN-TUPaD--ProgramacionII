package EjercicioDos;

public class Rectangulo extends Figura {
  private int base;
  private int altura;

  public Rectangulo(String nombre, int base, int altura) {
    super(nombre);
    this.altura = altura;
    this.base = base;
  }

  @Override
  public double calcularArea() {
    return base * altura;
  }
}
