/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionempleados;

/**
 *
 * @author 50494
 */
public class GestionEmpleados {
    
    public static void main(String[] args) {
        Bonificacion empleado1 = new Bonificacion("Katherine Carvallo", 30000, "Femenino", 25);
        
        double salarioFinal = empleado1.calcularSalarioFinal(8);
        
        System.out.println("Nombre: " + empleado1.nombre);
        System.out.println("Salario: Lps. " + empleado1.salario);
        System.out.println("Bonificacion: Lps. " + empleado1.bonificacion);
        System.out.println("Salario final: Lps. " + salarioFinal);
        
        
        //////
        System.out.println();
        //////
        
        
        Bonificacion empleado2 = new Bonificacion("Omar Salazar", 50000, "Masculino", 35);
        
        System.out.println("Nombre: " + empleado2.nombre);
        System.out.println("Salario: Lps. " + empleado2.salario);
        System.out.println("Bonificacion: Lps. " + empleado2.bonificacion);
        System.out.println("Salario final: Lps. " + salarioFinal);
        
    
        
    }
    
}
