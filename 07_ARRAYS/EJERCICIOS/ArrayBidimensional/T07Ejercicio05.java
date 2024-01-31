package ArrayBidimensional;

/**
*
* Realiza un programa que rellene un array de 6 filas por 10 columnas con 
* números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). 
* A continuación, el programa deberá dar la posición tanto del máximo como del mínimo.
*
* @author: Raquel Lopez
*/

public class T07Ejercicio05 {
    public static void main(String[] args) {
        
        int[][] tabla = new int[6][10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        int fila;
        int columna;
        int posicionMaxF = 0;
        int posicionMaxC = 0;
        int posicionMinF = 0;
        int posicionMinC = 0;

        for (fila = 0; fila < tabla.length; fila++) {
            for (columna = 0; columna < tabla[fila].length; columna++) {
                tabla[fila][columna] = (int)(Math.random()*1001);
                if (tabla[fila][columna] > maximo) {
                    maximo = tabla[fila][columna];
                    posicionMaxF = fila+1;
                    posicionMaxC = columna+1;
                } else if (tabla[fila][columna] < minimo) {
                    minimo = tabla[fila][columna];
                    posicionMinF = fila+1;
                    posicionMinC = columna+1;
                }
            }
        }

        System.out.printf("       ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%5d", i+1);
        }
        System.out.println();

        for (int i = 0; i < tabla.length*10-2; i++) {
            System.out.print("-");
        }
        System.out.println();

        int barra = 0;
        for (fila = 0; fila < tabla.length; fila++) {
            System.out.printf("%5d |", barra+1);
            barra++;

            for (columna = 0; columna < tabla[fila].length; columna++) {
                System.out.printf("%5d", tabla[fila][columna]);
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("El máximo es el número " + maximo + ". Se encuentra en la fila " + posicionMaxF + ", columna " + posicionMaxC + ".");
        System.out.println("El mínimo es el número " + minimo + ". Se encuentra en la fila " + posicionMinF + ", columna " + posicionMinC + ".");
    }
}