/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author mirko
 */
public class Alumno {
  private String nombre;
  private double promedio;
  private static double notaAprobacion = 6.0;

  @Override
  public String toString() {
    return "Alumno = {nombre= " + nombre + " promedio=" + promedio + " aprobado=" + aprobo() + "}";
  }

  public Alumno(String nombre, double promedio) {
    setNombre(nombre);
    setPromedio(promedio);
  }

  public Alumno(String nombre) {
    this(nombre, 0.0);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    if (nombre == null || nombre.isEmpty()) {
      System.out.println("Error: El nombre no puede estar vacio");
    } else {
      this.nombre = nombre;
    }
  }

  public double getPromedio() {
    return promedio;
  }

  public void setPromedio(double promedio) {
    if (promedio > 10) {
      System.out.println("Error: No se puede ingresar un promedio mayor a 10");
      this.promedio = 10.0;
    } else if (promedio < 0) {
      System.out.println("Error: No se puede ingresar un promedio menor a 0");
      this.promedio = 0.0;
    } else {
      this.promedio = promedio;
    }
  }

  public static double getNotaAprobacion() {
    return notaAprobacion;
  }

  public void actualizarPromedio(double nuevo) {
    setPromedio(nuevo);
  }

  public void actualizarPromedio(double[] listaPromedios) {
    double nuevoPromedio = 0.0;
    int tamanio = listaPromedios.length;

    if (tamanio == 0) {
      System.out.println("Error: La lista de promedios no puede estar vacía.");
    } else {

      for (int i = 0; i < tamanio; i++) {
        nuevoPromedio += listaPromedios[i];
      }

      nuevoPromedio = nuevoPromedio / tamanio;

      setPromedio(nuevoPromedio);
    }
  }

  public boolean aprobo() {
    if (promedio >= notaAprobacion) {
      return true;
    } else {
      return false;
    }
  }

  static public void cambiarNotaAprobacion(double nueva) {
    if (nueva > 10) {
      System.out.println("Error: No se puede ingresar una nota de aprobación mayor a 10");
    } else if (nueva < 0) {
      System.out.println("Error: No se puede ingresar una nota de aprobación menor a 0");
    } else {
      Alumno.notaAprobacion = nueva;
    }
  }

}
