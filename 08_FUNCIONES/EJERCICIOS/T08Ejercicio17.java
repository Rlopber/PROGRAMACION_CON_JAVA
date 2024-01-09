import funcionesmates.*;
/**
*
* Escribe un programa que pase de binario a decimal.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T08Ejercicio17 {
    public static void main(String[] args) {

        System.out.println("CALCULADORA DE BINARIO A DECIMAL");
        System.out.println("================================");
        System.out.println("");

        //Declarar variables
        int decimal = 0;
        long binario;

        //Descripción del programa y entrada de datos
        
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca el número binario: ");

        do {
            binario = s.nextLong();
            if (!CalcularConBases.esBinario(binario)) {
                System.out.println("Error = La entrada no es un número válido. Vuelva a intentarlo.");
            }
        } while (!CalcularConBases.esBinario(binario));

        s.close();

        //Comprobación de datos
        decimal = CalcularConBases.BinarioADecimal(binario);

        //Resolución del problema
        System.out.println("El número binario " + binario + " es " + decimal + " en decimal.");
    }    
}
