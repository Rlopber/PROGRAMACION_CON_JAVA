/**
*
* Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado. Se permiten números de hasta 5 cifras.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T04Ejercicio18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero (5 cifras como máximo): ");
        int numero = s.nextInt();
        int numeroAbs = Math.abs(numero);
        int primeraCifra = 0; //Almacena la primera cifra del numero.
        s.close();
        
        // Comprobación del número de cifras y de la primera cifra.
        if (numeroAbs < 10) {
            primeraCifra = numeroAbs;
        } else if (numeroAbs>=10 && numeroAbs<100) {
            primeraCifra = numeroAbs/10; 
        } else if (numeroAbs>=100 && numeroAbs<1000) {
            primeraCifra = numeroAbs/100; 
        } else if (numeroAbs>=1000 && numeroAbs<10000) {
            primeraCifra = numeroAbs/1000;
        } else if (numeroAbs>=10000 && numeroAbs<100000) {
            primeraCifra = numeroAbs/10000;
        } else {
            System.out.println("El número introducido tiene más de 5 cifras.");
            return; //Sale del programa si tiene más de 5 cifras.
        }

        System.out.printf("La primera cifra del número \033[1;30m%d\033[0m es: \033[1;32m%d\033[0m", numero, primeraCifra);

        
    }
}
