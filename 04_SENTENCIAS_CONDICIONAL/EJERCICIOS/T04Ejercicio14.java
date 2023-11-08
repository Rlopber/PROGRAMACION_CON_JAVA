/**
*
* Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;
public class T04Ejercicio14 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Este programa te va a decir si tu número es par y/o divisible entre 5.");
        System.out.print("Introduce un número: ");
        double numero = s.nextDouble();

        String par = "";
        String multiplo = "";

        if (numero%2==0) {
            par = "es par";
        } else {
            par = "es impar";
        }

        if (numero%5==0) {
            multiplo = "si es divisible entre 5";
        } else {
            multiplo = "no es divisible entre 5";
        }

        if (numero == (int) numero) {
            System.out.printf("El número %.0f %s y %s.\n", numero, par, multiplo);
        } else {
            System.out.printf("El número %.2f %s y %s.\n", numero, par, multiplo);
        }
        s.close();

    }
}
