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
            s.close();
            
            if ((asteriscos%lineas) == 0) {
                longitud = asteriscos/lineas;
            } else {
                longitud = (int) Math.ceil((double) asteriscos / (double) lineas); //Math.ceil redondea al siguiente número más próximo. Floor redondea hacia atrás.
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Se deben introducir valores de tipo entero.");
        } catch (ArithmeticException ae) {
            System.out.println("El número de líneas no puede ser cero");
        }
    }
}
