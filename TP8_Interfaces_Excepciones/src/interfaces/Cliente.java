package interfaces;

public class Cliente implements Notificable {
  private String nombre;

  public Cliente(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void mostrarInfo() {
    System.out.println("----------------------------------------");
    System.out.println("Nombre: " + nombre);
    System.out.println("----------------------------------------");
  }

  @Override
  public void notificar(String mensaje) {
    System.out.println("[NOTIFICACIÓN PARA " + nombre + "]: Su pedido cambió a " + mensaje);
  }

}
