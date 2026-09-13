public class Main {
  public static void main(String[] args) {
    // 1. Instanciamos el Propietario
    Propietario propietario = new Propietario("Ana Gomez", 35999888);

    // 2. Instanciamos Computadora (creando la PlacaMadre mediante composición)
    Computadora computadora = new Computadora("Dell", "SN-987654", "B550M", "AMD B550");

    // 3. Asociamos bidireccionalmente Computadora <-> Propietario
    computadora.setPropietario(propietario);

    // 4. Salida por consola
    System.out.println("=== COMPUTADORA Y PROPIETARIO ===");
    System.out.println("Marca: " + computadora.getMarca());
    System.out.println("Serie: " + computadora.getNumeroSerie());
    System.out.println("Propietario (desde Computadora): " + computadora.getPropietario().getNombre());
    System.out.println("Computadora (desde Propietario): " + propietario.getComputadora().getMarca());

    System.out.println("\n=== COMPOSICIÓN (Placa Madre) ===");
    System.out.println("Modelo Placa Madre: " + computadora.getPlacaMadre().getModelo());
    System.out.println("Chipset: " + computadora.getPlacaMadre().getChipset());
  }
}
