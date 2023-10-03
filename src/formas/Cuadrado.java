package formas;
import static funcionamiento.colores.*;
import java.util.Scanner;
import funcionamiento.funcion;

public class Cuadrado {

	    public static void main(String[] args) {
	        Scanner leer = new Scanner(System.in);

	        double tamaño = funcion.TamañoCuadrado(leer);
	        double area = tamaño*tamaño;
	        double perimetro = 4*tamaño;
	        double diagonal = tamaño * Math.sqrt(2);
	        
	        String tamañoDefinitivo = (tamaño % 1 == 0) ? String.valueOf((int) tamaño) : String.valueOf(tamaño);
	        String areaDefinitiva = (area % 1 == 0) ? String.valueOf((int) area) : String.valueOf(area);
	        String perimetroDefinitivo = (perimetro % 1 == 0) ? String.valueOf((int) perimetro) : String.valueOf(perimetro);
	        String diagonalDefinitiva = (diagonal % 1 == 0) ? String.valueOf((int) diagonal) : String.valueOf(diagonal);

	        funcion.DibujarCuadrado(tamaño, ROJO);

	        System.out.println("Un Cuadrado de tamaño: " + tamañoDefinitivo);
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