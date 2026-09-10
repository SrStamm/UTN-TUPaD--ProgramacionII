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
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, suma, resta, mult, div;
        
        System.out.println("Ingrese un número entero:");
        num1 = Integer.parseInt(sc.nextLine());
        
        System.out.println("Ingrese otro número entero:");
        num2 = Integer.parseInt(sc.nextLine());
        
        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        
        System.out.println("La suma entre los dos números es: " + suma);
        System.out.println("La resta entre los dos números es: " + resta);
        System.out.println("La multiplicación entre los dos números es: " + mult);
        System.out.println("La división entre los dos números es: " + div);
    }

}
