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
public class Ejercicio_03 {
    /* Clasificar la edad
     Solicitar la edad, clasificar etapa segun siguiente tabla
        - Menor de 12 años: "Niño"
        - Entre 12 y 17 años : "Adolescente"
        - Entre 18 y 59 años : "Adulto"
        - 60 años o más : "Adulto mayor" */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        
        // Le solicita al usuario su edad
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(sc.nextLine());
        
        // Valida la edad ingresada, si es negativo devuelve un mensaje de error
        // Si es valido, clasifica la etapa basado en la edad
        if (edad < 0) {
            System.out.println("No se aceptan numeros negativos");
        } else if (edad < 12 && edad >= 0) {
            System.out.println("Niño");
        } else if (edad >= 12 && edad < 17) {
            System.out.println("Adolescente");
        } else if (edad >= 18 && edad < 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }
            
    }
}
