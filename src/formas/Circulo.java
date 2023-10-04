package formas;

import static funcionamiento.colores.*;
import java.util.Scanner;
import funcionamiento.funcion;

public class Circulo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double radio = funcion.RadioCirculo(leer);
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = Math.PI * radio;
        double diagonal = 2 * radio;
        
        funcion.DatosCirculo(radio, area, perimetro, diagonal);
        funcion.DibujarCirculo(radio, AMARILLO);

        leer.close();
    }



}

/**
 * @author Nicolay Chiazzaro
 *
 */