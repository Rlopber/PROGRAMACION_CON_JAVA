/**
*
* Escribe un programa que calcule el factorial de un número entero leído por teclado.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio28 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        //Desclarar variables
        int numero;
        int factorial = 1;

        //Descripción del programa y entrada de datos
        System.out.printf("\033[1;31m  CALCULADORA DE FACTORIALES\033[0m\n");
        System.out.println("\033[1;30m--  --  --  --  --  --  --  --\033[0m");
        System.out.println();
        System.out.println("Este programa es una calculadora de factoriales.");
        System.out.print("Introduce un número entero positivo: ");
        numero = s.nextInt();
        while (numero < 0) {
            System.out.println("El número no es válido. Por favor, introduzca un número mayor o igual a 0.");
            numero = s.nextInt();
        }
        s.close();

        //Factorial de un número
        if (numero == 0)  {
            factorial = 1;
        } else {
            for (int i = 1; i <= numero; i++) {
            factorial *= i;
            }
        }
        
        //Resolución del problema
        System.out.printf("\033[1;37m%d!\033[0m = \033[1;31m%d\033[0m\n", numero, factorial);    
    }    
}
