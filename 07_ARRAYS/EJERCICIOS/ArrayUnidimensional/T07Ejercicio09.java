package ArrayUnidimensional;
import funcionesmates.*;

/**
*
* Realiza un programa que pida 8 números enteros y que luego muestre esos números junto con la palabra “par” o “impar” según proceda.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T07Ejercicio09 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        //Declarar variables
        int[] tabla = new int[8];

        //Pedir los números al usuario
        System.out.println("Por favor, introduzca un número entero y pulse INTRO.");

        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Número " + (i+1) + ": ");
            tabla[i] = s.nextInt();
        }
        s.close();
        
        //Comprobar si son pares o impares y presentar por pantalla
        for (int i = 0; i < tabla.length; i++) {
            System.out.printf("%8d", tabla[i]);
            if (Varias.esPar(tabla[i])) {
                System.out.print(" -- PAR");
            } else {
                System.out.print(" -- IMPAR");
            }
            System.out.println();
        }  
    }
}
