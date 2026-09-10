package Mascota;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mirko
 */
public class Mascota {
  private String nombre;
  private String especie;
  private int edad;

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

  public String getEspecie() {
    return especie;
  }

  public void setEspecie(String especie) {
    if (especie == null || especie.isEmpty()) {
      System.out.println("Error: El especie no puede estar vacio");
    } else {
      this.especie = especie;
    }
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    if (edad < 0) {
      System.out.println("Error: La edad debe ser un numero mayor o igual a 0");
    } else {
      this.edad = edad;
    }
  }

  public void cumplirAnios() {
    edad++;
    System.out.println("La mascota cumplio años. Ahora tiene " + edad + " años");
  }

  public void mostrarInfo() {
    System.out.println("Nombre: " + nombre + " Edad: " + edad + " años Especie: " + especie);
  }
}
