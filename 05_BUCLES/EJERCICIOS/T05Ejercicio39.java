/**
*
* Escribe un programa que pida un número entero positivo por teclado 
* y que muestre a continuación los números desde el 1 al número introducido junto con su factorial.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio39 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        //Desclarar variables
        int factorial = 1;
        int numeroInicial = 0;

        //Descripción del programa y entrada de datos
        System.out.println("  \033[1;36mFACTORIALES\033[0m");
        System.out.println("===============");
        System.out.print("Introduce un número entero positivo: ");
        int numeroFinal = s.nextInt();
        while (numeroFinal < 0) {
            System.out.println("El número introducido no es válido. Pruebe de nuevo.");
            System.out.print("Número: ");
            numeroFinal = s.nextInt();
        }
        s.close();

        //Factorial de un número 
        do {
            numeroInicial++;
            factorial *= numeroInicial;
            System.out.println("!" + numeroInicial + " = " + factorial); 
        } while (numeroInicial < numeroFinal);
    }    
}
