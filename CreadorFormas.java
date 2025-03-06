/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaformas;

import java.util.Scanner;

/**
 *
 * 
 */
public class CreadorFormas {
  private static final Scanner scanner = new Scanner(System.in);
    
    // Método para crear un círculo con datos del usuario
    public static Circulo crearCirculo() {
        System.out.println("\n=== Creando un Circulo ===");
        System.out.print("Ingrese el radio: ");
        double radio = obtenerNumeroPositivo();
        
        System.out.print("Ingrese el color: ");
        String color = scanner.nextLine();
        
        return new Circulo(radio, color);
    }
    
    // Método para crear una línea con datos del usuario
    public static Linea crearLinea() {
        System.out.println("\n=== Creando una Linea ===");
        System.out.print("Ingrese el largo: ");
        double largo = obtenerNumeroPositivo();
        
        System.out.print("Ingrese el color: ");
        String color = scanner.nextLine();
        
        System.out.print("Ingrese el estilo (solido, punteado, etc.): ");
        String estilo = scanner.nextLine();
        
        return new Linea(largo, color, estilo);
    }
    
    // Método para crear un triángulo con datos del usuario
    public static Triangulo crearTriangulo() {
        System.out.println("\n=== Creando un Triangulo ===");
        System.out.print("Ingrese la base: ");
        double base = obtenerNumeroPositivo();
        
        System.out.print("Ingrese la altura: ");
        double altura = obtenerNumeroPositivo();
        
        System.out.print("Ingrese el ángulo: ");
        double angulo = obtenerNumeroPositivo();
        
        System.out.print("Ingrese el color: ");
        String color = scanner.nextLine();
        
        return new Triangulo(base, altura, angulo, color);
    }
    
    // Método para crear un cuadrado con datos del usuario
    public static Cuadrado crearCuadrado() {
        System.out.println("\n=== Creando un Cuadrado ===");
        System.out.print("Ingrese el lado: ");
        double lado = obtenerNumeroPositivo();
        
        System.out.print("Ingrese el color: ");
        String color = scanner.nextLine();
        
        return new Cuadrado(lado, color);
    }
    
    // Método para obtener un número positivo con validación
    private static double obtenerNumeroPositivo() {
        double numero = -1;
        boolean valido = false;
        
        while (!valido) {
            try {
                String input = scanner.nextLine();
                numero = Double.parseDouble(input);
                
                if (numero <= 0) {
                    System.out.print("Por favor, ingrese un numero positivo: ");
                } else {
                    valido = true;
                }
            } catch (NumberFormatException e) {
                System.out.print("Entrada invalida. Por favor, ingrese un numero: ");
            }
        }
        
        return numero;
    }   
}
