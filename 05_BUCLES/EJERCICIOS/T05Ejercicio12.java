/**
*
* Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. 
* El primer término de la serie de Fibonacci es 0, el segundoTermino es 1 y el resto se calcula sumando los dos anteriores, 
* por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… 
* El número n se debe introducir por teclado.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio12 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        // Declarar variables
        int primerTermino = 0;
        int segundoTermino = 1;
        int resultado;
        int n;

        System.out.println("   \033[1;92mSERIE DE FIBONACCI\033[0m");
        System.out.println("\033[0;32m~~~~~~~~~~~~~~~~~~~~~~~~\033[0m");

        // Explicación del problema y pedir datos
        System.out.println("Este programa calcula la serie de Fibonacci para un número dado, 'n'.");
        System.out.print("Por favor, introduzca el valor de n: ");
        n = s.nextInt();
        s.close();

        // Caso especial para n = 0
        if (n == 0) {
            System.out.println("La serie de Fibonacci para n = 0 es: " + primerTermino);
        } else { // Imprimir los primeros n términos de la serie de Fibonacci
            System.out.print(primerTermino + " ");
            if (n > 1) {
                System.out.print(segundoTermino + " ");
            }

            for (int i = 2; i < n; i++) { // Empieza en 2 porque los dos primeros números se escriben fuera del bucle.
                resultado = primerTermino + segundoTermino;
                System.out.print(resultado + " ");

                primerTermino = segundoTermino;
                segundoTermino = resultado;
            }
        }
    }
}