package ArrayBidimensional;

/**
*
* Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un array de 4 filas por 5 columnas. 
* El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. 
* La suma total debe aparecer en la esquina inferior derecha.
* Mezclado con T07EJercicio03
*
* @author: Raquel Lopez
*/

public class T07Ejercicio04 {
    public static void main(String[] args) throws InterruptedException {

        int[][] tabla = new int [4][5];
        int fila;
        int columna;

        // Rellenar el array
        for (fila = 0; fila < tabla.length; fila++) {
            for (columna = 0; columna < tabla[fila].length; columna++) {
                tabla[fila][columna] = (int)(Math.random()*900+100);
            }
        }

        //Mostrar por pantalla

        int sumaFila = 0;

        for (fila = 0; fila < tabla.length; fila++) {
            sumaFila = 0;
            System.out.print("|");
            for (columna = 0; columna < tabla[fila].length; columna++) {
                Thread.sleep(750);
                System.out.printf("%8d |", tabla[fila][columna]);
                sumaFila = sumaFila + tabla[fila][columna];
                
            }
            
            Thread.sleep(1000);
            System.out.printf(" \033[1;32m\u03A3%7d\033[0m |", sumaFila);
            System.out.println();
            for (int i = 0; i < 62; i++) {
                System.out.print("-");
            }
            System.out.println();
        }

        //Muestra las sumas parciales de las columnas

        int sumaColumna = 0;
        int sumaTotal = 0;
        System.out.print("|");
        for (columna = 0; columna < tabla[0].length; columna++) {
            sumaColumna = 0;
            for (fila = 0; fila < tabla.length; fila ++) {
                sumaColumna = sumaColumna + tabla[fila][columna];
            }

            Thread.sleep(1000);
            System.out.printf(" \033[1;32m\u03A3%6d\033[0m |", sumaColumna);
            sumaTotal += sumaColumna;
        }

        Thread.sleep(1500);
        System.out.printf(" \033[1;31mT %6d\033[0m |", sumaTotal);
    }
}
