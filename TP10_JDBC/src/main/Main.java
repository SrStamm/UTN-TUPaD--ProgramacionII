package main;

import java.util.ArrayList;
import java.util.List;

import dao.CategoriaDAOImpl;
import dao.ItemPedidoDAOImpl;
import dao.PedidoDAOImpl;
import dao.ProductoDAOImpl;
import excepciones.DataAccessException;
import model.Categoria;
import model.DetalleItemPedido;
import model.ItemPedido;
import model.Pedido;
import model.Producto;
import service.CategoriaServiceImpl;
import service.PedidoServiceImpl;
import service.ProductoServiceImpl;

public class Main {

  /** Stock al que se reinician todos los productos antes de cada corrida. */
  private static final int STOCK_DEMO = 10;

  public static void main(String[] args) {
    // DAOs (acceso a datos) y Services (reglas de negocio)
    CategoriaDAOImpl catDao = new CategoriaDAOImpl();
    CategoriaServiceImpl catServ = new CategoriaServiceImpl(catDao);

    ProductoDAOImpl prodDao = new ProductoDAOImpl();
    ProductoServiceImpl prodServ = new ProductoServiceImpl(prodDao);

    PedidoDAOImpl pedDao = new PedidoDAOImpl();
    ItemPedidoDAOImpl itemDao = new ItemPedidoDAOImpl();
    PedidoServiceImpl pedServ = new PedidoServiceImpl(pedDao, prodDao, itemDao);

    // ===============================================================
    // 1) Crear 2 categorías
    // ===============================================================
    /*
     * seccion("1) Creación de 2 categorías");
     * Categoria hardware = catServ.crearCategoria(
     * new Categoria("Hardware", "Componentes físicos de la computadora"));
     * Categoria software = catServ.crearCategoria(
     * new Categoria("Software", "Programas y licencias"));
     * System.out.println("  " + hardware);
     * System.out.println("  " + software);
     */

    // ===============================================================
    // 2) Mostrar el listado de categorías
    // ===============================================================
    /*
     * seccion("2) Listado de categorías");
     * imprimirCategorias(catServ.listarCategorias());
     */

    // ===============================================================
    // 3) Crear 3 productos (2 en Hardware, 1 en Software)
    // Se usa el constructor de 6 parámetros porque el de 4
    // hardcodea id_categoria = 1 y acá queremos el id real generado.
    // ===============================================================
    /*
     * seccion("3) Creación de 3 productos");
     * Producto teclado = prodServ.crearProducto(new Producto(
     * 0, "Teclado Mecánico", "RGB, switches azules", 45000.00, 10, hardware.getId()));
     * Producto mouse = prodServ.crearProducto(new Producto(
     * 0, "Mouse Óptico", "12000 DPI, ergonómico", 25000.00, 15, hardware.getId()));
     * Producto antivirus = prodServ.crearProducto(new Producto(
     * 0, "Antivirus Total", "Licencia 1 año", 30000.00, 5, software.getId()));
     */

    // ===============================================================
    // 4) Mostrar el listado de productos
    // ===============================================================
    /*
     * seccion("4) Listado de productos");
     * imprimirProductos(prodServ.listarProductos());
     */

    // ===============================================================
    // 5) Actualizar UN producto y buscar sólo ese por id
    // ===============================================================
    /*
     * seccion("5) Actualización y búsqueda puntual (id=" + teclado.getId() + ")");
     * teclado.setPrecio(39999.99);
     * teclado.setCantidad(7);
     * boolean actualizado = prodServ.actualizarProducto(teclado);
     * System.out.println("  ¿Se actualizó? " + (actualizado ? "Sí" : "No"));
     *
     * Producto buscado = prodServ.leerProducto(teclado.getId());
     * System.out.println("  Búsqueda por id  -> " + productoATexto(buscado));
     */

    // ===============================================================
    // 6) Eliminar OTRO producto
    // ===============================================================
    /*
     * seccion("6) Eliminación (id=" + mouse.getId() + ")");
     * boolean eliminado = prodServ.eliminarProductoPorId(mouse.getId());
     * System.out.println("  ¿Se eliminó? " + (eliminado ? "Sí" : "No"));
     */

    // ===============================================================
    // 7) Listado final ya actualizado
    // ===============================================================
    /*
     * seccion("7) Listado de productos actualizado");
     * imprimirProductos(prodServ.listarProductos());
     */

    // ===============================================================
    // NUEVO 1) listarPorCategoria(int idCategoria)
    // Se toma el id de la primer categoría existente en la base para
    // que el test no dependa de un id hardcodeado.
    // ===============================================================
    /*
     * seccion("NUEVO 1) Productos por categoría (listarPorCategoria)");
     *
     * List<Categoria> categorias = catServ.listarCategorias();
     * if (categorias.isEmpty()) {
     * System.out.println(" (no hay categorías en la base: corré antes la sección 1 comentada)");
     * } else {
     * Categoria cat = categorias.get(0);
     * System.out.println("  Buscando productos de [" + cat.getId() + "] " + cat.getNombre());
     * List<Producto> porCat = prodServ.listarPorCategoria(cat.getId());
     *
     * if (porCat.isEmpty()) {
     * System.out.println("    (sin productos en esa categoría)");
     * } else {
     * for (Producto p : porCat) {
     * System.out.println("    " + productoATexto(p));
     * }
     * }
     *
     * // Caso borre: id de categoría inexistente -> lista vacía, sin error
     * List<Producto> inexistente = prodServ.listarPorCategoria(999999);
     * System.out.println("  Con id_categoria=999999 -> " + inexistente.size() + " producto(s) (se espera 0)");
     * }
     */

    // ===============================================================
    // NUEVO 2) crearProducto con id_categoria inexistente (1000000)
    // Debe explotar en la validación del service ANTES de tocar la base.
    // ===============================================================
    /*
     * seccion("NUEVO 2) Crear producto con categoría inexistente (id=1000000)");
     * try {
     * Producto fantasma = new Producto(0, "Producto Fantasma", "No debería persistirse", 100.00, 1, 1000000);
     * prodServ.crearProducto(fantasma);
     * System.out.println("  ⚠ No falló: el producto se creó igual (revisar la validación)");
     * } catch (IllegalArgumentException e) {
     * System.out.println("  ✓ Validación correcta: " + e.getMessage());
     * } catch (Exception e) {
     * System.out.println("  ⚠ Error inesperado (" + e.getClass().getSimpleName() + "): " + e.getMessage());
     * }
     *
     * // Verificación: el producto no quedó en la base
     * seccion("Verificación: listado completo de productos");
     * imprimirProductos(prodServ.listarProductos());
     */

    // ===============================================================
    // FASE 3) GESTIÓN DE PEDIDOS
    //
    // Nada de ids hardcodeados: los productos se resuelven desde la base.
    // ===============================================================

    // ---------------------------------------------------------------
    // F3.0) Reset explícito de stock
    // Cada corrida descuenta stock. Sin esto, a la quinta ejecución el
    // pedido válido empieza a fallar por stock y el demo deja de ser
    // determinista.
    // ---------------------------------------------------------------
    seccion("F3.0) Reset explícito de stock");

    List<Producto> productos = prodServ.listarProductos();
    if (productos.isEmpty()) {
      System.out.println("No hay productos en la base. Corré antes la sección 3 (comentada arriba).");
      return;
    }

    resetearStock(prodServ, productos);

    // Releer después del reset: así el stock que usamos para calcular
    // los escenarios es el que REALMENTE hay en la base.
    productos = prodServ.listarProductos();
    Producto pA = productos.get(0);
    Producto pB = productos.size() > 1 ? productos.get(1) : pA;

    // Los pedidos se acumulan entre corridas, así que las verificaciones
    // son RELATIVAS a cuántos había al arrancar.
    long pedidosBase = contarPedidos(pedDao);

    System.out.println("  Producto A -> " + productoATexto(pA));
    System.out.println("  Producto B -> " + productoATexto(pB));
    System.out.println("  Pedidos previos en la base: " + pedidosBase);

    // ---------------------------------------------------------------
    // F3.1) Pedido válido -> COMMIT
    // ---------------------------------------------------------------
    seccion("F3.1) Pedido válido (commit)");

    List<ItemPedido> items = new ArrayList<>();
    items.add(new ItemPedido(0, pA.getId(), 1, 0));
    items.add(new ItemPedido(0, pB.getId(), 1, 0));

    Pedido pedido = pedServ.crearPedido(new Pedido(0.0, items));

    System.out.println("  Pedido #" + pedido.getId() + " | total = $ "
        + String.format("%,.2f", pedido.getTotal()));

    // Línea base: el stock DESPUÉS del commit válido. Los tests de
    // rollback que vienen después deben devolver exactamente estos
    // valores, no STOCK_DEMO, porque F3.1 ya consumió una unidad.
    int stockABase = prodServ.leerProducto(pA.getId()).getCantidad();
    int stockBBase = prodServ.leerProducto(pB.getId()).getCantidad();

    System.out.println("  stock A: " + stockABase + " (esperado " + (STOCK_DEMO - 1) + ")");
    System.out.println("  stock B: " + stockBBase + " (esperado " + (STOCK_DEMO - 1) + ")");

    // ---------------------------------------------------------------
    // F3.2) Detalle del pedido recién creado (JOIN de 4 tablas)
    // ---------------------------------------------------------------
    seccion("F3.2) Detalle del pedido #" + pedido.getId());
    pedServ.mostrarDetallePedido(pedido.getId());

    // ---------------------------------------------------------------
    // F3.3) Rollback por stock insuficiente
    //
    // EL ORDEN DE LOS ITEMS ES LO QUE HACE QUE EL TEST SIGNIFIQUE ALGO.
    //
    // El item válido va PRIMERO: así se inserta el pedido, se inserta el
    // item 1 y se descuenta stock ANTES de que el item 2 falle. El
    // rollback entonces tiene tres cosas reales para deshacer.
    //
    // Si el inválido fuera el primero, no se escribiría nada antes del
    // fallo y el test daría "✓" igual: sería un falso positivo.
    // ---------------------------------------------------------------
    seccion("F3.3) Pedido con stock insuficiente (rollback)");

    int stockBActual = prodServ.leerProducto(pB.getId()).getCantidad();

    List<ItemPedido> itemsFalla = new ArrayList<>();
    itemsFalla.add(new ItemPedido(0, pA.getId(), 1, 0)); // válido, PRIMERO
    itemsFalla.add(new ItemPedido(0, pB.getId(), stockBActual + 1, 0)); // inválido, SEGUNDO

    try {
      pedServ.crearPedido(new Pedido(0.0, itemsFalla));
      System.out.println("  ✗ No falló: el rollback no se probó");
    } catch (IllegalArgumentException e) {
      // Falló en validarPedido -> antes de abrir conexión
      System.out.println("  ✓ Validación previa: " + e.getMessage());
    } catch (DataAccessException e) {
      // Falló DENTRO de la transacción -> sí hubo rollback
      System.out.println("  ✓ Rollback ejecutado: " + e.getMessage());
      if (e.getCause() != null)
        System.out.println("    causa original: " + e.getCause().getMessage());
    } catch (Exception e) {
      System.out.println("  ✗ Error inesperado (" + e.getClass().getSimpleName() + "): " + e.getMessage());
    }

    // ---------------------------------------------------------------
    // F3.4) Verificación: el rollback no dejó rastro
    // ---------------------------------------------------------------
    seccion("F3.4) Verificación post-rollback");

    // Si el rollback fallara, el stock de A estaría en stockABase - 1
    // (el item válido ya había descontado antes de que el item 2 fallara)
    // y aparecería un pedido fantasma en el conteo.
    System.out.println("  stock A: " + prodServ.leerProducto(pA.getId()).getCantidad()
        + " (esperado " + stockABase + ")");
    System.out.println("  stock B: " + prodServ.leerProducto(pB.getId()).getCantidad()
        + " (esperado " + stockBBase + ")");
    System.out.println("  pedidos en la base: " + contarPedidos(pedDao) + " (esperado " + (pedidosBase + 1) + ")");

    // ---------------------------------------------------------------
    // F3.5) Validaciones previas a la conexión
    // Ninguna de estas tres toca la base: fallan en validarPedido,
    // que corre ANTES de getConnection().
    // ---------------------------------------------------------------
    seccion("F3.5) Validaciones previas a la conexión");

    // Caso A: items = null
    try {
      pedServ.crearPedido(new Pedido(0.0, null));
      System.out.println("  ✗ A) No falló");
    } catch (IllegalArgumentException e) {
      System.out.println("  ✓ A) Validación previa: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("  ✗ A) Error inesperado (" + e.getClass().getSimpleName() + "): " + e.getMessage());
    }

    // Caso B: lista vacía
    try {
      pedServ.crearPedido(new Pedido(0.0, new ArrayList<ItemPedido>()));
      System.out.println("  ✗ B) No falló");
    } catch (IllegalArgumentException e) {
      System.out.println("  ✓ B) Validación previa: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("  ✗ B) Error inesperado (" + e.getClass().getSimpleName() + "): " + e.getMessage());
    }

    // Caso C: cantidad = 0
    try {
      List<ItemPedido> itemsCant0 = new ArrayList<>();
      itemsCant0.add(new ItemPedido(0, pA.getId(), 0, 0));
      pedServ.crearPedido(new Pedido(0.0, itemsCant0));
      System.out.println("  ✗ C) No falló");
    } catch (IllegalArgumentException e) {
      System.out.println("  ✓ C) Validación previa: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("  ✗ C) Error inesperado (" + e.getClass().getSimpleName() + "): " + e.getMessage());
    }

    // ---------------------------------------------------------------
    // F3.6) Producto inexistente, detectado DENTRO de la transacción
    //
    // Ojo con la sutileza: crearPedido lee TODOS los productos en el
    // "Paso 1", ANTES de insertar nada. El pedido fantasma se detecta
    // ahí, así que no hay filas escritas que deshacer. El rollback se
    // ejec igualmente (es la línea del catch), pero sobre una
    // transacción vacía. El test que SÍ prueba el rollback es F3.3.
    // ---------------------------------------------------------------
    seccion("F3.6) Producto inexistente (id=999999)");

    List<ItemPedido> itemsFantasma = new ArrayList<>();
    itemsFantasma.add(new ItemPedido(0, pA.getId(), 1, 0)); // válido, primero
    itemsFantasma.add(new ItemPedido(0, 999999, 1, 0)); // fantasma, segundo

    try {
      pedServ.crearPedido(new Pedido(0.0, itemsFantasma));
      System.out.println("  ✗ No falló");
    } catch (IllegalArgumentException e) {
      System.out.println("  ✓ Validación previa: " + e.getMessage());
    } catch (DataAccessException e) {
      System.out.println("  ✓ Detectado en la transacción: " + e.getMessage());
      if (e.getCause() != null)
        System.out.println("    causa original: " + e.getCause().getMessage());
    } catch (Exception e) {
      System.out.println("  ✗ Error inesperado (" + e.getClass().getSimpleName() + "): " + e.getMessage());
    }

    System.out.println("  stock A: " + prodServ.leerProducto(pA.getId()).getCantidad()
        + " (esperado " + stockABase + ")");
    System.out.println("  pedidos en la base: " + contarPedidos(pedDao) + " (esperado " + (pedidosBase + 1) + ")");

    // ---------------------------------------------------------------
    // F3.7) Detalle: pedido existente, inexistente y todos
    // ---------------------------------------------------------------
    seccion("F3.7) Detalle de pedidos");

    System.out.println("--- pedido " + pedido.getId() + " (existe) ---");
    pedServ.mostrarDetallePedido(pedido.getId());

    System.out.println("--- pedido 999999 (no existe) ---");
    pedServ.mostrarDetallePedido(999999);

    System.out.println("--- todos los pedidos ---");
    pedServ.mostrarDetallePedido(null);

    // ---------------------------------------------------------------
    // F3.8) Estado final de los productos
    // ---------------------------------------------------------------
    seccion("F3.8) Estado final de productos");
    imprimirProductos(prodServ.listarProductos());
  }

