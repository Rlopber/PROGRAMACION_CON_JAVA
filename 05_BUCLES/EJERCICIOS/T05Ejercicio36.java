/**
*
* Programa que diga si un número introducido por teclado es o no capicúa. 
* Los número capicúa se leen igual hacia delante y hacia atrás.
* El programa debe aceptar números de cualquier longitud siempre que lo permita el tipo.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio36 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        //Desclarar variables
        long numeroInvertido = 0;
        boolean capicua = true;

        //Descripción del programa y entrada de datos
        System.out.println("  \033[1;36m¿ES CAPICÚA?\033[0m");
        System.out.println("================");
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = s.nextLong();
        while (numero <= 0) {
            System.out.println("El número introducido no es válido. Pruebe de nuevo.");
            System.out.print("Número: ");
            numero = s.nextLong();
        }
        s.close();

        //Invertir el número sin modificar el original
        long numeroInvertidoTemp = numero;
        while (numeroInvertidoTemp > 0) {
            numeroInvertido = numeroInvertido * 10 + (numeroInvertidoTemp % 10);
            numeroInvertidoTemp /= 10;
        }

        // Comparar numero con número invertido
        long numeroOriginal = numero;
        boolean continuar = true;
        while (numero > 0 && continuar) {
         if (numero%10 == numeroInvertido%10) {
            numero/=10;
            numeroInvertido/=10;
            } else {
                capicua = false;
                continuar = false;
            }
        }

        // Salida por pantalla
        if (capicua) {
            System.out.println("El número " + numeroOriginal + " \033[1;32mes capicúa.\033[0m");
        } else {
            System.out.println("El número " + numeroOriginal + " \033[1;31mno es capicúa.\033[0m");
        }
    }
}
