/**
*
* Escribe un programa que lea un número n e imprima una pirámide de números con n filas.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio24 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        // Declarar variables
        int altura;
        int nivel;
        int espaciosFuera;
        int parteOrdenada;
        int parteInversa;

        // Descripción del programa y entrada de datos
        System.out.println("Este programa te hace una pirámide con números siguiendo un patrón.");
        System.out.print("Introduce la altura de la pirámide: ");
        altura = s.nextInt();
        s.close();

        // Creación de la pirámide
        for (nivel = 1; nivel <= altura; nivel++) {
            
            // Imprimir espacios en blanco antes de los caracteres
            for (espaciosFuera = 1; espaciosFuera <= altura - nivel; espaciosFuera++) {
                System.out.print(" ");
            } 

            // Imprimir la serie ordenada
            for (parteOrdenada = 1; parteOrdenada <= nivel; parteOrdenada++) {
                System.out.print(parteOrdenada);
            }

            // Imprimir la serie inversa
            for (parteInversa = nivel - 1; parteInversa >= 1; parteInversa--) {
                System.out.print(parteInversa);
            }

            System.out.println();
        }
    }
}