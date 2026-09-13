package Ejercicio4;

public class Main {
  public static void main(String[] args) {
    // 1. Instanciamos los objetos
    Banco banco = new Banco("Banco Nación", "30-12345678-9");
    Cliente cliente = new Cliente(40123456, "Carlos Pérez");
    TarjetaDeCrédito tarjeta = new TarjetaDeCrédito(45001234, "12/28");

    // 2. Seteamos la agregación con Banco
    tarjeta.setBanco(banco);

    // 3. Establecemos la relación bidireccional
    // Al setear la tarjeta en el cliente, automáticamente se vincula el cliente en
    // la tarjeta
    cliente.setTarjeta(tarjeta);

    // 4. Verificación de las relaciones por consola
    System.out.println("=== DATOS DEL CLIENTE Y SU TARJETA ===");
    System.out.println("Cliente: " + cliente.getNombre() + " (DNI: " + cliente.getDni() + ")");
    System.out.println("Número de Tarjeta: " + cliente.getTarjeta().getNumero());
    System.out.println("Vencimiento: " + cliente.getTarjeta().getFechaVencimiento());

    System.out.println("\n=== NAVEGACIÓN BIDIRECCIONAL (Tarjeta -> Cliente) ===");
    System.out.println("Titular de la tarjeta: " + tarjeta.getCliente().getNombre());

    System.out.println("\n=== AGREGACIÓN (Banco en Tarjeta) ===");
    System.out.println("Banco asignado: " + tarjeta.getBanco().getNombre() + " (CUIT: " + tarjeta.getBanco().getCuit() + ")");
  }
}
