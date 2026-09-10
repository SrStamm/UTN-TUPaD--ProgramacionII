package Libro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mirko
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            System.out.println("Error: El titulo no puede estar vacio");
        } else {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.isEmpty()) {
            System.out.println("Error: El autor no puede estar vacio");
        } else {
            this.autor = autor;
        }
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        if (anoPublicacion < 0) {
            System.out.println("El año no puede ser negativo.");
        } else if (anoPublicacion > 2026) {
            System.out.println("El año de publicacion no puede ser una fecha futura.");
        } else {
            this.anoPublicacion = anoPublicacion;
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " Autor: " + autor + " Fecha de publicacion: " + anoPublicacion);
    }
    
}
