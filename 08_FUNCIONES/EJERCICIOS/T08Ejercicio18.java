import funcionesmates.*;
/**
*
* Escribe un programa que pase de binario a decimal.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T08Ejercicio18 {
    public static void main(String[] args) {

        System.out.println("  \033[1;46mDE DECIMAL A BINARIO\033[0m");
        System.out.println("=======================");
        System.out.println("");

        //Declarar variables
        int decimal;
        long binario;

        //Descripción del programa y entrada de datos
        
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca el número decimal: ");

        do {
            decimal = s.nextInt();
            if (decimal <= 0) {
                System.out.println("Error = El número debe ser positivo y superior a 0. Vuelva a intentarlo.");
            }
        } while (decimal <= 0);

        s.close();

        //Comprobación de datos
            
        binario = CalcularConBases.DecimalABinario(decimal);

        //Resolución del problema
        System.out.println("El número decimal " + decimal + " es " + binario + " en binario.");
    }    
}