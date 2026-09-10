package holamundo;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author mirko
 */
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.out.println("Como estas?");
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Edad (int): ");
        int edad = Integer.parseInt(sc.nextLine().trim());
        
        System.out.print("Nombre (línea completa): ");
        String nombre = sc.nextLine();
        
        System.out.printf("Hola %s. Edad: %d", nombre, edad);
    }
}