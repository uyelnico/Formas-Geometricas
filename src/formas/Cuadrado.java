package formas;
import static funcionamiento.colores.*;
import java.util.Scanner;
import funcionamiento.funcion;

public class Cuadrado {

	    public static void main(String[] args) {
	        Scanner leer = new Scanner(System.in);

	        int num = funcion.TamañoCuadrado(leer);

	        funcion.DibujarCuadrado(num, ROJO);

	        System.out.println("Un Cuadrado de tamaño: " + num);

	        leer.close();
	    }



	}

/**
 * @author Nicolay Chiazzaro
 *
 */