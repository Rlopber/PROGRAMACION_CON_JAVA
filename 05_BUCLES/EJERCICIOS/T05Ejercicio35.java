/**
*
* Programa que pinte una x hecha de asteriscos. EL programa debe pedir la altura.
* Debe comprobar que la altura sea un número impoar mayor o igual a 3, 
* si no debe mostrar un menssaje de error.
*
* @author Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio35 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        //Descripción del programa y entrada de datos
        System.out.println("Este programa dibuja la letra X con asteriscos con una altura superior a 3 y que sea impar.");
        System.out.print("Introduce la altura: ");
        int altura = s.nextInt();
        while (altura%2==0 || altura <=3) {
            System.out.println("Lo siento, la altura no es correcta. Inténtelo de nuevo.");
            System.out.print("Introduce la altura: ");
            altura = s.nextInt();
        }
        s.close();

        for (int nivel = 1; nivel <= altura; nivel++) {
            for (int i = 1; i <= altura; i++) {
                // Imprimir '*' en las posiciones correspondientes
                if (i == nivel || i == altura - nivel + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
