/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaformas;

/**
 *
 * 
 */
public class Linea extends FormaConLongitud {
    // Propiedades
    private double largo;
    private String estilo; // sólido, punteado, etc.
    
    // Constructor
    public Linea() {
        super();
        this.largo = 0.0;
        this.estilo = "solido";
        this.setNombre("Linea");
    }
    
    public Linea(double largo, String color, String estilo) {
        super(color, "Linea");
        this.largo = largo;
        this.estilo = estilo;
    }
    
    // Métodos
    @Override
    public void dibujar() {
        if (!isVisible()) {
            System.out.println("No se puede dibujar: la linea está oculta");
            return;
        }
        System.out.println("Dibujando una Linea " + this.estilo + " de color " + this.color);
    }
    
    @Override
    public double calcularLongitud() {
        return this.largo;
    }
    
    // Setter y Getter para largo
    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    public double getLargo() {
        return largo;
    }
    
    // Setter y Getter para estilo
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    
    public String getEstilo() {
        return estilo;
    }
    }

