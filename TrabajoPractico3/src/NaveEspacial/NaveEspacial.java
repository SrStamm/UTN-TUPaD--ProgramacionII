/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NaveEspacial;

/**
 *
 * @author mirko
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private static final int CAPACIDAD_MAXIMA = 100;
    private static final int COSTO_DESPEGUE = 5;
    private static final int COSTO_AVANCE = 2;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        if (combustible < 0 ) {
            System.out.println("Error: El combustible no puede ser negativo.");
        } else if (combustible > CAPACIDAD_MAXIMA) {
            System.out.println("Error: El combustible no puede ser mayor a la capacidad maxima.");
        } else {        
            this.combustible = combustible;
        }
    }
    
    public void despegar() {
        if (combustible < COSTO_DESPEGUE) {
            System.out.println("ERROR: Acción cancelada. Falta combustible!");
        } else {
            setCombustible(this.combustible - COSTO_DESPEGUE);
        }
        
    }
    
    public void avanzar(int distancia) {
        int costo = COSTO_AVANCE * distancia;
        
        if (combustible < costo) {
            System.out.println("ERROR: Acción cancelada. Falta combustible!");
        } else {
            setCombustible(this.combustible - costo);
        }
        
    }
    
    public void recargarCombustible(int cantidad) {
        setCombustible(this.combustible + cantidad);
    }
    
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre + " Combustible: " + combustible);
    }
}
