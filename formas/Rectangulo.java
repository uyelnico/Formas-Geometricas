package formas;

import static funcionamiento.colores.*;
import java.util.Scanner;
import funcionamiento.funcion;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int alto = funcion.AltoRectangulo(leer);
        int ancho = funcion.AnchoaRectangulo(leer);

       funcion.DibujarRectangulo(alto, ancho, AZUL);

        System.out.println("Un Rectangulo de alto: " + alto);
        System.out.println("Un Rectangulo de ancho: " + ancho);
        
        leer.close();
    }
}