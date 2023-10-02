### IMPORTANTE

Hola! Lo que va el proyecto de **Formas-Geometricas** es que, compartiré como hice un programa para hacer/crear formas geometricas (como cuadrados, recangulos, etc) personalizables con el código **Java**. Aviso que el código tanto como el proyecto se van a ir avanzando con el tiempo, lo mismo, que encontrar formas mas optimizables e efectivas a la hora de crear un código. Espero que con el programa que estoy creando te sea de ayuda, cualquier duda/pregunta que tengas podes hacerlo en mi Instagram **@uy.elnico**

![image](https://github.com/uyelnico/Login/assets/145890121/f5fe4947-89d2-40a1-8ff9-93c85962355a)

## Formas Geometricas

![image](https://github.com/uyelnico/Formas-Geometricas/assets/145890121/85a75fb9-9cdc-4666-9e0f-b1d3f6419410)

![image](https://github.com/uyelnico/Formas-Geometricas/assets/145890121/c6d10247-2685-43f3-b718-d50de1d5970f)
![image](https://github.com/uyelnico/Formas-Geometricas/assets/145890121/ade9f0c0-6ad0-42d5-bb56-091ba8081c43)
![image](https://github.com/uyelnico/Formas-Geometricas/assets/145890121/8418f944-4327-4ff4-ac8e-62c00a49efa4)
![image](https://github.com/uyelnico/Formas-Geometricas/assets/145890121/8e733a9d-2fe2-4aac-a014-1e7bd49e7651)

## Packages

```java
package funcionamiento; // Carpeta en donde esta para que funcione el código (para el inicio de código, color de las formas, etc)
package formas; // Carpeta de las formas por clase (Tamaño, Dibujarlo, Radio, etc)
```

## Import

**Dentro del package Funcionamiento**
```java
package funcionamiento;
import static funcionamiento.colores.*; // Los colores para la forma
import java.util.Scanner; // Scanner para que puedas escribir lo que te pide el código (tamaño, alto, ancho, radio, etc) dependiendo de la forma elegida
```

**Dentro del package Formas**

```java
package formas; //
import static funcionamiento.colores.*; // Llamamos la carpeta de funcionamiento para que pueda establecer los colores de la forma
import java.util.Scanner; // Scanner para que puedas escribir lo que te pide el código (tamaño, alto, ancho, radio, etc) dependiendo de la forma elegida
import funcionamiento.funcion; // LLamamos la carpeta de funcionamiento para que pueda ejecutarse cada forma
```

### funcionamiento

En este `package`, es en donde creamos para el funcionamiento por clases publicas y que hagan lo que pide, en este caso, como las formas geometricas.

![image](https://github.com/uyelnico/Formas-Geometricas/assets/145890121/752c3582-3fd9-4a72-903d-1fe99a2f25e4)

## colores.java

En este caso, usamos **ASCII** para poner los colores, que en este caso son **background**, tienen la pagina web para que vean y eligan a su gusto [ascii-code.com](https://www.ascii-code.com/html-color-names). Hice esto para que las formas geometricas se vean mas esteticas y bien formadas.

```java
public class colores {
	
    public static final String RESET = "\u001B[0m"; // Resetear y ponerlo como se ve normalmente

    public static final String ROJO = "\033[0;101m"; // Background de color Rojo
    public static final String VERDE = "\033[0;102m"; // Background de color Verde
    public static final String AMARILLO = "\033[0;103m"; // Background de color Amarillo
    public static final String AZUL = "\033[0;104m"; // Background de color Azul
	
}
```

## funcion.java

```java
public class funcion {

// Cuadrado
    public static int TamañoCuadrado(Scanner leer) {
    	int num;
        do {
            System.out.print("Ingrese el tamaño (número positivo) para el Cuadrado: ");
            while (!leer.hasNextInt()) {
                System.out.print("Ingrese un valor numérico válido: ");
                leer.next();
            }
            num = leer.nextInt();
        } while (num <= 0);
        return num;
    }
    public static void DibujarCuadrado(int num, String color) {
        for (int x = 1; x <= num; ++x) {
            for (int y = 1; y <= num; ++y) {
                System.out.print(color + "  " + color + RESET);
            }
            System.out.println();
        }
    }

// Rectangulo
    
    //Altura
    public static int AltoRectangulo(Scanner leer) {
    	int alto;
        do {
            System.out.print("Ingrese el alto (número positivo) para el Rectangulo: ");
            while (!leer.hasNextInt()) {
                System.out.print("Ingrese un valor numérico válido: ");
                leer.next();
            }
            alto = leer.nextInt();
        } while (alto <= 0);
        return alto;
    }
    
   // Ancho 
    public static int AnchoaRectangulo(Scanner leer) {
    	int ancho;
        do {
            System.out.print("Ingrese el ancho (número positivo) para el Rectangulo: ");
            while (!leer.hasNextInt()) {
                System.out.print("Ingrese un valor numérico válido: ");
                leer.next();
            }
            ancho = leer.nextInt();
        } while (ancho <= 0);
        return ancho;
    }
 
    public static void DibujarRectangulo(int alto, int ancho, String color) {
        for (int x = 1; x <= alto; ++x) {
            for (int y = 1; y <= ancho; ++y) {
                System.out.print(color + "  " + color + RESET);
            }
            System.out.println();
        }
    }
    
    
// Triangulo Escaleno
    
    public static int TamañoTrianguloEscaleno(Scanner leer) {
    	int num;
        do {
            System.out.print("Ingrese el tamaño (número positivo) para el Triángulo Escaleno: ");
            while (!leer.hasNextInt()) {
                System.out.print("Ingrese un valor numérico válido: ");
                leer.next();
            }
            num = leer.nextInt();
        } while (num <= 0);
        return num;
    }
    public static void DibujarTrianguloEscaleno(int num, String color) {
        for (int x = 1; x <= num; ++x) {
            for (int y = 1; y <= x; ++y) {
                System.out.print(color + " " + color + RESET);
            }
            System.out.println();
        }
    
    }

// Circulo
    
    public static int RadioCirculo(Scanner leer) {
    	int radio;
        do {
            System.out.print("Ingrese el radio (número positivo) para el Circulo: ");
            while (!leer.hasNextInt()) {
                System.out.print("Ingrese un valor numérico válido: ");
                leer.next();
            }
            radio = leer.nextInt();
        } while (radio <= 0);
        return radio;
    
}  
    public static void DibujarCirculo(int radio, String color) {
        for (int y = -radio; y <= radio; y++) {
            for (int x = -radio; x <= radio; x++) {
                if (x * x + y * y <= radio * radio) {
                    System.out.print(color + "  " + color);
                } else {
                    System.out.print(RESET + "  ");
                }
            }
            System.out.println();
        }
    }
    
}
```

### formas

En este `package` es en donde se ejecutaran las formas geometricas dentro de la carpeta.

![image](https://github.com/uyelnico/Formas-Geometricas/assets/145890121/b37fc551-1d69-4774-bba0-784ca23531ae)



Proximamente la explicación, pero antes... los códigos estan dentro del proyecto, por si gustan ver.

`Author: Nicolay_Chiazzaro`
