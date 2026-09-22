package EjercicioUno;

public class Auto extends Vehiculo {
  private final int cantidadPuertas;

  public Auto(int cantidadPuertas, String marca, String modelo) {
    super(marca, modelo);
    this.cantidadPuertas = cantidadPuertas;
  }

  public int getCantidadPuertas() {
    return cantidadPuertas;
  }

  @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("Cantidad de Puertas = " + cantidadPuertas);
  }
}
