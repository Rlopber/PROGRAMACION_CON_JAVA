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
        int digito;
        int decimal = 0;
        int base = 0;
        long binario;

        //Descripción del programa y entrada de datos
        
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el número binario: ");

        do {
            binario = s.nextLong();
            if (!Varias.esBinario(binario)) {
                System.out.println("Error = La entrada no es un número válido. Vuelva a intentarlo.");
            }
        } while (!Varias.esBinario(binario));

        s.close();

        //Comprobación de datos
        Long copiaBinario = binario; // Se hace una copia para no perder el número original

        do {
            digito = (int)(copiaBinario%10);
            copiaBinario /= 10;

            if (digito == 1) {
                decimal += (int)(1 * Varias.potencia(2, base));
            }
            base += 1;
        } while (copiaBinario > 0);

        //Resolución del problema
        System.out.println("El número binario " + binario + " es " + decimal + " en decimal.");
    }    
}
