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
public class Ejercicio_06 {
    // Contador Positivos, Negativos y Ceros
    // Pedir 10 nros y contarlos en las 3 categorias
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIngresado, cantPositivos = 0, cantNegativos = 0, cantCeros = 0;

        // Dentro del ciclo, pide el numero y valida si es negativo, positivo o cero
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            numeroIngresado = Integer.parseInt(sc.nextLine());
            
            if (numeroIngresado < 0) {
                cantNegativos += 1;
            } else if (numeroIngresado > 0) {
                cantPositivos += 1;
            } else {
                cantCeros += 1;
            }
        }
        
        System.out.println("Resultados: \n Positivos: " + cantPositivos + "\n Negativos: " + cantNegativos + "\n Ceros: " + cantCeros);
    }
}
