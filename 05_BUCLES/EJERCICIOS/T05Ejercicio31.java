/**
*
* Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. 
* El programa pedirá la altura. 
* El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio31 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        //Desclarar variables

        //Descripción del programa y entrada de datos
        System.out.println("Este programa dibuja la letra L con asteriscos con la altura que quieras.");
        System.out.print("Introduce la altura: ");
        int altura = s.nextInt();
        s.close();

        //Dibujar la L

        for (int i = 0; i < (altura-1); i++) {
            System.out.println("*");
        }

        for (int i = 0; i < ((altura/2)+1); i++) {
            System.out.print("*" + " ");
        }
    }    
}
