package EjercicioDos;

public class Main {
  public static void main(String[] args) {
    // Creamos un array de la clase abstracta Figura conteniendo subclases
    // (Upcasting)
    Figura[] figuras = new Figura[2];
    figuras[0] = new Circulo("Círculo Principal", 5.0);
    figuras[1] = new Rectangulo("Rectángulo Base", 4, 6);

    // Recorremos el arreglo llamando a calcularArea() de forma polimórfica
    for (Figura f : figuras) {
      System.out.println("Figura: " + f.getNombre() + " | Área: " + f.calcularArea());
    }
  }
}
