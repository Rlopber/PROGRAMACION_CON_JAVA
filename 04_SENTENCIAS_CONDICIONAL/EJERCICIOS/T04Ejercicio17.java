/**
*
* Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T04Ejercicio17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca un número entero cualquiera: ");
        int numero = s.nextInt();
        int ultimaCifra;

        // Se introduce el if para diferenciar números positivos y negativos.
        if (numero < 0) {
            ultimaCifra = Math.abs(numero % 10); // Math.abs devuelve valores absolutos.
        } else {
            ultimaCifra = numero % 10;
        }

        System.out.printf("La última cifra del número \033[1;30m%d\033[0m es: \033[1;32m%d\033[0m", numero, ultimaCifra);

        s.close();
    }
}
