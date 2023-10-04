package formas;

import static funcionamiento.colores.*;
import java.util.Scanner;
import funcionamiento.funcion;

public class TrianguloEscaleno {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double tamaño = funcion.TamañoTrianguloEscaleno(leer);
        double area = (Math.sqrt(3) / 4) * Math.pow(tamaño, 2);
        double perimetro = 3 * tamaño;
        double diagonal = tamaño * Math.sqrt(2);
        
        funcion.DatosTrianguloEscaleno(tamaño, area, perimetro, diagonal);
       funcion.DibujarTrianguloEscaleno(tamaño, VERDE);


        leer.close();
    }
}

/**
 * @author Nicolay Chiazzaro
 *
 */