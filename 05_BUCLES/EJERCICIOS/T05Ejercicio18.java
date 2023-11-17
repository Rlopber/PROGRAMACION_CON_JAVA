/**
*
* Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado y validados como distintos, 
* el programa debe empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio18 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        //Desclarar variables
        int primerNum;
        int segundoNum;
        int auxiliar;

        //Descripción del programa y entrada de datos
        System.out.println("Este programa te va a enseñar por pantalla los números enteros comprendidos entre dos número de tu elección, contando de 7 en 7.");
        System.out.print("Introduce el primer número: ");
        primerNum = s.nextInt();
        System.out.print("Introduce el segundo número: ");
        segundoNum = s.nextInt();
        s.close();

        //Comprobación de mayor y menor
        if (primerNum == segundoNum) {
            System.out.println("Los dos números son iguales, la entrada no es válida.");

        } else if (primerNum > segundoNum) {
            auxiliar = primerNum;
            primerNum = segundoNum;
            segundoNum = auxiliar;
        }

        //Resolución del problema
        for (int i = primerNum; i <= segundoNum; i +=7) {
            System.out.print(i + " ");
        }
    }
}
