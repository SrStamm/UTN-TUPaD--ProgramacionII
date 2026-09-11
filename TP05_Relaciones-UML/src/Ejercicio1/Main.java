package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciación de un Pasaporte (crea internamente su Foto por composición)
        Pasaporte pasaporte = new Pasaporte(12345678, "2026-09-11", "foto_perfil.png", "PNG");
        
        // 2. Instanciación de un Titular
        Titular titular = new Titular("Mirko Stamm", 40123456);

        // 3. Vincular bidireccionalmente desde una de las partes
        // (Probamos asignando desde pasaporte.setTitular)
        pasaporte.setTitular(titular);

        // 4. Verificación de la sincronización bidireccional
        System.out.println("--- PRUEBA DE VÍNCULO BIDIRECCIONAL ---");
        System.out.println("Titular asociado al Pasaporte: " + pasaporte.getTitular().getNombre());
        System.out.println("Pasaporte asociado al Titular (DNI " + titular.getDni() + "): " + titular.getPasaporte().getNumero());

        // 5. Verificación de la Composición (Pasaporte -> Foto)
        System.out.println("\n--- PRUEBA DE COMPOSICIÓN (FOTO) ---");
        System.out.println("Imagen: " + pasaporte.getFoto().getImagen());
        System.out.println("Formato: " + pasaporte.getFoto().getFormato());
    }
}
