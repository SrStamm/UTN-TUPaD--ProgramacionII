package Ejercicio_01;


import Ejercicio_01.Empleado;

public class Main {
  public static void main(String[] args) {
    // 1. Instanciación usando ambos constructores
    Empleado adrian = new Empleado("Adrian", "Data Analyst");
    Empleado natalia = new Empleado("Natalia", "Front End Developer", 1500000.0);
    Empleado daniel = new Empleado("Daniel", "Software Engineer", 3500000.0);

    System.out.println(adrian);
    System.out.println(natalia);
    System.out.println(daniel);

    // 2. Probar actualizarSalario (válido e inválido)
    daniel.actualizarSalario(0.0); // Intento con porcentaje inválido
    daniel.actualizarSalario(0.1); // Sobrecarga 1 (porcentaje)

    adrian.actualizarSalario(-1000000); // Intento con monto fijo inválido
    adrian.actualizarSalario(1000000); // Sobrecarga 2 (monto fijo)

    // 3. Probar setter defensivo con datos inválidos
    natalia.setSalario(-500.0);

    System.out.println("\n--- Después de actualizar salarios ---");
    System.out.println(daniel.getSalario());
    System.out.println(adrian.getSalario());

    // 4. Mostrar el total global de empleados usando el método estático
    System.out.println("\nTotal de empleados creados: " + Empleado.mostrarTotalEmpleados());
  }
}
