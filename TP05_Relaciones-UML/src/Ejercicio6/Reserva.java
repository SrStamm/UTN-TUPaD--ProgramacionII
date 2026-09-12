package Ejercicio6;

public class Reserva {
  private String fecha;
  private String hora;
  private Mesa mesa;
  private Cliente cliente;

  public Reserva(String fecha, String hora) {
    this.fecha = fecha;
    this.hora = hora;
  }

  public String getFecha() {
    return fecha;
  }

  public String getHora() {
    return hora;
  }

  public Mesa getMesa() {
    return mesa;
  }

  public void setMesa(Mesa mesa) {
    this.mesa = mesa;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

}
