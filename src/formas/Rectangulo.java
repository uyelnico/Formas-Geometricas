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
        
       funcion.DatosRectangulo(ancho, area, perimetro, diagonal);
       funcion.DibujarRectangulo(alto, ancho, AZUL);
        
        
        leer.close();
    }
}

/**
 * @author Nicolay Chiazzaro
 *
 */