/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaformas;

/**
 *
 * 
 */
public abstract class FormaConArea extends Formas {
      // Constructor
    public FormaConArea() {
        super();
    }
    
    public FormaConArea(String color, String nombre) {
        super(color, nombre);
    }
    
    // Método abstracto para calcular área
    public abstract double calcularArea();
    
    // Método concreto para mostrar área
    public void mostrarArea() {
        System.out.println("El area de " + this.nombre + " es: " + calcularArea());
    }
}
