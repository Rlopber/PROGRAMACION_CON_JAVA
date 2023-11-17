/**
*
* Realiza un programa que pinte una pirámide por pantalla. 
* La altura se debe pedir por teclado. 
* El carácter con el que se pinta la pirámide también se debe pedir por teclado.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio19 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        //Desclarar variables iniciales
        int altura = 0;
        char caracter;
        int i = 0;

        //Descripción del programa y entrada de datos
        System.out.println("  \033[1;36mPINTANDO PIRÁMIDES\033[0m");
        System.out.println("======================");
        System.out.println("Este programa te permite pintar pirámides con el símbolo que prefieras y de la altura que quieras.");
        System.out.print("¿De qué altura quieres la pirámide?: ");
        altura = s.nextInt();
        System.out.print("¿Con qué símbolo quieres que se construya?: ");
        caracter = s.next().charAt(0);
        s.close();

        //Variables necesarias para la piramide
        int numeroCaracter = 1;
        int numeroEspacios = altura - 1;

        // Creación de la pirámide
        for (int pisoPiramide = 1; pisoPiramide <= altura; pisoPiramide++) {

            // Imprimir espacios en blanco antes de los caracteres
            for (i = 1; i <= numeroEspacios; i++) {
                System.out.print(" ");
            }

            // Imprimir el carácter
            for (i = 1; i <= numeroCaracter; i++) {
                System.out.print(caracter);
            }

            // Salto de línea después de cada nivel de la pirámide
            System.out.println();

            // Actualizar las variables para el siguiente piso de la pirámide
            numeroEspacios--;
            numeroCaracter += 2;
        }
    }
}