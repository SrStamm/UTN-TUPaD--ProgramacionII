package Ejercicio9;

public class Main {
  public static void main(String[] args) {
    // 1. Instanciamos las entidades independientes
    Paciente paciente = new Paciente("Roberto Gómez", "OSDE 310");
    Profesional profesional = new Profesional("Dra. Marta López", "Cardiología");

    // 2. Instanciamos la CitaMédica
    CitaMédica cita = new CitaMédica("2026-10-20", "15:30");

    // 3. Asignamos el paciente y el profesional mediante las relaciones
    // unidireccionales
    cita.setPaciente(paciente);
    cita.setProfesional(profesional);

    // 4. Verificación por consola
    System.out.println("=== DATOS DE LA CITA MÉDICA ===");
    System.out.println("Fecha: " + cita.getFecha() + " | Hora: " + cita.getHora());

    System.out.println("\n=== NAVEGACIÓN UNIDIRECCIONAL (CitaMédica -> Paciente) ===");
    System.out.println("Paciente: " + cita.getPaciente().getNombre());
    System.out.println("Obra Social: " + cita.getPaciente().getObraSocial());

    System.out.println("\n=== NAVEGACIÓN UNIDIRECCIONAL (CitaMédica -> Profesional) ===");
    System.out.println("Profesional: " + cita.getProfesional().getNombre());
    System.out.println("Especialidad: " + cita.getProfesional().getEspecialidad());
  }
}
