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
public class Ejercicio_02 {
    // Determinar mayor de 3 numeros
    // Pedir 3 numeros enteros y determinar cual es el mayor
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numMayor = 0;
        int numUsuario;

        // Dentro del bucle, solicita al usuario 3 numeros
        // y valida el numero del usuario si es mas grande que numMayor
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese un numero: ");
            numUsuario = Integer.parseInt(sc.nextLine());
            
            if (numUsuario > numMayor) {
                numMayor = numUsuario;
            }
        }
        
        System.out.println("El numero mas grande es: " + numMayor);
    }
}
