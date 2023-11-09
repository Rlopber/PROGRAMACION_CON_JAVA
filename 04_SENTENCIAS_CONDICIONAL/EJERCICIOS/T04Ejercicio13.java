/**
*
* Escribe un programa que ordene tres números enteros introducidos por teclado.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T04Ejercicio13 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa ordena tres números enteros introducidos por teclado.");
        System.out.println("Por favor, vaya introduciendo los tres número y pulsando INTRO:");

        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        int aux;

        // ordenación de los dos primeros números
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
      
        // ordenación de los dos últimos números
        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
      
        // se vuelven num1 ordenar los dos primeros
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
          
      System.out.println("Los números introducidos ordenados de menor num1 mayor son " + num1 + ", " + num2 + " y " + num3 + "."); 
        s.close();
    }
}
