/**
*
* Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. 
* La única limitación en el número de dígitos la establece el tipo de dato que se utilice (int o long).
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long numIntroducido;
       
        int numeroCifras = 1; //Si no entra en el bucle, el número es de una cifra.

        System.out.print("Por favor, introduzca un número entero y le diré cuántos dígitos tiene: ");
        numIntroducido = s.nextLong();
        long numeroAbs = Math.abs(numIntroducido); // Lo convertimos en absoluto para ahorrar líneas.
        s.close();

        while (numeroAbs >= 10) {
            numeroAbs /= 10; // es lo mismo que numeroAbs = numeroAbs/10
            numeroCifras++;
        }
        
        if (numeroCifras == 1) {
            System.out.printf("El número \033[1;30m%d\033[0m tiene \033[1;35m1\033[0m dígito.", numIntroducido);
        } else {
            System.out.printf("El número \033[1;30m%d\033[0m tiene \033[1;35m%d\033[0m dígitos.", numIntroducido, numeroCifras);
        }
    }
}
