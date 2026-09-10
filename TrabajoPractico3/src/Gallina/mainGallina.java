/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gallina;

/**
 *
 * @author mirko
 */
public class mainGallina {
      public static void main(String[] args) {

        Gallina gallA = new Gallina();
        Gallina gallB = new Gallina();

        gallA.setEdad(-10);

        gallA.setEdad(2);
        gallB.setEdad(1);
        
        gallA.setIdGallina(1);
        gallB.setIdGallina(2);
        
        gallA.ponerHuevo();
        gallB.ponerHuevo();
        gallB.ponerHuevo();
        gallB.ponerHuevo();
        
        gallA.ponerHuevo();
        gallA.ponerHuevo();
        
        gallA.ponerHuevo();
        gallB.ponerHuevo();
        gallB.ponerHuevo();
        
        gallB.envejecer();
        
        gallA.mostrarEstado();
        gallB.mostrarEstado();
    }
}
