package EjercicioTres;

public class EmpleadoPlanta extends Empleado {

  private double sueldoBase;
  private double bono;

  public EmpleadoPlanta(double sueldoBase, double bono, String nombre, String id) {
    super(nombre, id);
    this.sueldoBase = sueldoBase;
    this.bono = bono;
  }

  @Override
  public double calcularSueldo() {
    return sueldoBase + bono;
  }

}
