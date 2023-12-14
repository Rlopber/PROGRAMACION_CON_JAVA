/**
*
* Clase que comprueba si un número es o no primo.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Declarar variables
        int numIntroducido;

        System.out.print("Introduce un número entero positivo: ");
        numIntroducido = s.nextInt();
        s.close();

        // Verificar si el número es primo
        boolean esPrimo = true;

        if (numIntroducido <=1) { // 0 y 1 no son primos.
            esPrimo = false;
        } else if (numIntroducido == 2) {
            // 2 es primo
        } else if (numIntroducido%2 == 0) {
            esPrimo = false;
        } else{
            for (int i = 3; i <= Math.sqrt(numIntroducido); i += 2) { /*Explicacion en T05Ejercicio16 */
                if ((numIntroducido % i) == 0) {
                    esPrimo = false;
                }
            }
        }
        
        if (esPrimo) {
            System.out.println("El número " + numIntroducido + " es primo.");
        } else {
            System.out.println("El número " + numIntroducido + " no es primo.");
        }
    }
}
