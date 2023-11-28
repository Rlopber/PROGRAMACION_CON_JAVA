/**
*
* Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa pedirá la altura. 
Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en la base para simular la curvatura de las esquinas inferiores.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio33 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
    
        //Descripción del programa y entrada de datos
        System.out.println("Este programa dibuja la letra U con asteriscos con la altura que quieras.");
        System.out.print("Introduce la altura: ");
        int altura = s.nextInt();
        s.close();

        //Dibujar la U

        // Lados de la U
        for (int i = 1; i < altura; i++) {
            System.out.print("* ");
            for (int j = 0; j < (altura-2); j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        
        // Base de la U
        System.out.print("  ");
        for (int i = 1; i < (altura-1); i++) {
            System.out.print("* ");
        }

    }    
}
