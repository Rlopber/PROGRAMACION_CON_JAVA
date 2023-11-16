/**
*
* Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio13 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Declarar variables
        double numIntroducido;
        int sumPositivos = 0;
        int sumNegativos = 0;
        
         // Explicación del problema y pedir datos
        System.out.println("Este programa va a determinar, de una lista, cuántos números son positivos y cuántos negativos.");
        System.out.print("Introduzca los números: ");

        for (int i = 0; i < 10; i++) {
            numIntroducido = s.nextDouble();
            if (numIntroducido > 0) {
                sumPositivos++;
            } else if (numIntroducido < 0) {
                sumNegativos++;
            }
        }
        s.close();

        // Salidas por pantalla
        System.out.println("\033[1;30m------------------------------\033[0m");
        System.out.println("Resultados:");
        System.out.printf("Números positivos: \033[0;32m%d\033[0m\n", sumPositivos);
        System.out.printf("Números negativos: \033[0;31m%d\033[0m\n", sumNegativos);
        
    }
}
