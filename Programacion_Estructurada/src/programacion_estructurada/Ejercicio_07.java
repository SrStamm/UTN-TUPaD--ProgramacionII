/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion_estructurada;

import java.util.Scanner;

/**
 *
 * @author mirko
 */
public class Ejercicio_07 {
    // Solicitar una nota entre 0 y 10
    // Si esta fuera de rango, pedir de nuevo hasta ingresar un valor valido
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = Integer.parseInt(sc.nextLine());
            
            // Si el numero no esta en rango entre 0 y 10, da un error
            if (nota < 0 | nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            } else {
                // Si esta en el rango, devuelve un mensaje de confirmacion
                System.out.println("Nota guardada correctamente.");
            }
        } while (nota < 0 | nota > 10);

    }
}
