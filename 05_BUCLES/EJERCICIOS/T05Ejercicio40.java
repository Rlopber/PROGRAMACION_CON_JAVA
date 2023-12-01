/**
*
* Realiza un programa que pinte por pantalla un rombo hueco hecho con asteriscos. 
* El programa debe pedir la altura. Se debe comprobar que la altura sea un número impar mayor o igual a 3, 
* en caso contrario se debe mostrar un mensaje de error.
*
* @author: Lucia Blanco
*/

import java.util.Scanner;

public class T05Ejercicio40 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        //Descripción del programa y entrada de datos
        System.out.println("Este programa dibuja un rombo hueco con asteriscos, con una altura superior a 3 y que sea impar.");
        System.out.print("Introduce la altura: ");
        int h = s.nextInt();
        while (h%2==0 || h <=3) {
            System.out.println("Lo siento, la altura no es correcta. Inténtelo de nuevo.");
            System.out.print("Introduce la altura: ");
            h = s.nextInt();
        }
        s.close();

        //Variables necesarias

        int h1 = (h/2)+1;
        int h2 = h/2;

        // Primera mitad
        for (int fil = 0; fil < h1; ++fil) {
            for (int col = 0; col < h1-fil-1; ++col) {
                System.out.print(" ");
        }

            for (int col = 0; col < 2*fil+1; ++col) {
                if ((col == 0) || (col == 2*fil)) {
                System.out.print("*");
                } else { 
                System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Segunda mitad
        int col = 0;
        for (int fil = 1; fil <= h2; ++fil) {
            col = 1;
            while (col <= fil){
                System.out.print(" ");
                col++;
            }
            int rombo = (h - fil*2);

            for (int i = 1; i <= rombo; i++) {
                if ((i == 1) || (i == rombo)) {
                System.out.print("*");
                } else {
                System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
}