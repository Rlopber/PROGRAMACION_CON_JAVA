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
        int primeraCifra = Math.abs(numero); //Almacena la primera cifra del numero.
        s.close();
        
        // Comprobación del número de cifras y de la primera cifra.
        if (primeraCifra < 10) {
            System.out.println(""); // La primera cifra es ya es el número.
        } else if (primeraCifra>=10 && primeraCifra<100) {
            primeraCifra /= 10; // (primeraCifra /= 100) es lo mismo que (primeraCifra = primeraCifra/100)
        } else if (primeraCifra>=100 && primeraCifra<1000) {
            primeraCifra /= 100; 
        } else if (primeraCifra>=1000 && primeraCifra<10000) {
            primeraCifra /= 1000;
        } else if (primeraCifra>=10000 && primeraCifra<100000) {
            primeraCifra /= 10000;
        } else {
            System.out.println("El número introducido tiene más de 5 cifras.");
            return; //Sale del programa si tiene más de 5 cifras.
        }

        System.out.printf("La primera cifra del número \033[1;30m%d\033[0m es: \033[1;32m%d\033[0m", numero, primeraCifra);

        
    }
}
