/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mascota;

/**
 *
 * @author mirko
 */
public class mainMascota {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Mascota mascota = new Mascota();

    mascota.setEdad(-4);
    mascota.setNombre("");

    mascota.setNombre("Mila");
    mascota.setEspecie("Gato");
    mascota.setEdad(1);

    mascota.mostrarInfo();

    mascota.cumplirAnios();
    mascota.cumplirAnios();
    mascota.cumplirAnios();
    mascota.cumplirAnios();

    mascota.mostrarInfo();
  }

}
