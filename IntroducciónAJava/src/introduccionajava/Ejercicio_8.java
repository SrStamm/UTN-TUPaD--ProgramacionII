/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionajava;

/**
 *
 * @author mirko
 */
public class Ejercicio_8 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int resultado = a / b;
        System.out.println("Resultado: " + resultado);
        
        // La variable final resultado de la división es 2 
        // En Java, al dividir entre dos enteros, se trunca la parte decimal
        // Es decir, 5 divido 2 es 2 si ignoramos el resto
        // Si se quisiera obtener el resultado en decimales, uno de los dos variables debe ser un double
    }
}