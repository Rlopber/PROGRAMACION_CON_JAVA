/**
*
* Contado de número positivos introducidos por teclado.
*
* @author Raquel Lopez
*/

import java.util.Scanner;

public class T05EJ04 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Contador de números positivos.");

        int numIntroducido = 0; // Variable controladora de la salida del bucle.
        int contador = 0;       // Variable contadora de números enteros positivos.
        int suma = 0;           // Variable acumuladora de números positivos.

        System.out.println("Escribe números enteros positivos. El contador parará cuando introduzcas un número negativo.");
        while (numIntroducido >= 0) {
            System.out.print("Número: ");
            numIntroducido = s.nextInt();
            if (numIntroducido > 0) {       // Si el número es mayor a 0 suma 1 al contador numPositivos. 
                contador++;
                suma += numIntroducido;     // suma = suma + numeroIntroducido    
            }
        }

        s.close();
        System.out.println("Has introducido " + contador + " números positivos.");
        System.out.println("La suma de los números positivos introducidos es " + suma + ".");
    }
}
