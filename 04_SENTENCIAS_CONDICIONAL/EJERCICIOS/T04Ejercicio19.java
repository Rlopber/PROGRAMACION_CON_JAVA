/**
*
* Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
*
* @author: Raquel Lopez
*/
import java.util.Scanner;

public class T04Ejercicio19 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo o negativo (5 cifras como máximo): ");
        int numero = s.nextInt();
        int numeroAbs = Math.abs(numero); // Lo convertimos en absoluto para ahorrar líneas.
        int digitos = 0;
        s.close();

        // Comprobación del número de cifras.
        if (numeroAbs < 10) {
            digitos = 1;
        } else if (numeroAbs<100) {
            digitos = 2; 
        } else if (numeroAbs<1000) {
            digitos = 3;
        } else if (numeroAbs<10000) {
            digitos = 4;
        } else if (numeroAbs<100000) {
            digitos = 5;
        } else {
            System.out.println("El número introducido tiene más de 5 cifras.");
            return; //Sale del programa si tiene más de 5 cifras.
        }

        if (digitos == 1) {
            System.out.printf("El número \033[1;30m%d\033[0m tiene \033[1;35m1\033[0m dígito.", numero);
        } else {
            System.out.printf("El número \033[1;30m%d\033[0m tiene \033[1;35m%d\033[0m dígitos.", numero, digitos);
        }
        
    }
}
