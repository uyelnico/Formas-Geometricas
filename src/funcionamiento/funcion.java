package funcionamiento;

import static funcionamiento.colores.*;

import java.util.Scanner;

public class funcion {

// Cuadrado
    public static double TamañoCuadrado(Scanner leer) {
    	double num;
        do {
            System.out.print("Ingrese el tamaño (número positivo) para el Cuadrado: ");
            while (!leer.hasNextDouble()) {
                System.out.print("Ingrese un valor numérico válido: ");
                leer.next();
            }
            num = leer.nextDouble();
        } while (num <= 0);
        return num;
    }
    // Tamaño, Area, Perimetro y Diagonal del Cuadrado
    
    public static void DatosCuadrado(double tamaño, double area, double perimetro, double diagonal) {
        
        String tamañoDefinitivo = (tamaño % 1 == 0) ? String.valueOf((int) tamaño) : String.valueOf(tamaño);
        String areaDefinitiva = (area % 1 == 0) ? String.valueOf((int) area) : String.valueOf(area);
        String perimetroDefinitivo = (perimetro % 1 == 0) ? String.valueOf((int) perimetro) : String.valueOf(perimetro);
        String diagonalDefinitiva = (diagonal % 1 == 0) ? String.valueOf((int) diagonal) : String.valueOf(diagonal);
        
        System.out.println("Un Cuadrado de tamaño: " + tamañoDefinitivo);
        System.out.println("Con un area de: " + areaDefinitiva);
        System.out.println("Con un perimetro de: " + perimetroDefinitivo);
        System.out.println("Con una diagonal de: " + diagonalDefinitiva);

    }
    
    public static void DibujarCuadrado(double tamaño, String color) {
        for (int x = 1; x <= tamaño; ++x) {
            for (int y = 1; y <= tamaño; ++y) {
                System.out.print(color + "  " + color + RESET);
            }
            System.out.println();
        }
    }

// Rectangulo
    
    //Altura
    public static double AltoRectangulo(Scanner leer) {
    	double alto;
        do {
            System.out.print("Ingrese el alto (número positivo) para el Rectangulo: ");
            while (!leer.hasNextDouble()) {
                System.out.print("Ingrese un valor numérico válido: ");
                leer.next();
            }
            alto = leer.nextDouble();
        } while (alto <= 0);
        return alto;
    }
    
   // Ancho 
    public static double AnchoaRectangulo(Scanner leer) {
    	double ancho;
        do {
            System.out.print("Ingrese el ancho (número positivo) para el Rectangulo: ");
            while (!leer.hasNextDouble()) {
                System.out.print("Ingrese un valor numérico válido: ");
                leer.next();
            }
            ancho = leer.nextDouble();
        } while (ancho <= 0);
        return ancho;
    }
    
    // Tamaño, Area, Perimetro y Diagonal del Rectangulo
    
    public static void DatosRectangulo(double tamaño, double area, double perimetro, double diagonal) {
        
        String tamañoDefinitivo = (tamaño % 1 == 0) ? String.valueOf((int) tamaño) : String.valueOf(tamaño);
        String areaDefinitiva = (area % 1 == 0) ? String.valueOf((int) area) : String.valueOf(area);
        String perimetroDefinitivo = (perimetro % 1 == 0) ? String.valueOf((int) perimetro) : String.valueOf(perimetro);
        String diagonalDefinitiva = (diagonal % 1 == 0) ? String.valueOf((int) diagonal) : String.valueOf(diagonal);
        
        System.out.println("Un Rectangulo de tamaño: " + tamañoDefinitivo);
        System.out.println("Con un area de: " + areaDefinitiva);
        System.out.println("Con un perimetro de: " + perimetroDefinitivo);
        System.out.println("Con una diagonal de: " + diagonalDefinitiva);

    }
 
    public static void DibujarRectangulo(double alto, double ancho, String color) {
        for (int x = 1; x <= alto; ++x) {
            for (int y = 1; y <= ancho; ++y) {
                System.out.print(color + "  " + color + RESET);
            }
            System.out.println();
        }
    } 
    
// Triangulo Escaleno
    
    public static double TamañoTrianguloEscaleno(Scanner leer) {
    	double num;
        do {
            System.out.print("Ingrese el tamaño (número positivo) para el Triángulo Escaleno: ");
            while (!leer.hasNextDouble()) {
                System.out.print("Ingrese un valor numérico válido: ");
                leer.next();
            }
            num = leer.nextDouble();
        } while (num <= 0);
        return num;
    }
    
    // Tamaño, Area, Perimetro y Diagonal del Triangulo Escaleno
    public static void DatosTrianguloEscaleno(double tamaño, double area, double perimetro, double diagonal) {
    	
        String tamañoDefinitivo = (tamaño % 1 == 0) ? String.valueOf((int) tamaño) : String.valueOf(tamaño);
        String areaDefinitiva = (area % 1 == 0) ? String.valueOf((int) area) : String.valueOf(area);
        String perimetroDefinitivo = (perimetro % 1 == 0) ? String.valueOf((int) perimetro) : String.valueOf(perimetro);
        String diagonalDefinitiva = (diagonal % 1 == 0) ? String.valueOf((int) diagonal) : String.valueOf(diagonal);
        
        System.out.println("Un Triangulo Escaleno de tamaño: " + tamañoDefinitivo);
        System.out.println("Con un area de: " + areaDefinitiva);
        System.out.println("Con un perimetro de: " + perimetroDefinitivo);
        System.out.println("Con una diagonal de: " + diagonalDefinitiva);
    	
    }
    
    public static void DibujarTrianguloEscaleno(double tamaño, String color) {
        for (int x = 1; x <= tamaño; ++x) {
            for (int y = 1; y <= x; ++y) {
                System.out.print(color + " " + color + RESET);
            }
            System.out.println();
        }
    
    }

// Circulo
    
    public static double RadioCirculo(Scanner leer) {
    	double radio;
        do {
            System.out.print("Ingrese el radio (número positivo) para el Circulo: ");
            while (!leer.hasNextDouble()) {
                System.out.print("Ingrese un valor numérico válido: ");
                leer.next();
            }
            radio = leer.nextDouble();
        } while (radio <= 0);
        return radio;
    
}  
    
    public static void DatosCirculo(double radio, double area, double perimetro, double diagonal) {
    	
        String radioDefinitivo = (radio % 1 == 0) ? String.valueOf((int) radio) : String.valueOf(radio);
        String areaDefinitiva = (area % 1 == 0) ? String.valueOf((int) area) : String.valueOf(area);
        String perimetroDefinitivo = (perimetro % 1 == 0) ? String.valueOf((int) perimetro) : String.valueOf(perimetro);
        String diagonalDefinitiva = (diagonal % 1 == 0) ? String.valueOf((int) diagonal) : String.valueOf(diagonal);
        
        System.out.println("Un Circulo de radio: " + radioDefinitivo);
        System.out.println("Con un area de: " + areaDefinitiva);
        System.out.println("Con un perimetro de: " + perimetroDefinitivo);
        System.out.println("Con una diagonal de: " + diagonalDefinitiva);
    	
    }
    
    public static void DibujarCirculo(double radio, String color) {
        for (double y = -radio; y <= radio; y++) {
            for (double x = -radio; x <= radio; x++) {
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