package formas;

import static funcionamiento.colores.*;
import java.util.Scanner;
import funcionamiento.funcion;

public class TrianguloEscaleno {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num = funcion.TamañoTrianguloEscaleno(leer);

       funcion.DibujarTrianguloEscaleno(num, VERDE);

        System.out.println("Un Triángulo Escaleno de tamaño: " + num);

        leer.close();
    }
}

/**
 * @author Nicolay Chiazzaro
 *
 */
