package formas;

import static funcionamiento.colores.*;
import java.util.Scanner;
import funcionamiento.funcion;

public class Triangulo {

	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double tamaño = funcion.TamañoTriangulo(leer);
        double area = (tamaño * tamaño) / 2;
        double diagonal = Math.sqrt(2 * tamaño * tamaño);
        double perimetro = 2 * tamaño + diagonal;
        
        funcion.DatosTriangulo(tamaño, area, perimetro, diagonal);
       funcion.DibujarTriangulo(tamaño, VIOLETA);


        leer.close();
    }
}

/**
 * @author Nicolay Chiazzaro
 *
 */
