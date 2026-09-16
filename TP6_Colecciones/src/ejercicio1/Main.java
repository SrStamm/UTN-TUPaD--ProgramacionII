package ejercicio1;

public class Main {
  public static void main(String[] args) {
    // Instanciar el inventario
    Inventario inventario = new Inventario();

    System.out.println("--- 1. Creación de productos y agregado al inventario ---");

    Producto p1 = new Producto("P01", "Televisor", 2500.0, 10, CategoriaProducto.ELECTRONICA);
    Producto p2 = new Producto("P04", "Auriculares Inalámbricos", 1200.0, 15, CategoriaProducto.ELECTRONICA);
    Producto p3 = new Producto("P02", "Arroz Paella", 850.0, 50, CategoriaProducto.ALIMENTOS);
    Producto p4 = new Producto("P03", "Aceite de Oliva Extra Virgen", 1800.0, 25, CategoriaProducto.ALIMENTOS);
    Producto p5 = new Producto("P05", "Campera Impermeable", 2800.0, 8, CategoriaProducto.ROPA);
    Producto p6 = new Producto("P06", "Zapatillas Deportivas", 3200.0, 12, CategoriaProducto.ROPA);
    Producto p7 = new Producto("P07", "Lámpara de Escritorio", 1500.0);
    Producto p8 = new Producto("P08", "Juego de Sábanas 2 Plazas", 2200.0, 18, CategoriaProducto.HOGAR);

    inventario.agregarProducto(p1);
    inventario.agregarProducto(p2);
    inventario.agregarProducto(p3);
    inventario.agregarProducto(p4);
    inventario.agregarProducto(p5);
    inventario.agregarProducto(p6);
    inventario.agregarProducto(p7);
    inventario.agregarProducto(p8);

    System.out.println("\n--- 2. Listar todos los productos ---");
    inventario.listarProductos();

    System.out.println("\n--- 3. Buscar un producto por ID ---");
    Producto producto = inventario.buscarProductoPorId("P06");
    if (producto != null) {
      producto.mostrarInfo();
    } else {
      System.out.println("Producto no encontrado.");
    }

    System.out.println("\n--- 4. Filtrar productos por categoría ---");
    inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

    System.out.println("\n--- 5. Eliminar un producto por ID y listar restantes ---");
    inventario.eliminarProducto("P07");
    inventario.listarProductos();

    System.out.println("\n--- 6. Actualizar stock de un producto ---");
    inventario.actualizarStock("P06", 20);
    inventario.listarProductos();

    System.out.println("\n--- 7. Mostrar total de stock disponible ---");
    inventario.obtenerTotalStock();

    System.out.println("\n--- 8. Obtener y mostrar el producto con mayor stock ---");
    Producto pMayor = inventario.obtenerProductoConMayorStock();
    pMayor.mostrarInfo();

    System.out.println("\n--- 9. Filtrar productos por rango de precio ($1000 a $3000) ---");
    inventario.filtrarProductosPorPrecio(1000, 3000);

    System.out.println("\n--- 10. Mostrar categorías disponibles ---");
    inventario.mostrarCategoriasDisponibles();
  }
}