  // ===============================================================
  // Helpers
  // ===============================================================

  /** Deja TODOS los productos de la base con el mismo stock de prueba. */
  private static void resetearStock(ProductoServiceImpl prodServ, List<Producto> productos) {
    System.out.println("  ↺ Restaurando stock a " + STOCK_DEMO + " en " + productos.size() + " producto(s)");
    for (Producto p : productos) {
      p.setCantidad(STOCK_DEMO);
      if (!prodServ.actualizarProducto(p))
        System.out.println("    ⚠ no se pudo actualizar " + p.getNombre());
    }
  }

  /** Cuenta pedidos distintos a partir del JOIN (no existe un count() en el DAO). */
  private static long contarPedidos(PedidoDAOImpl pedDao) {
    return pedDao.listarTodosConDetalle().stream()
        .map(DetalleItemPedido::getPedidoId)
        .distinct()
        .count();
  }

  private static void seccion(String titulo) {
    System.out.println();
    System.out.println("========== " + titulo + " ==========");
  }

  private static void imprimirCategorias(List<Categoria> categorias) {
    if (categorias.isEmpty()) {
      System.out.println("  (sin categorías)");
      return;
    }
    for (Categoria c : categorias) {
      System.out.println("  " + c);
    }
  }

  private static void imprimirProductos(List<Producto> productos) {
    if (productos.isEmpty()) {
      System.out.println("  (sin productos)");
      return;
    }
    for (Producto p : productos) {
      System.out.println("  " + productoATexto(p));
    }
  }

  private static String productoATexto(Producto p) {
    if (p == null) {
      return "(no encontrado)";
    }
    return String.format("[id=%d] %-20s | precio=%10.2f | stock=%d | id_categoria=%d",
        p.getId(), p.getNombre(), p.getPrecio(), p.getCantidad(), p.getId_categoria());
  }
}
