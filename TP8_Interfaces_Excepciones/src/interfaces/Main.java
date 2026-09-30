package interfaces;

public class Main {
  public static void main(String[] args) {
    System.out.println("=== 1. CREACIÓN DE CLIENTE Y PRODUCTOS ===");
    Cliente cliente = new Cliente("Mirko Stamm");

    Producto p1 = new Producto("Laptop Lenovo IdeaPad", 850.00);
    Producto p2 = new Producto("Teclado Mecánico", 120.00);
    Producto p3 = new Producto("Mouse Inalámbrico", 45.50);

    System.out.println("\n=== 2. CREACIÓN DEL PEDIDO ===");
    Pedido pedido = new Pedido(cliente, "PENDIENTE");
    pedido.agregarProducto(p1);
    pedido.agregarProducto(p2);
    pedido.agregarProducto(p3);

    System.out.println("Detalles del Cliente:");
    pedido.mostrarCliente();

    System.out.println("Productos en el pedido:");
    pedido.mostrarProductos();

    double totalPedido = pedido.calcularTotal();
    System.out.println("TOTAL DEL PEDIDO: $" + totalPedido);

    System.out.println("\n=== 3. CAMBIO DE ESTADO Y NOTIFICACIÓN ===");
    // Esto desencadena el patrón Notificable llamando a cliente.notificar(...)
    pedido.cambiarEstado("PROCESANDO_PAGO");

    System.out.println("\n=== 4. PROCESAMIENTO DE PAGOS ===");

    // Prueba con PayPal (Implementa Pago)
    System.out.println("\n--> Pago con PayPal:");
    Pago pagoPayPal = new PayPal();
    pagoPayPal.procesarPago(totalPedido);

    // Prueba con Tarjeta de Crédito (Implementa PagoConDescuento)
    System.out.println("\n--> Pago con Tarjeta de Crédito (15% desc. por defecto):");
    PagoConDescuento pagoTarjeta = new TarjetaCredito();
    pagoTarjeta.procesarPago(totalPedido);

    // Modificando el descuento dinámicamente
    System.out.println("\n--> Pago con Tarjeta de Crédito (20% desc. promocional):");
    TarjetaCredito tarjetaPromo = new TarjetaCredito(0.20);
    tarjetaPromo.procesarPago(totalPedido);

    // Notificación final
    pedido.cambiarEstado("ENVIADO");
  }
}
