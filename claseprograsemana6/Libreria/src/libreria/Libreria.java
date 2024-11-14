/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

/**
 *
 * @author 50494
 */
public class Libreria {

    
    public static void main(String[] args) {
        Libros libros1 = new Libros("Cien años de soledad", "Gabriel Garcia Marquez", "978-3-16-148410-0", 300.00);
        libros1.mostrarDetalles();
        
        double precioFinal = libros1.aplicarDescuento(30);
        
        System.out.println("Precio con descuento: Lps. " + precioFinal);
        
        /////
         System.out.println();
        /////
        
         Libros libros2 = new Libros("El amor en los tiempos del colera", "Gabriel Garcia Marquez", "978-8-46-720436-0", 600.00);
         libros2.mostrarDetalles();
         
         double precioFinal2 = libros2.aplicarDescuento(20);
         
         System.out.println("Precio con descuento: Lps. " + precioFinal2);
    }
    
}
