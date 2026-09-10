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
public class Ejercicio_09 {
    private static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equals("Nacional")) {
            return peso * 5;
        } else {
            return peso * 10;
        }
    }
    
    private static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioProducto, pesoPaquete, costoEnvio, totalPagar;
        String zona;
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(sc.nextLine());
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        pesoPaquete = Double.parseDouble(sc.nextLine());
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        zona = sc.nextLine();
        
        costoEnvio = calcularCostoEnvio(pesoPaquete, zona);
        System.out.println("El costo de envío es: " + costoEnvio);
        
        totalPagar = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El total a pagar es: " + totalPagar );
    }
}
