/**
*
* Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio14 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Declarar variables
         double base;
         int exponente;
         double resultado = 1;

        // Explicación del problema y entrada de datos
        System.out.println("  \033[1;46mCALCULADORA DE POTENCIAS\033[0m");
        System.out.println("============================");
        System.out.print("Base de la potencia: ");
        base = s.nextDouble();
        System.out.print("Exponente de la potencia (entero positivo): ");
        exponente = s.nextInt();
        s.close();

        // Casos especiales: elevado a negativo n y elevado a 0.
            if (exponente < 0) {
                System.out.println("El exponente tiene que ser un número entero y positivo.");
            } else if (exponente == 0) {
                System.out.println("Cualquier número elevado a 0 es \033[1;30m1\033[0m.");
            } else {
                // Calcular la potencia
                for (int i = 0; i < exponente; i++) {
                    resultado *= base;
                }
            }

        System.out.printf("%f ^ %d = %f\n", base, exponente, resultado);
    }
}
