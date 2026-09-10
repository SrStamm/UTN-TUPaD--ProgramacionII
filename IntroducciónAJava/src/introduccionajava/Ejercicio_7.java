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
public class Ejercicio_7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    System.out.print("Ingresa tu nombre: ");
    // Se usaba la funcion nextInt() para obtener el String, cuando es para obtener un int por parte del usuario
    // Modificado para usar nextLine(), la funcion correcta
    String nombre = scanner.nextLine();

    System.out.println("Hola, " + nombre);
}
}
