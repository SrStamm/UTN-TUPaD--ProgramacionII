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
public class Ejercicio_04 {
    /* Calcular descuento
       Solicitar precio de producto y su categoria (A, B, C)
       Aplicar descuentos: A=10% B=15% C=20%
       Mostrar precio original, descuento aplicado y precio final
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int descuento = 0;
        double precioFinal, precio;
        char categoria;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(sc.nextLine());
        
        System.out.print("Ingrese la categoria del producto (A, B, C): ");
        categoria = sc.nextLine().charAt(0);

        switch (categoria) {
            case 'A' -> descuento = 10;
            case 'B' -> descuento = 15;
            case 'C' -> descuento = 20;
            default -> {
            }
        }
        
        precioFinal = precio - (precio * descuento) / 100;
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Precio final: " + precioFinal);
    }
}

