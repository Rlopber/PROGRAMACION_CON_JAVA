/**
*
* Escribe un programa que muestre por pantalla todos los números enteros positivos menores a un número leído por teclado que no sean divisibles entre otro también leído de igual forma.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio29 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        //Desclarar variables
        int numMaximo;
        int divisor;

        //Descripción del programa y entrada de datos
        System.out.println("Este programa imprime los números positivos menores al valor ingresado que no son divisibles por otro número proporcionado.");
        System.out.print("Introduce el número principal: ");
        numMaximo = s.nextInt();
        System.out.print("Introduce el divisor: ");
        divisor = s.nextInt();
        while (divisor == 0 || divisor == 1) { // Casos especiales: divisor 0 y 1.
            if (divisor == 1) {
                System.out.println("Todos los números son divisibles entre 1.");
            } else {
                System.out.println("No se puede dividir entre 0.");
            }
            System.out.print("Introduzca otro número: ");
            divisor = s.nextInt();
        }
        s.close();

        //Averiguar si son divisores y mostrar por pantalla.
        System.out.printf("Los números no divisibles por %d en el rango de 1 hasta %d son:\n", divisor, numMaximo);
        for (int i = 1; i <= numMaximo; i++) {
            if (i%divisor != 0) {
                System.out.print(i + " ");
            }
        }   
    }
}
