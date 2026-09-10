import java.util.Scanner;
import java.util.Locale;


public class LeerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Edad (int): ");
        int edad = Integer.parseInt(sc.nextLine().trim());
        
        System.out.print("Nombre (línea completa): ");
        String nombre = sc.nextLine();
        
        System.out.printf("Hola %s. Edad: %d", nombre, edad);
    }
}
