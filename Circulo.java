/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaformas;

/**
 *
 * 
 */
public class Circulo extends FormaConArea {
     // Propiedades
    private double radio;
    
    // Constructor
    public Circulo() {
        super();
        this.radio = 0.0;
        this.setNombre("Circulo");
    }
    
    public Circulo(double radio, String color) {
        super(color, "Circulo");
        this.radio = radio;
    }
    
    // Métodos
    @Override
    public void dibujar() {
        if (!isVisible()) {
            System.out.println("No se puede dibujar: el circulo está oculto");
            return;
        }
        System.out.println("Dibujando un Circulo de color " + this.color);
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double calcularRadio() {
        return this.radio;
    }
    
    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }
    
    // Setter y Getter para radio
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }
}


