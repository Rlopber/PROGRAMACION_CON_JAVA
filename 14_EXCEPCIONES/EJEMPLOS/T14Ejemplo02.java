/**
*
* Descripción del programa
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T14Ejemplo02 {
    public static void main(String[] args) {
        int lineas;
        int asteriscos;
        int longitud;
        int cuentaAsteriscos;

        Scanner s = new Scanner(System.in);
        System.out.println("Este programa pinta varias líneas de asteriscos.");

        try {  
            System.out.print("Introduce el número total de asteriscos: ");
            asteriscos = Integer.parseInt(s.nextLine());
            System.out.print("Introduce el número de líneas: ");
            lineas = Integer.parseInt(s.nextLine());

            if ((asteriscos%lineas) == 0) {
            }
        } finally {
            
        }
        s.close();
    }
}
