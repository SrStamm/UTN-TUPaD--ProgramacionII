/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionajava;

import java.util.Scanner;

/**
 *
 * @author mirko
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        int edad;
        
        System.out.println("Ingrese su nombre:");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese su edad:");
        edad = Integer.parseInt(sc.nextLine());
        
        System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    
}
