/**
*
* Escribe un programa que pida dos números por teclado y que luego mezcle en dos números diferentes los dígitos pares y los impares. 
* Se van comprobando los dígitos de la siguiente manera: primer dígito del primer número, primer dígito del segundo número, 
* segundo dígito del primer número, segundo dígito del segundo número, tercer dígito del primer número… 
* Para facilitar el ejercicio, podemos suponer que el usuario introducirá dos números de la misma longitud
* y que siempre habrá al menos un dígito par y uno impar. 
* Usa long en lugar de int donde sea necesario para admitir números largos.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio34 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        //Desclarar variables
        long numeroInvertidoUno = 0;
        long numeroInvertidoDos = 0;
        int digitoUno = 0;
        int digitoDos = 0;
        long resultadoPar = 0;
        long resultadoImpar = 0;

        //Descripción del programa y entrada de datos
        System.out.println("Introduce dos números enteros positivos y te diré qué dígitos son pares y cuáles impares.");
        System.out.print("Primer número: ");
        long numeroUno = s.nextLong();
        System.out.print("Segundo número: ");
        long numeroDos = s.nextLong();
        s.close();

        // Invertir el número

        while (numeroUno > 0 || numeroDos > 0) {
            if (numeroUno > 0) {
                numeroInvertidoUno = numeroInvertidoUno * 10 + (numeroUno % 10);
                numeroUno /= 10;
            }

            if (numeroDos > 0) {
                numeroInvertidoDos = numeroInvertidoDos * 10 + (numeroDos % 10);
                numeroDos /= 10;
            }
        }

        //Saber número par e impar

        while (numeroInvertidoUno > 0 || numeroInvertidoDos > 0) {
            digitoUno = (int)(numeroInvertidoUno%10);
            digitoDos = (int)(numeroInvertidoDos%10);

            if (digitoUno%2 == 0) {
                resultadoPar = resultadoPar * 10 + digitoUno;
            } else {
                resultadoImpar = resultadoImpar * 10 + digitoUno;
            }

            if (digitoDos%2 == 0) {
                resultadoPar = resultadoPar * 10 + digitoDos;
            } else {
                resultadoImpar = resultadoImpar * 10 + digitoDos;
            }

            numeroInvertidoUno /= 10;
            numeroInvertidoDos /= 10;
        }

        // Resultado
        System.out.println("El número formado por los dígitos pares es: " + resultadoPar);
        System.out.println("La suma de estos pares es: " + resultadoImpar);
    }    
}
