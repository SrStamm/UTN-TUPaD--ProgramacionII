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
public class Ejercicio_08 {
    // Calcular precio final con descuento e impuestos
    // Metodo calcularPrecioFinal que calcule el precio final de un producto
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioFinal, precioBase, impuesto, descuento;

        // Le solicita al usuario el precio, descuento e impuesto
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = Double.parseDouble(sc.nextLine());
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        // Divide por 100 para expresar valor en decimal
        impuesto = Double.parseDouble(sc.nextLine()) / 100;
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = Double.parseDouble(sc.nextLine()) / 100;
        
        precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final es: " + precioFinal);
    }
        
    private static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal;

        precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        
        return precioFinal;
    }
}
