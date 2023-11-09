/**
*
* Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa. Se permiten números de hasta 5 cifras.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T04Ejercicio20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo o negativo (5 cifras como máximo): ");
        int numero = s.nextInt();

        int numeroAbs = Math.abs(numero); // Lo convertimos en absoluto para ahorrar líneas.
        boolean capicua = false;
        s.close();

        // Comprobación del número de cifras.
        if (numeroAbs < 10) {
            capicua = true;
        } else if (numeroAbs>=10 && numeroAbs<100) {
             if ((numeroAbs/10) == (numeroAbs%10)) {
                capicua = true;
             }
        } else if (numeroAbs>=100 && numeroAbs<1000) {
            if ((numeroAbs/100) == (numeroAbs%10)) {
                capicua = true;
             }
        } else if (numeroAbs>=1000 && numeroAbs<10000) {
            if (((numeroAbs/1000) == (numeroAbs%10)) && (((numeroAbs/100)%10) == ((numeroAbs/10)%10))) {
                capicua = true;
             }
        } else if (numeroAbs>=10000 && numeroAbs<100000) {
            if (((numeroAbs/10000) == (numeroAbs%10)) && (((numeroAbs/1000)%10) == ((numeroAbs/10)%10))) {
                capicua = true;
             }
        } else {
            System.out.println("El número introducido tiene más de 5 cifras.");
            return; //Sale del programa si tiene más de 5 cifras.
        }

        if (capicua == false) {
            System.out.printf("El número \033[1;30m%d\033[0m no es \033[1;31mcapicua\033[0m.", numero);
        } else {
            System.out.printf("El número \033[1;30m%d\033[0m es \033[1;32mcapicua\033[0m.", numero);
            }
    }
}