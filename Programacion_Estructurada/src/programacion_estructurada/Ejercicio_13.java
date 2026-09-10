/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion_estructurada;

/**
 *
 * @author mirko
 */
public class Ejercicio_13 {
    private static void mostrarPrecios(int contador, double[] precioProductos ) {
        if (contador == precioProductos.length) return;
        
        System.out.println("Precio: $" + precioProductos[contador]);
        mostrarPrecios(contador + 1, precioProductos);
    }
    
    public static void main(String[] args) {
        double[] precioProductos = {199.99, 299.5, 149.75, 399.0, 89.99};
        int contador = 0;

        System.out.println("Precios originales:");
        mostrarPrecios(contador, precioProductos);
        
        precioProductos[2] = 129.99;
        contador = 0;
        
        System.out.println("Precios modificados:");
        mostrarPrecios(contador, precioProductos);
    }
}
