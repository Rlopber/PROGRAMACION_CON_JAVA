/**
*
* Escribe un programa que permita partir un número introducido por teclado en dos partes. 
* Las posiciones se cuentan de izquierda a derecha empezando por el 1. 
* Suponemos que el usuario introduce correctamente los datos, es decir, el número introducido tiene dos dígitos como mínimo 
* y la posición en la que se parte el número está entre 2 y la longitud del número. 
* No se permite en este ejercicio el uso de funciones de manejo de String.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;


public class T05Ejercicio43 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //Declarar variables

        //Descripción del programa y entrada de datos
        System.out.print("Introduzca un número entero positivo: ");
        int numeroIntroducido = s.nextInt();
        System.out.print("Introduzca la posición a patir de la cual quiere partir el número: ");
        int separacion = s.nextInt();
        s.close();

        //Comprobación de datos
        
        int MitadUno = 0;
        int MitadDos = 0;

        for (int i = 0; i < separacion-1; i++) {
            int digito = numeroIntroducido % 10;
            MitadDos = (digito * (int)Math.pow(10, i)) + MitadDos;
            numeroIntroducido /= 10;
        }

        MitadUno = numeroIntroducido; 

        //Resolución del problema

        System.out.println("Los número partidos son el " + MitadUno + " y " + MitadDos + ".");

        
    }
}
