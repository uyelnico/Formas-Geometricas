package formas;

import static funcionamiento.colores.*;
import java.util.Scanner;
import funcionamiento.funcion;

public class Circulo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int radio = funcion.RadioCirculo(leer);

        funcion.DibujarCirculo(radio, AMARILLO);

        System.out.println("Un Circulo de radio: " + radio);

        leer.close();
    }



}

/**
 * @author Nicolay Chiazzaro
 *
 */
