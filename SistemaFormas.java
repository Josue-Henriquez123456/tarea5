/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaformas;

/**
 *
 * 
 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class SistemaFormas {
private static final Scanner scanner = new Scanner(System.in);
    private static final List<Formas> formas = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try (scanner) {
        System.out.println("¡Bienvenido al Sistema Interactivo de Formas!");
        boolean continuar = true;
        
        while (continuar) {
            mostrarMenu();
            int opcion = obtenerOpcion();
            
            switch (opcion) {
                case 1 -> crearForma();
                case 2 -> mostrarFormas();
                case 3 -> dibujarForma();
                case 4 -> mostrarInfoForma();
                case 5 -> cambiarVisibilidad();
                case 6 -> cambiarColor();
                case 7 -> {
                    continuar = false;
                    System.out.println("¡Gracias por usar el Sistema de Formas! ¡Hasta pronto!");
                }
                default -> System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }
    }
    }
    
    private static void mostrarMenu() {
        System.out.println("\n==== MENU PRINCIPAL ====");
        System.out.println("1. Crear una nueva forma");
        System.out.println("2. Mostrar todas las formas");
        System.out.println("3. Dibujar una forma");
        System.out.println("4. Mostrar informacion de una forma");
        System.out.println("5. Cambiar visibilidad de una forma");
        System.out.println("6. Cambiar color de una forma");
        System.out.println("7. Salir");
        System.out.print("Ingrese su opcion: ");
    }
    
    private static int obtenerOpcion() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    
    private static void crearForma() {
        System.out.println("\n=== CREAR FORMA ===");
        System.out.println("1. Circulo");
        System.out.println("2. Linea");
        System.out.println("3. Triangulo");
        System.out.println("4. Cuadrado");
        System.out.println("5. Volver al menu principal");
        System.out.print("Seleccione el tipo de forma: ");
        
        int opcion = obtenerOpcion();
        Formas nuevaForma = null;
        
        switch (opcion) {
            case 1 -> nuevaForma = CreadorFormas.crearCirculo();
            case 2 -> nuevaForma = CreadorFormas.crearLinea();
            case 3 -> nuevaForma = CreadorFormas.crearTriangulo();
            case 4 -> nuevaForma = CreadorFormas.crearCuadrado();
            case 5 -> {
                return;
        }
            default -> {
                System.out.println("Opcion no valida.");
                return;
        }
        }
        
        if (nuevaForma != null) {
            formas.add(nuevaForma);
            System.out.println("¡Forma creada y agregada con exito!");
        }
    }
    
    private static void mostrarFormas() {
        if (formas.isEmpty()) {
            System.out.println("No hay formas creadas.");
            return;
        }
        
        System.out.println("\n=== FORMAS DISPONIBLES ===");
        for (int i = 0; i < formas.size(); i++) {
            Formas forma = formas.get(i);
            System.out.println((i + 1) + ". " + forma.getNombre() + " - Color: " + 
                               forma.getColor() + " - Visible: " + (forma.isVisible() ? "Si" : "No"));
        }
    }
    
    private static int seleccionarForma() {
        mostrarFormas();
        if (formas.isEmpty()) {
            return -1;
        }
        
        System.out.print("Seleccione el numero de la forma: ");
        try {
            int indice = Integer.parseInt(scanner.nextLine()) - 1;
            if (indice >= 0 && indice < formas.size()) {
                return indice;
            } else {
                System.out.println("Numero de forma invalido.");
                return -1;
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida.");
            return -1;
        }
    }
    
    private static void dibujarForma() {
        int indice = seleccionarForma();
        if (indice >= 0) {
            GestorDibujo.dibujar(formas.get(indice));
        }
    }
    
    private static void mostrarInfoForma() {
        int indice = seleccionarForma();
        if (indice < 0) {
            return;
        }
        
        Formas forma = formas.get(indice);
        System.out.println("\n=== INFORMACION DETALLADA ===");
        System.out.println("Nombre: " + forma.getNombre());
        System.out.println("Color: " + forma.getColor());
        System.out.println("Visible: " + (forma.isVisible() ? "Si" : "No"));
        
    switch (forma) {
        case FormaConArea formaConArea -> {
            GestorDibujo.mostrarInfoArea(formaConArea);
            
            switch (forma) {
                case Circulo circulo -> {
                    System.out.println("Radio: " + circulo.getRadio());
                    System.out.println("Circunferencia: " + circulo.calcularCircunferencia());
                }
                case Triangulo triangulo -> {
                    System.out.println("Base: " + triangulo.getBase());
                    System.out.println("Altura: " + triangulo.getAltura());
                    System.out.println("Angulo: " + triangulo.getAngulo());
                    System.out.println("Perimetro: " + triangulo.calcularPerimetro());
                }
                case Cuadrado cuadrado -> {
                    System.out.println("Lado: " + cuadrado.getLado());
                    System.out.println("Perimetro: " + cuadrado.calcularPerimetro());
                }
                default -> {
                }
            }
        }
        case FormaConLongitud formaConLongitud -> {
            GestorDibujo.mostrarInfoLongitud(formaConLongitud);
            
            if (forma instanceof Linea linea) {
                System.out.println("Largo: " + linea.getLargo());
                System.out.println("Estilo: " + linea.getEstilo());
            }
        }
        default -> {
        }
    }
    }
    
    private static void cambiarVisibilidad() {
        int indice = seleccionarForma();
        if (indice < 0) {
            return;
        }
        
        Formas forma = formas.get(indice);
        System.out.println("\n=== CAMBIAR VISIBILIDAD ===");
        System.out.println("1. Mostrar");
        System.out.println("2. Ocultar");
        System.out.print("Seleccione una opcion: ");
        
        int opcion = obtenerOpcion();
        switch (opcion) {
            case 1 -> forma.mostrar();
            case 2 -> forma.ocultar();
            default -> System.out.println("Opcion no valida.");
        }
    }
    
    private static void cambiarColor() {
        int indice = seleccionarForma();
        if (indice < 0) {
            return;
        }
        
        Formas forma = formas.get(indice);
        System.out.print("Ingrese el nuevo color: ");
        String nuevoColor = scanner.nextLine();
        forma.establecerColor(nuevoColor);
    }
}