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
public class Ejercicio_11 {
    final static double DESCUENTO_ESPECIAL = 0.10;
    
    private static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        
        double precioConDescuento = precio - descuentoAplicado;
        System.out.println("El precio final con descuento es: " + precioConDescuento);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(sc.nextLine());
                
        calcularDescuentoEspecial(precio);
    }
}
