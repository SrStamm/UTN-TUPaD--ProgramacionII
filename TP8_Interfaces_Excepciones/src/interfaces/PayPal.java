package interfaces;

public class PayPal implements Pago {
  @Override
  public void procesarPago(double cantidad) {
    System.out.println("----------------------------------------");
    System.out.println(" Cantidad:  \"" + cantidad + "\"");
    System.out.println(" Descuento:    " + 0);
    System.out.println(" Total:    " + cantidad);
    System.out.println("----------------------------------------");
  }
}
