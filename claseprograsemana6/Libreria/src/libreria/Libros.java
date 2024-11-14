/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

/**
 *
 * @author 50494
 */
public class Libros {
    String titulo;
    String autor;
    String ISBN;
    double precio;
    
    public Libros (String titulo, String autor, String ISBN, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
    }
    
    public void mostrarDetalles() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Precio: Lps. " + precio);
    }
    
     public double aplicarDescuento(int edad) {
        double descuento = 0;
        if (edad > 25) {
            descuento = 0.25;  
        } else {
            descuento = 0.10;  
        }

        
        double precioConDescuento = precio - (precio * descuento);
        return precioConDescuento;
    }
    
}
