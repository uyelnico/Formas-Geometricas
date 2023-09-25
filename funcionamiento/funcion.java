package funcionamiento;

import static funcionamiento.colores.*;

import java.util.Scanner;

public class funcion {

// Cuadrado
    public static int TamañoCuadrado(Scanner leer) {
    	int num;
        do {
            System.out.print("Ingrese el tamaño (número positivo) para el Cuadrado: ");
            while (!leer.hasNextInt()) {
                System.out.print("Ingrese un valor numérico válido: ");
                leer.next();
            }
            num = leer.nextInt();
        } while (num <= 0);
        return num;
    }
    public static void DibujarCuadrado(int num, String color) {
        for (int x = 1; x <= num; ++x) {
            for (int y = 1; y <= num; ++y) {
                System.out.print(color + "  " + color + RESET);
            }
            System.out.println();
        }
    }

// Rectangulo
    
    //Altura
    public static int AltoRectangulo(Scanner leer) {
    	int alto;
        do {
            System.out.print("Ingrese el alto (número positivo) para el Rectangulo: ");
            while (!leer.hasNextInt()) {
                System.out.print("Ingrese un valor numérico válido: ");
                leer.next();
            }
            alto = leer.nextInt();
        } while (alto <= 0);
        return alto;
    }
    
   // Ancho 
    public static int AnchoaRectangulo(Scanner leer) {
    	int ancho;
        do {
            System.out.print("Ingrese el ancho (número positivo) para el Rectangulo: ");
            while (!leer.hasNextInt()) {
                System.out.print("Ingrese un valor numérico válido: ");
                leer.next();
            }
            ancho = leer.nextInt();
        } while (ancho <= 0);
        return ancho;
    }
 
    public static void DibujarRectangulo(int alto, int ancho, String color) {
        for (int x = 1; x <= alto; ++x) {
            for (int y = 1; y <= ancho; ++y) {
                System.out.print(color + "  " + color + RESET);
            }
            System.out.println();
        }
    }
    
    
// Triangulo Escaleno
    
    public static int TamañoTrianguloEscaleno(Scanner leer) {
    	int num;
        do {
            System.out.print("Ingrese el tamaño (número positivo) para el Triángulo Escaleno: ");
            while (!leer.hasNextInt()) {
                System.out.print("Ingrese un valor numérico válido: ");
                leer.next();
            }
            num = leer.nextInt();
        } while (num <= 0);
        return num;
    }
    public static void DibujarTrianguloEscaleno(int num, String color) {
        for (int x = 1; x <= num; ++x) {
            for (int y = 1; y <= x; ++y) {
                System.out.print(color + " " + color + RESET);
            }
            System.out.println();
        }
    
    }

// Circulo
    
    public static int RadioCirculo(Scanner leer) {
    	int radio;
        do {
            System.out.print("Ingrese el radio (número positivo) para el Circulo: ");
            while (!leer.hasNextInt()) {
                System.out.print("Ingrese un valor numérico válido: ");
                leer.next();
            }
            radio = leer.nextInt();
        } while (radio <= 0);
        return radio;
    
}  
    public static void DibujarCirculo(int radio, String color) {
        for (int y = -radio; y <= radio; y++) {
            for (int x = -radio; x <= radio; x++) {
                if (x * x + y * y <= radio * radio) {
                    System.out.print(color + "  " + color);
                } else {
                    System.out.print(RESET + "  ");
                }
            }
            System.out.println();
        }
    }
    
}

/**
 * @author Nicolay Chiazzaro
 *
 */
