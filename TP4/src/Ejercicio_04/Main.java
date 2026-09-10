package Ejercicio_04;


import Ejercicio_04.Producto;


public class Main {
  public static void main(String[] args) {
    // 1. Instanciación usando ambos constructores
    Producto p1 = new Producto("Teclado Mecánico", 200.0);
    Producto p2 = new Producto("Mousepad");

    System.out.println(p1);
    System.out.println(p2);

    // 2. Probar aplicarDescuento simple
    p1.aplicarDescuento(0.10); // 10% de descuento -> precioBase pasa a 180.0
    System.out.println("\n--- Después de aplicar 10% a p1 ---");
    System.out.println(p1);

    // 3. Probar aplicarDescuento con límite mínimo
    // 50% de 100 es 50, pero el mínimo permitido es 70.0 -> precioBase se ajusta a
    // 70.0
    p2.aplicarDescuento(0.50, 70.0);
    System.out.println("\n--- Después de aplicar 50% con precio mínimo de 70.0 a p2 ---");
    System.out.println(p2);

    // 4. Modificar IVA globalmente
    Producto.cambiarIVA(0.105); // Reducción de IVA al 10.5%
    System.out.println("\n--- Después de cambiar el IVA global a 10.5% ---");
    System.out.println(p1);
    System.out.println(p2);
  }
}
