/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Estudiante;

/**
 *
 * @author mirko
 */
public class mainEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante matias = new Estudiante();
        
        matias.setCalificacion(15.0);
        matias.setNombre("");
        
        matias.setNombre("Matias");
        matias.setApellido("Andretti");
        matias.setCurso("Programacion II");
        matias.setCalificacion(7.0);
        
        matias.mostrarInfo();
        
        matias.bajarCalificacion(2.0);
        matias.mostrarInfo();
        
        matias.subirCalificacion(4.5);
        matias.mostrarInfo();
        
        matias.subirCalificacion(2.5);
        matias.bajarCalificacion(20.5);
    }
    
}
