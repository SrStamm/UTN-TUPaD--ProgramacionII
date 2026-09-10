package Gallina;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mirko
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0 ) {
            System.out.println("Error: la edad no puede ser negativo.");
        } else {
            this.edad = edad;
        }
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }
    
    public void envejecer() {
        this.edad += 1;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        if (huevosPuestos < 0 ) {
            System.out.println("Error: la cantidad de huevos puestos no puede ser negativo.");
        } else {
            this.huevosPuestos = huevosPuestos;
        }
    }
    
    public void ponerHuevo() {
        this.huevosPuestos += 1;
        
    }
    
    public void mostrarEstado() {
        System.out.println("ID: " + idGallina + " Edad: " + edad + " Cantidad de huevos puestos: " + huevosPuestos);
    }
}
