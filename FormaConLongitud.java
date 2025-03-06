/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaformas;

/**
 *
 * 
 */
public abstract class FormaConLongitud extends Formas {
     // Constructor
    public FormaConLongitud() {
        super();
    }
    
    public FormaConLongitud(String color, String nombre) {
        super(color, nombre);
    }
    
    // Método abstracto para calcular longitud
    public abstract double calcularLongitud();
}

