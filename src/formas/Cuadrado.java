package formas;
import static funcionamiento.colores.*;
import java.util.Scanner;
import funcionamiento.funcion;

public class Cuadrado {

	    public static void main(String[] args) {
	        Scanner leer = new Scanner(System.in);
	        double tamaño = funcion.TamañoCuadrado(leer);
	        double area = tamaño * tamaño;
	        double perimetro = 4 * tamaño;
	        double diagonal = tamaño * Math.sqrt(2);
	        
	        funcion.DatosCuadrado(tamaño, area, perimetro, diagonal);
	        funcion.DibujarCuadrado(tamaño, ROJO);


	        leer.close();
	    }



	}

/**
 * @author Nicolay Chiazzaro
 *
 */