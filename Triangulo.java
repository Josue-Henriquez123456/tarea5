/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaformas;

/**
 *
 * 
 */
public class Triangulo extends FormaConArea {
    // Propiedades
    private double angulo;
    private double base;
    private double altura;
    
    // Constructor
    public Triangulo() {
        super();
        this.angulo = 0.0;
        this.base = 0.0;
        this.altura = 0.0;
        this.setNombre("Triangulo");
    }
    
    public Triangulo(double base, double altura, double angulo, String color) {
        super(color, "Triangulo");
        this.base = base;
        this.altura = altura;
        this.angulo = angulo;
    }
    
    // Métodos
    @Override
    public void dibujar() {
        if (!isVisible()) {
            System.out.println("No se puede dibujar: el triangulo está oculto");
            return;
        }
        System.out.println("Dibujando un Triangulo de color " + this.color);
    }
    
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
    public double calcularPerimetro() {
        // Suponiendo un triángulo rectángulo para simplificar
        double hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return base + altura + hipotenusa;
    }
    
    // Setters y Getters
    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
    
    public double getAngulo() {
        return angulo;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getBase() {
        return base;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getAltura() {
        return altura;
    }
}
