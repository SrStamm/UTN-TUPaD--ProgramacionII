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
public class Ejercicio_10 {
    private static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock;
        nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stockActual, cantidadVendida, cantidadRecibida;
        
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(sc.nextLine());
                
        System.out.print("Ingrese la cantidad recibida: ");
        cantidadRecibida = Integer.parseInt(sc.nextLine());
        
        stockActual = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + stockActual);
    }
    
}
