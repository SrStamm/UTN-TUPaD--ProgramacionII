package EjercicioTres;

public class EmpleadoTemporal extends Empleado {
  private int horasTrabajadas;
  private double pagoPorHora;

  public EmpleadoTemporal(

      int horasTrabajadas, double pagoPorHora,
      String nombre, String id) {
    super(nombre, id);
    this.horasTrabajadas = horasTrabajadas;
    this.pagoPorHora = pagoPorHora;
  }

  @Override
  public double calcularSueldo() {
    return horasTrabajadas * pagoPorHora;
  }
}
