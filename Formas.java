/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaformas;

/**
 *
 * 
 */
public abstract class Formas {
    // Propiedades
    protected String color;
    protected String nombre;
    protected boolean visible;
    
    // Constructor
    public Formas() {
        this.color = "Blanco"; // Color por defecto
        this.nombre = "Forma sin nombre";
        this.visible = true;
    }
    
    public Formas(String color, String nombre) {
        this.color = color;
        this.nombre = nombre;
        this.visible = true;
    }
    
    // Métodos abstractos
    public abstract void dibujar();
    
    // Métodos concretos
    public void establecerColor(String color) {
        this.color = color;
        System.out.println("Color establecido a: " + this.color);
    }
    
    public void mostrar() {
        this.visible = true;
        System.out.println("La forma " + this.nombre + " ahora es visible");
    }
    
    public void ocultar() {
        this.visible = false;
        System.out.println("La forma " + this.nombre + " ahora está oculta");
    }
    
    // Getters y Setters
    public String getColor() {
        return color;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean isVisible() {
        return visible;
    }
}
