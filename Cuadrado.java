/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaformas;

/**
 *
 * 
 */
public class Cuadrado extends FormaConArea {
   // Propiedades
    private double lado;
    
    // Constructor
    public Cuadrado() {
        super();
        this.lado = 0.0;
        this.setNombre("Cuadrado");
    }
    
    public Cuadrado(double lado, String color) {
        super(color, "Cuadrado");
        this.lado = lado;
    }
    
    // Métodos
    @Override
    public void dibujar() {
        if (!isVisible()) {
            System.out.println("No se puede dibujar: el cuadrado esta oculto");
            return;
        }
        System.out.println("Dibujando un Cuadrado de color " + this.color);
    }
    
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
    
    public double calcularPerimetro() {
        return 4 * lado;
    }
    
    // Setter y Getter
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double getLado() {
        return lado;
    }
}
