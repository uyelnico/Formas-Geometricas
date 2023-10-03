package formas;

import static funcionamiento.colores.*;
import java.util.Scanner;
import funcionamiento.funcion;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double alto = funcion.AltoRectangulo(leer);
        double ancho = funcion.AnchoaRectangulo(leer);
        double area = alto*ancho;
        double perimetro = 2*(alto + ancho);
        double diagonal = Math.sqrt(Math.pow(alto, 2) + Math.pow(ancho, 2));
        
        String altoDefinitivo = (alto % 1 == 0) ? String.valueOf((int) alto) : String.valueOf(alto);
        String anchoDefinitivo = (ancho % 1 == 0) ? String.valueOf((int) ancho) : String.valueOf(ancho);
        String areaDefinitiva = (area % 1 == 0) ? String.valueOf((int) area) : String.valueOf(area);
        String perimetroDefinitivo = (perimetro % 1 == 0) ? String.valueOf((int) perimetro) : String.valueOf(perimetro);
        String diagonalDefinitiva = (diagonal % 1 == 0) ? String.valueOf((int) diagonal) : String.valueOf(diagonal);
        
       funcion.DibujarRectangulo(alto, ancho, AZUL);

        System.out.println("Un Rectangulo de alto: " + altoDefinitivo);
        System.out.println("Un Rectangulo de ancho: " + anchoDefinitivo);
        System.out.println("Con un area de: " + areaDefinitiva);
        System.out.println("Con un perimetro de: " + perimetroDefinitivo);
        System.out.println("Con una diagonal de: " + diagonalDefinitiva);
        
        
        leer.close();
    }
}

/**
 * @author Nicolay Chiazzaro
 *
 */