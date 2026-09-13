package Ejercicio6;

public class Main {
  public static void main(String[] args) {
    // 1. Instanciamos las dependencias / agregados independientemente
    Cliente cliente = new Cliente("Laura Gómez", 1144556677);
    Mesa mesa = new Mesa(12, 4);

    // 2. Instanciamos la Reserva
    Reserva reserva = new Reserva("2026-10-15", "21:30");

    // 3. Establecemos la asociación unidireccional y la agregación
    reserva.setCliente(cliente);
    reserva.setMesa(mesa);

    // 4. Verificación de lectura por consola
    System.out.println("=== DATOS DE LA RESERVA ===");
    System.out.println("Fecha: " + reserva.getFecha() + " | Hora: " + reserva.getHora());

    System.out.println("\n=== NAVEGACIÓN UNIDIRECCIONAL (Reserva -> Cliente) ===");
    System.out.println("Cliente: " + reserva.getCliente().getNombre());
    System.out.println("Teléfono: " + reserva.getCliente().getTelefono());

    System.out.println("\n=== AGREGACIÓN (Reserva -> Mesa) ===");
    System.out.println("Mesa N°: " + reserva.getMesa().getNumero());
    System.out.println("Capacidad: " + reserva.getMesa().getCapacidad() + " personas");
  }
}
