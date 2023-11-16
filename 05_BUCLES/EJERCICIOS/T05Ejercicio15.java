/**
*
* Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), 
* saque por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido. 
* No se deben utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
* se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio15 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Declarar variables
         double base;
         int maxExponente;
         double resultado = 0;
         
        // Explicación del problema 
        System.out.println("  \033[1;46mCALCULADORA DE POTENCIAS\033[0m");
        System.out.println("============================");
        System.out.println("Bienvenido a la calculadora de potencias.");
        System.out.println("Este programa te permite calcular todas las potencias de una base dada, elevada a exponentes entre 1 y el valor que elijas.");
        System.out.println("¡Empecemos!");
        System.out.println("");

        // Entrada de datos
        System.out.print("Base de la potencia: ");
        base = s.nextDouble();
        System.out.print("Valor máximo del exponente: ");
        maxExponente = s.nextInt();
        s.close();

        // Casos especiales: elevado a negativo n y elevado a 0.
            if (maxExponente < 0) {
                System.out.println("El exponente tiene que ser un número entero y positivo.");
            } else if (maxExponente == 0) {
                System.out.println("Cualquier número elevado a 0 es \033[1;30m1\033[0m.");
            } else {

                // Calcular y mostrar las potencias
                for (int exponente = 1; exponente <= maxExponente; exponente++) {
                    resultado = base*exponente;
                    System.out.printf("%.4f ^ %d = %.4f\n", base, exponente, resultado);
                }
            }
    }
}
