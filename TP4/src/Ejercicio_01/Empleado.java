/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author mirko
 */
public class Empleado {
  private final int id;
  private String nombre;
  private String puesto;
  private double salario;
  private static int totalEmpleados;

  public Empleado(String nombre, String puesto, double salario) {
    totalEmpleados++;

    this.nombre = nombre;
    this.puesto = puesto;
    this.salario = salario;
    this.id = totalEmpleados;
  }

  public Empleado(String nombre, String puesto) {
    this(nombre, puesto, 1000000.00);
  }

  @Override
  public String toString() {
    return "Persona = {nombre= " + nombre + " puesto=" + puesto + " salario=" + salario + " id=" + id + "}";
  }

  public String getNombre() {
    return nombre;
  }

  public String getPuesto() {
    return puesto;
  }

  public double getSalario() {
    return salario;
  }

  public int getId() {
    return id;
  }

  public void setSalario(double cantidad) {
    if (cantidad < 0) {
      System.out.println("Error: El número no puede ser negativo");
    } else {
      this.salario = cantidad;
    }
  }

  public void actualizarSalario(double pctIncremento) {
    if (pctIncremento <= 0) {
      System.out.println("Error: El porcentaje no puede ser 0 o negativo");
    } else {
      setSalario(this.salario + this.salario * pctIncremento);
    }
  }

  public void actualizarSalario(int cantidad) {
    if (cantidad <= 0) {
      System.out.println("Error: La cantidad de aumento de salario no puede ser 0 o negativo");
    } else {
      setSalario(this.salario + cantidad);
    }
  }

  public static int mostrarTotalEmpleados() {
    return totalEmpleados;
  }
}
