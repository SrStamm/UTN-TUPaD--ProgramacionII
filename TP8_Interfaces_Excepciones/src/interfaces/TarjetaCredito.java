package interfaces;

public class TarjetaCredito implements PagoConDescuento {
  private double descuento;

  public TarjetaCredito(double descuento) {
    this.descuento = descuento;
  }

  public TarjetaCredito() {
    this(0.15);
  }

  public double getDescuento() {
    return descuento;
  }

  public void setDescuento(double descuento) {
    this.descuento = descuento;
  }

  @Override
  public double aplicarDescuento(double cantidad) {
    return cantidad - (cantidad * descuento);
  }

  @Override
  public void procesarPago(double cantidad) {
    double totalConDescuento = aplicarDescuento(cantidad);

    System.out.println("----------------------------------------");
    System.out.println(" Cantidad:  \"" + cantidad + "\"");
    System.out.println(" Descuento:    " + descuento);
    System.out.println(" Total:    " + totalConDescuento);
    System.out.println("----------------------------------------");
  }

}
