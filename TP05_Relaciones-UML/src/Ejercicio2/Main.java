package Ejercicio2;

public class Main {
  public static void main(String[] args) {
    // 1. Demostración de Agregación (la Batería se crea de forma independiente)
    Bateria bateria = new Bateria("EB-BG998", 5000);
    Celular celular = new Celular("356789012345678", "Samsung", "Galaxy S21");

    // Agregamos la batería al celular mediante el setter
    celular.setBateria(bateria);

    // 2. Instanciación de Usuario
    Usuario usuario = new Usuario("Mirko Stamm", 40123456);

    // 3. Establecer la relación bidireccional
    // (Probamos asignando desde el usuario)
    usuario.setCelular(celular);

    // 4. Verificación de la relación bidireccional (Celular <-> Usuario)
    System.out.println("=== PRUEBA DE ASOCIACIÓN BIDIRECCIONAL ===");
    System.out.println("Celular de " + usuario.getNombre() + ": " + usuario.getCelular().getMarca() + " "
        + usuario.getCelular().getModelo());
    System.out.println("Usuario asignado al IMEI " + celular.getImei() + ": " + celular.getUsuario().getNombre());

    // 5. Verificación de la Agregación (Celular -> Batería)
    System.out.println("\n=== PRUEBA DE AGREGACIÓN (BATERÍA) ===");
    System.out.println("Modelo de batería del celular: " + celular.getBateria().getModelo());
    System.out.println("Capacidad: " + celular.getBateria().getCapacidad() + " mAh");

    // Demostración conceptual de agregación: la batería sigue existiendo aislada
    System.out.println("Instancia independiente de la batería: " + bateria.getModelo());
  }
}
