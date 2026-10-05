package casoPractico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // a. Instanciar al menos 3 productos
    Producto<String> p1 = new Producto<>("PROD-1", "Teclado Mecánico", 15000.0);
    Producto<String> p2 = new Producto<>("PROD-2", "Mouse Gamer", 8000.0);
    Producto<String> p3 = new Producto<>("PROD-3", "Monitor 24'", 45000.0);

    // b. Instanciar Carrito y agregar los productos
    Carrito<Producto<String>> carrito = new Carrito<>();
    carrito.agregarProducto(p1);
    carrito.agregarProducto(p2);
    carrito.agregarProducto(p3);

    // c. Mostrar el total inicial
    System.out.println("Total del carrito inicial: $" + carrito.calcularTotal());

    // d. Eliminar un producto por ID y mostrar el nuevo total
    carrito.eliminarProducto("PROD-2");
    System.out.println("Total del carrito tras eliminar PROD-2: $" + carrito.calcularTotal());

    // c. Crear e inicializar una lista con al menos 3 pedidos (ID, total, fecha en
    // formato ISO "YYYY-MM-DD")
    List<Pedido> pedidos = new ArrayList<>();
    pedidos.add(new Pedido("PED-1", 12500.0, "2026-05-10"));
    pedidos.add(new Pedido("PED-2", 45000.0, "2026-01-15"));
    pedidos.add(new Pedido("PED-3", 8000.0, "2026-08-20"));

    // d. Ordenar por total usando el orden natural (Comparable)
    Collections.sort(pedidos);
    System.out.println("\n--- Pedidos ordenados por Total (Comparable) ---");
    for (Pedido p : pedidos) {
      System.out.println(p);
    }

    // e. Ordenar por fecha usando el Comparator externo
    Collections.sort(pedidos, new ComparadorPorFecha());
    System.out.println("\n--- Pedidos ordenados por Fecha (Comparator) ---");
    for (Pedido p : pedidos) {
      System.out.println(p);
    }

    // f. Buscar un pedido existente utilizando el método genérico estático
    String idABuscar = "PED-2";
    Pedido pedidoEncontrado = Buscador.buscar(pedidos, idABuscar);

    if (pedidoEncontrado != null) {
      System.out.println("\nPedido encontrado: " + pedidoEncontrado);
    } else {
      System.out.println("\nEl pedido con ID " + idABuscar + " no existe.");
    }

    // g. Probar buscar un ID inexistente para validar la respuesta
    Pedido noExiste = Buscador.buscar(pedidos, "PED-999");
    if (noExiste == null) {
      System.out.println("Búsqueda de PED-999: El pedido no existe.");
    }
  }
}
