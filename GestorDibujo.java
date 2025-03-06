/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaformas;

/**
 *
 * 
 */
public class GestorDibujo {
    // Método para dibujar una forma
    public static void dibujar(Formas forma) {
        System.out.println("=== Iniciando proceso de dibujo ===");
        System.out.println("Forma: " + forma.getNombre());
        System.out.println("Color: " + forma.getColor());
        forma.dibujar();
        System.out.println("=== Proceso de dibujo finalizado ===");
        System.out.println();
    }
    
    // Método para mostrar información de área
    public static void mostrarInfoArea(FormaConArea forma) {
        System.out.println("=== Información de area ===");
        System.out.println("Forma: " + forma.getNombre());
        System.out.println("Área: " + forma.calcularArea());
        System.out.println("=========================");
        System.out.println();
    }
    
    // Método para mostrar información de longitud
    public static void mostrarInfoLongitud(FormaConLongitud forma) {
        System.out.println("=== Información de longitud ===");
        System.out.println("Forma: " + forma.getNombre());
        System.out.println("Longitud: " + forma.calcularLongitud());
        System.out.println("==============================");
        System.out.println();
    }
}
