/**
*
* Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. 
* El programa nos pedirá la combinación para abrirla. 
* Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
* y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
* Tendremos cuatro oportunidades para abrir la caja fuerte.
*
* @author Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio07 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.printf("\033[1;31m  COMBINACIÓN PARA LA CAJA FUERTE\033[0m\n");
        System.out.println("\033[1;30m--- --- --- --- --- --- --- --- ---\033[0m");

        // Declarar variables
        int intentos = 4;
        int combCorrecta = 2112;

        do { 
        System.out.print("Introduzca la combinación de 4 cifras: ");
        int numIntroducido = s.nextInt();
        intentos--;

            if (numIntroducido == combCorrecta) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break;
                
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
                
                if (intentos > 0) {
                    System.out.println("Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("¡Qué pena! Has agotado los intentos. No has podido abrir la caja fuerte.");
                }
            } 
        } while (intentos > 0);
        s.close();
    }
}
