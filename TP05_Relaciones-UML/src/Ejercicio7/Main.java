package Ejercicio7;

public class Main {
  public static void main(String[] args) {
    // 1. Instanciamos el Motor (agregación) y Conductor (asociación)
    Motor motor = new Motor("V6 Turbo", "MOT-992381");
    Conductor conductor = new Conductor("Martin Palermo", "LIC-AB-9876");

    // 2. Instanciamos el Vehículo
    Vehículo vehiculo = new Vehículo("AB123CD", "Toyota Corolla");

    // 3. Asignamos relaciones
    vehiculo.setMotor(motor);
    vehiculo.setConductor(conductor);

    // 4. Verificación por consola
    System.out.println("=== DATOS DEL VEHÍCULO ===");
    System.out.println("Modelo: " + vehiculo.getModelo() + " | Patente: " + vehiculo.getPatente());

    System.out.println("\n=== AGREGACIÓN (Motor) ===");
    System.out.println("Tipo Motor: " + vehiculo.getMotor().getTipo());
    System.out.println("N° Serie Motor: " + vehiculo.getMotor().getNumeroSerie());

    System.out.println("\n=== NAVEGACIÓN BIDIRECCIONAL (Vehículo <-> Conductor) ===");
    System.out.println("Conductor desde Vehículo: " + vehiculo.getConductor().getNombre());
    System.out.println("Vehículo desde Conductor: " + conductor.getVehículo().getModelo());
  }
}
