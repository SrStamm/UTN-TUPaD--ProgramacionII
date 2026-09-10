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
public class Ejercicio_6 {
    public static void main(String[] args) {
        int num1, num2, div;
        double div2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero:");
        num1 = Integer.parseInt(sc.nextLine());
        
        System.out.println("Ingrese otro número entero:");
        num2 = Integer.parseInt(sc.nextLine());
        
        div = num1 / num2;
        div2 = (double) num1 / num2;
        
        System.out.println("La divisió entre los dos números enteros es: " + div);
        System.out.println("La divisió entre los dos números doubles es: " + div2);
    }
}
