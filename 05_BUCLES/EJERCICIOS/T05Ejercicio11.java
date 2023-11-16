/**
*
* Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        // Declarar variables
        int numero;

        // Pedir datos
        System.out.println("Con este programa podrás resolver potencias de 2 y 3 para los 5 primeros números enteros a partir del que va a introducir.");
        System.out.print("Introduzca el números entero que quiera: ");
        numero = s.nextInt();
        s.close();

        System.out.println("    n    |    n\u00B2    |    n\u00B3");
        System.out.println("-------------------------------");

        // Generar la tabla
        for (int i = numero; i < numero+5; i++)
        
        System.out.printf("%8d |%8.0f  |%9.0f\n", i, Math.pow(i,2), Math.pow(i,3));
        
    }
}
