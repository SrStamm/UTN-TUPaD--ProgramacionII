package EjercicioTres;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // 1. Crear una lista de empleados
    List<Empleado> listaEmpleados = new ArrayList<>();

    // 2. Instanciar y agregar empleados a la lista
    listaEmpleados.add(new EmpleadoTemporal(160, 25.0, "Carlos", "E001"));
    listaEmpleados.add(new EmpleadoPlanta(150000.0, 20000.0, "Ana", "E002"));
    listaEmpleados.add(new EmpleadoTemporal(120, 20.0, "Lucía", "E003"));

    // 3. Recorrer la lista, calcular sueldo polimórficamente y clasificar con
    // instanceof
    for (Empleado emp : listaEmpleados) {
      System.out.println("----------------------------------------");
      System.out.println("Empleado: " + emp.nombre + " (ID: " + emp.id + ")");
      System.out.println("Sueldo a cobrar: $" + emp.calcularSueldo());

      // Clasificación usando instanceof
      if (emp instanceof EmpleadoPlanta) {
        System.out.println("Tipo: Empleado de Planta");
      } else if (emp instanceof EmpleadoTemporal) {
        System.out.println("Tipo: Empleado Temporal");
      }
    }
  }
}
