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
public class Ejercicio_01 {
    /* Verificacion anio bisiesto
       Solicitar el anio y determinar su es bisiesto
       Lo es si es divisible por 4 pero no por 100, salvo que sea por 400
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio;
        
        // Le pide al usuario que ingrese el anio
        // Valida que sea un integer valido
        System.out.print("Escibra el año: ");
        anio = Integer.parseInt(sc.nextLine());

        // Si es divisible por 4 pero no por 100, es bisiesto
        // O si es divisible por 400, es bisiesto tambien
        if (anio % 4 == 0 && anio % 100 != 0 | anio % 400 == 0) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año NO es bisiesto");
        }
    }   
}