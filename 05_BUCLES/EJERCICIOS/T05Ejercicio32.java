/**
*
* Descripción del programa
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio32 {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        
        //Desclarar variables
        int digito = 0;
        long sumaPares = 0;
        long numeroInvertido = 0;

        //Descripción del programa y entrada de datos
        System.out.println("Introduce un número entero positivo y te diré qué dígitos son pares y cuánto suman.");
        System.out.print("Número: ");
        long numero = s.nextLong();
        s.close();

        // Invertir el número
        long numeroOriginal = numero;

        while (numero > 0) {
            numeroInvertido = numeroInvertido * 10 + (numero % 10);
            numero /= 10;
        }

        //Saber cuáles son pares y la suma de estos
        System.out.print("Los números pares del número " + numeroOriginal + " son: ");
        while (numeroInvertido > 0) {
            digito = (int)(numeroInvertido%10); 
            if (digito%2 == 0) {
                System.out.print(digito + " ");
                sumaPares += digito;
            }
            numeroInvertido /= 10;
        }
        System.out.println("");
        System.out.println("La suma de estos pares es: " + sumaPares);
    }    
}
