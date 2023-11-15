/**
*
* Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. 
* A priori, el programa no sabe cuántos números se introducirán. 
* El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double sumaPositivos = 0;
        int cantidadNumeros = 0;
        double numIntroducido = 0;

        System.out.println("Este programa calcula la media de los números positivos que quieras.");
        System.out.println("Introduzca los números que quiera. Para acabar, introduzca un número negativo.");


        while (numIntroducido >= 0) {
            numIntroducido = s.nextDouble();
            if (numIntroducido>0) {
            sumaPositivos += numIntroducido;
            cantidadNumeros++;
            } else {
                // No hacer nada
            }
        }
        s.close();

        System.out.printf("La media de los %d números positivos introducidos es %.2f", cantidadNumeros, (sumaPositivos/cantidadNumeros));
        
    }
}