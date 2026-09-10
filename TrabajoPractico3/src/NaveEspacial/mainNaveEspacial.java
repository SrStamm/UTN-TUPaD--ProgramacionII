/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NaveEspacial;

/**
 *
 * @author mirko
 */
public class mainNaveEspacial {
    
  public static void main(String[] args) {
      NaveEspacial nave = new NaveEspacial();
      
      nave.setNombre("USCSS Nostromo");
      nave.setCombustible(50);
      
      // No puede, ya que necesita 80 de combustible para avanzar 40kms
      nave.avanzar(40);
      
      // No puede, ya que tiene 50 en el tanque, max 100
      nave.recargarCombustible(200);
      nave.recargarCombustible(50);
      
      nave.avanzar(40);
      nave.mostrarEstado();
  }
    
}
