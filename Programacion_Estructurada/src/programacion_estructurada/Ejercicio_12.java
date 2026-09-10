/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion_estructurada;

/**
 *
 * @author mirko
 */
public class Ejercicio_12 {
    public static void main(String[] args) {
        double[] precioProductos = {199.99, 299.5, 149.75, 399.0, 89.99};
        int contador = 0;

        System.out.println("Precios originales:");
        while (contador < precioProductos.length) {
            System.out.println("Precio: $" + precioProductos[contador]);
            contador++;
        }
        
        precioProductos[2] = 129.99;
        
        contador = 0;
        
        System.out.println("Precios modificados:");
        while (contador < precioProductos.length) {
            System.out.println("Precio: $" + precioProductos[contador]);
            contador++;
        }
    }
}
