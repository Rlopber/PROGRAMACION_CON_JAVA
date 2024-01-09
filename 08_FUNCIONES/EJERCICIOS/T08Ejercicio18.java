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

        System.out.println("CALCULADORA DE DECIMAL A BINARIO");
        System.out.println("================================");
        System.out.println("");

        //Declarar variables
        int decimal;
        int digito;
        long binario = 0;
        int exponente = 0;

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
        int copiaDecimal = decimal; // Se hace una copia para no perder el número original        

        do {
            digito = copiaDecimal % 2;
            if (digito == 0) {
                binario += digito * Varias.potencia(10, exponente);
            } else {
                binario *= 10;
            }
            
            copiaDecimal /= 2;
            exponente++;    
        } while (copiaDecimal != 0); 

        //Resolución del problema
        System.out.println("El número decimal " + decimal + " es " + binario + " en binario.");
    }    
}