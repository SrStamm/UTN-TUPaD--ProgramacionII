/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiante;

/**
 *
 * @author mirko
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty() ) {
            System.out.println("Error: El nombre no puede estar vacio");
        } else {
            this.nombre = nombre;
        }
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        if (apellido == null || apellido.isEmpty()) {
            System.out.println("Error: El apellido no puede estar vacio");
        } else {
            this.apellido = apellido;
        }
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        if (curso == null || curso.isEmpty()) {
            System.out.println("Error: El curso no puede estar vacio");
        } else {
            this.curso = curso;
        }
    }
    
    public double getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(double calificacion) {
        if (calificacion < 0.0 || calificacion > 10.0) {
            System.out.println("Error: La calificacion debe estar entre 0.0 y 10.0");
        } else {
            this.calificacion = calificacion;
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " Apellido: " + apellido + " Curso: " + curso + " Calificacion: " + calificacion);
    }
    
    public void subirCalificacion(double puntos) {
        if (calificacion + puntos > 10.0) {
            System.out.println("Error: Los puntos ingresados superan el limite");
        } else {
            calificacion += puntos;
        }
    }
    
    public void bajarCalificacion(double puntos) {
        if (calificacion - puntos < 0.0) {
            System.out.println("Error: Los puntos ingresados superan el limite.");
        } else {
            calificacion -= puntos;
        }
    }
}
