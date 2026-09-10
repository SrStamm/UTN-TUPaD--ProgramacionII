/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

import Ejercicio_03.Alumno;

/**
 *
 * @author mirko
 */


public class Main {

  public static void main(String[] args) {
    // 1. Instanciación usando ambos constructores
    Alumno alumno1 = new Alumno("Lucas", 7.5);
    Alumno alumno2 = new Alumno("Sofía");

    System.out.println(alumno1);
    System.out.println(alumno2);

    // 2. Probar actualización de promedios
    alumno2.actualizarPromedio(8.0); // Sobrecarga 1
    double[] notasLucas = { 9.0, 8.5, 7.0, 10.0 };
    alumno1.actualizarPromedio(notasLucas); // Sobrecarga 2

    System.out.println("\n--- Después de actualizar promedios ---");
    System.out.println(alumno1);
    System.out.println(alumno2);

    // 3. Probar defensa en setPromedio
    System.out.println("\n--- Prueba de defensa ---");
    alumno2.actualizarPromedio(15.0); // Debe ajustar a 10.0
    System.out.println(alumno2);

    // 4. Cambiar nota de aprobación global y verificar
    System.out.println("\n--- Cambiando nota de aprobación global a 9.0 ---");
    Alumno.cambiarNotaAprobacion(9.0);

    System.out.println(alumno1);
    System.out.println(alumno2);

  }
}
