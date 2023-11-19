/**
*
* Escribe un programa que permita ir introduciendo una serie indeterminada de números mientras su suma no supere el valor 10000. 
* Cuando esto último ocurra, se debe mostrar el total acumulado, el contador de los números introducidos y la media.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio23 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        //Desclarar variables
        double numero = 0;
        double suma = 0;
        double media;
        int contador = 0;
        boolean continuar = true;

        //Descripción del programa 
        System.out.println("Este programa va a sumar una serie de números mientras que el valor no supere 10000.");
        System.out.println("Después, te presenta el resultado de la suma y la media.");
        System.out.print("Introduce un número: ");

        //Entrada y comprobación de datos
        
        while (continuar) {
            numero = s.nextDouble();

            if ((suma + numero) >= 10000) {
                continuar = false;
            } else {
                contador++;
                suma += numero;
            }
        }
        s.close();

        media = suma/contador;

        //Resolución del problema999
        System.out.printf("La suma de los números es %.2f.\n", suma);
        System.out.printf("La media de los números es %.2f.\n", media);

    }
}
