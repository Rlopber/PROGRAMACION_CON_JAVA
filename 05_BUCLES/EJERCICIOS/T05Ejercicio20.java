/**
*
* Realiza un programa que pinte una pirámide hueca por pantalla. 
* La altura se debe pedir por teclado. 
* El carácter con el que se pinta la pirámide también se debe pedir por teclado.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio20 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        //Desclarar variables iniciales
        int altura;
        char caracter;
        int i;
        int pisoPiramide;
        int espaciosFuera;
        int espaciosDentro;

        //Descripción del programa y entrada de datos
        System.out.println("  \033[1;34mPINTANDO PIRÁMIDES HUECAS\033[0m");
        System.out.println("=============================");
        System.out.println("Este programa te permite pintar pirámides huecas con el símbolo que prefieras y de la altura que quieras.");
        System.out.print("¿De qué altura quieres la pirámide?: ");
        altura = s.nextInt();
        System.out.print("¿Con qué símbolo quieres que se construya?: ");
        caracter = s.next().charAt(0);
        s.close();

        //Variables necesarias para la piramide


        // Creación de la pirámide
        for (pisoPiramide = 1; pisoPiramide <= altura; pisoPiramide++) {
            
            // Imprimir espacios en blanco antes de los carácteres
            for (espaciosFuera = 1; espaciosFuera <= altura - pisoPiramide; espaciosFuera++) {
                System.out.print(" ");
            }

            // Primer carácter de cada nivel.
            System.out.print(caracter);

                // Imprimir espacios dentro de la pirámide
                if (pisoPiramide > 1 && pisoPiramide < altura) {
                    
                    for (espaciosDentro = 1; espaciosDentro <= (2 * (pisoPiramide - 2) + 1); espaciosDentro++) {
                    System.out.print(" ");
                    } 
                // Segundo carácter de cada nivel.
                System.out.print(caracter);

                } else if (pisoPiramide==altura) {  // Imprimir todos los carácteres en la base de la pirámide.

                    for (i = 1; i < 2 * pisoPiramide - 1; i++)
                    System.out.print(caracter);
                }

            // Salto de línea después de cada nivel de la pirámide
            System.out.println();
        }
    }
}
