/**
*
* Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga cuantos números se han introducido, 
* la media de los impares y el mayor de los pares. 
* El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio21 {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);

        //Desclarar variables
        int numero = 0;
        int mayorPar = 0;
        int sumaImpar = 0;
        int cantidadImpar = 0;

        //Descripción del programa y entrada de datos
        System.out.println("  \033[1;36mMEDIA DE IMPARES Y MAYOR DE LOS PARES\033[0m");
        System.out.println("========================================");
        System.out.println("Introduce los números positivos que quieras. Podrás parar introduciendo un número negativo.");
        System.out.print("Lista de números: ");
        numero = s.nextInt(); //Se pide el primer número fuera del bucle para iniciarlo.

        //Comprobación de datos y resolución del problema
        while (numero >= 0) {
                if (numero%2==0) {
                    if (numero >= mayorPar) {
                        mayorPar = numero;
                    }
                } else {
                    sumaImpar =+ numero;
                    cantidadImpar++;
            }
            numero = s.nextInt();
        }
        s.close();

        //Resultados
        System.out.println();
        System.out.println("Resultados:");

        if (mayorPar > 0) {
            System.out.printf("El mayor número par es %d.\n", mayorPar);
        } else {
            System.out.println("No se introdujeron números pares.");
        }

        if (cantidadImpar >= 1) {
        System.out.printf("La media de los números impares %.4f.\n", ((double)(sumaImpar/cantidadImpar)));
        } else {
        System.out.println("No se introdujeron números impares.");
        }
   }  
}
