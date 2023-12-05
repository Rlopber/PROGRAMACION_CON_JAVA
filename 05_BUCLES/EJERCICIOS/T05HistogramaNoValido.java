/**
*
* Ejercicio que pida por teclado un carácter y, a continuación, una serie de números enteros (de 0 en adelante) hasta que se introduzca un número negativo. 
* A continuación se mostrará una tabla donde en la primera columna aparecerán los números introducidos 
* y en cada fila aparecerá repetido el carácter introducido tantas veces como indique la primera columna.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05HistogramaNoValido {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        //Declarar variables
        boolean continuar = true;

        //Descripción del programa y entrada de datos
        System.out.println("Este programa te va a representar una serie de números en carácteres.");
        System.out.print("Introduzca un carácter: ");
        char caracter = s.next().charAt(0);
        System.out.println("Introduzca números enteros positivos. Cuando no quiera introducir más números, introduzca un número negativo.");
        System.out.println("");

        try {
            while (continuar) {
                try {
                    int numero = s.nextInt();
                    if (numero > 0) {
                        System.out.print("|" + " ");
                        for (int i = 0; i < numero; i++) {
                            System.out.print(caracter + " ");
                        }
                        System.out.println();
                    } else {
                        continuar = false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Ingresa un número entero válido.");
                }
            }
        } finally {
            s.close(); // Cierra el Scanner al finalizar
        }
    }
}