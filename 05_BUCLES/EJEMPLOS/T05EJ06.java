/**
*
* Leer números por teclado mientras el número sea par.
*
* @author Raquel Lopez
*/

import java.util.Scanner;
public class T05EJ06 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce números enteros pares.");
        int numPar = 0;

        do {
            System.out.print("Número: ");
            numPar = s.nextInt();

            if (numPar %2 == 0) {
                System.out.println("Ay qué bonito es el número par " + numPar);
            } else {
                System.out.println("No me gustan los números impares. Adió.");
            }

        } while (numPar%2 == 0);
        s.close();
    }
}
