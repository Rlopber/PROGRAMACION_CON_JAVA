/**
*
* Escribe un programa que pida un número entero positivo por teclado 
* y que muestre a continuación los 5 números consecutivos a partir del número introducido. 
* Al lado de cada número se debe indicar si se trata de un primo o no.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio42 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        //Declarar variables
        boolean esPrimo = true;

        //Descripción del programa y entrada de datos

        System.out.print("Por favor, introduzca un número entero positivo: ");
        int numeroIntroducido = s.nextInt();

        while (numeroIntroducido <= 0) {
            System.out.println("El número introducido no es válido. Introduzca otro número.");
            numeroIntroducido = s.nextInt();
        }
        s.close();

        //Comprobación si son primos.
        int contador = numeroIntroducido + 5;

        for (int i = numeroIntroducido; i < contador; i++) {

            if (i <= 1) {
                esPrimo = false;
            } else if (i == 2) {
                // 2 es primo
            } else if (i % 2 == 0) {
                esPrimo = false;
            } else {
                for (int j = 3; j <= Math.sqrt(i); j += 2) {
                    if ((i % j) == 0) {
                        esPrimo = false;
                    }
                }
            }

        //Resolución del problema
            if (esPrimo == true) {
                System.out.println(numeroIntroducido + " es primo.");
            } else {
                System.out.println(numeroIntroducido + " no es primo.");
            }
        
        numeroIntroducido++;
        esPrimo = true;
        }
    }
}
