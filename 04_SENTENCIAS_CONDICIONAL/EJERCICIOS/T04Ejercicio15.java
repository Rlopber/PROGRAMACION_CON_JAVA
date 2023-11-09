/**
*
* Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado 
* que podrá ser una letra, un número o un símbolo como *, +, -, $, &, etc. 
* El programa debe permitir al usuario mediante un menú elegir si el vértice de la pirámide está apuntando hacia arriba, 
* hacia abajo, hacia la izquierda o hacia la derecha.
*
* @author: Raquel Lopez
*/
import java.util.Scanner;


public class T04Ejercicio15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Este programa te va a dibujar una pirámide con el símbolo que quieras.");
        System.out.print("¿Qué símbolo quieres utilizar? ");
        var simbolo = s.nextLine();
        System.out.println("¿Hacia que lado quieres el vértice de la pirámide?");
        System.out.print(" 1.Arriba\n 2.Abajo\n 3.Derecha\n 4.Izquierda\n");
        int numero = s.nextInt();
        s.close();

        switch (numero) {
            case 1:
                System.out.println("  " + simbolo);
                System.out.println(" " + simbolo + simbolo + simbolo);
                System.out.println(simbolo + simbolo + simbolo + simbolo + simbolo);
                break;

            case 2:
                System.out.println(simbolo + simbolo + simbolo + simbolo + simbolo);
                System.out.println(" " + simbolo + simbolo + simbolo);
                System.out.println("  " + simbolo);
                break;

            case 3:
                System.out.println(simbolo);
                System.out.println(simbolo + " " + simbolo);
                System.out.println(simbolo + " " + simbolo + " " + simbolo);
                System.out.println(simbolo + " " + simbolo);
                System.out.println(simbolo);

                break;
                
            case 4:
                System.out.println("    " + simbolo);
                System.out.println("  " + simbolo + " " + simbolo);
                System.out.println(simbolo + " " + simbolo + " " + simbolo);
                System.out.println("  " + simbolo + " " + simbolo);
                System.out.println("    " + simbolo);
                break;
                
            default:
                System.out.println("El número introducido no es del 1 al 4.");
        }

    }
}

