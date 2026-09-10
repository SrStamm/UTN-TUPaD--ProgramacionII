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
public class Ejercicio_05 {
    /* Suma de numeros pares
     Solicitar numeros al usuario
     Sumar solo los pares
     El ciclo se rompe al recibir '0'
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int numeroIngresado = 1;
        
        // Ejecuta el ciclo mientras la variable no sea 0
        while (numeroIngresado != 0) {
          System.out.print("Ingrese un número (0 para terminar): ");
          numeroIngresado = Integer.parseInt(sc.nextLine());
          
          // Si es par, se suma al total
          if (numeroIngresado % 2 == 0) {
              suma += numeroIngresado;
          }
        }
        
        System.out.println("La suma de los números pares es: " + suma);
    }
    
}
