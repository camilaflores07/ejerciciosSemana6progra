package gestionempleados;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 50494
 */
public class Bonificacion extends Empleados{
    double bonificacion;
    
    public Bonificacion(String nombre, double salario, String genero, int edad) {
        super(nombre, salario, genero, edad);
    }
    public double calcularSalarioFinal(int antiguedad) {
        if (salario > 45000) {
            bonificacion = salario * 0.20; 
        } else if (salario > 25000 && salario <= 45000 && antiguedad > 7) {
            bonificacion = salario * 0.15;  
        } else if (salario > 18900 && antiguedad > 5) {
            bonificacion = salario * 0.10;  
        } else {
            bonificacion = 0;  
        }

        return salario + bonificacion;  
    }
    
}
