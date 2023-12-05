/**
*
* Ejercicio que pida por teclado un carácter y, a continuación, una serie de números enteros (de 0 en adelante) hasta que se introduzca un número negativo. 
* A continuación se mostrará una tabla donde en la primera columna aparecerán los números introducidos 
* y en cada fila aparecerá repetido el carácter introducido tantas veces como indique la primera columna.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Histograma {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        //Declarar variables
        boolean continuar = true;
        int columnas = 0;
        int numeroTotal = 0;
        int numeroVolteado = 0;
        int numeroDigitos = 0;
        int digito = 0;
        
        //Descripción del programa y entrada de datos
        System.out.println("Introduzca números entre 0 y 9, y pulsa INTRO. Introduce un número negativo si desea parar.");
        while (continuar) {
            int numeroIntroducido = s.nextInt();
            if (numeroIntroducido > 9) {
                System.out.println("El número introducido no es válido, introduzca otro número.");
            } else if (numeroIntroducido >= 0) {
                if (numeroIntroducido > columnas) {
                    columnas = numeroIntroducido;
                }
                numeroTotal = numeroIntroducido + (numeroTotal*10);
            } else {
                continuar = false; 
            }
        }
        s.close();

        //Dar la vuelta al número
        while (numeroTotal > 0) {
        numeroVolteado = (numeroVolteado*10) + (numeroTotal%10);
        numeroTotal /= 10;
        numeroDigitos++;
        }
        
        // Creación del histograma
        columnas += 1; //Al número más alto se le suma uno para que haya una columna superior.

        for (int j = 0; j < numeroDigitos; j++) {
            digito = numeroVolteado%10; // Se va separando cada dígito para crear la tabla
            numeroVolteado/=10;
            
            // Parte de arriba de la cuadrícula
            for (int i = 0; i < columnas; i++) {
                    System.out.print(" ---");       
            }
            System.out.println("");

            // Número en la cuadrícula
            System.out.print("| " + digito + " |" );

            // Asteriscos en la cuadrícula
            for (int i = 0; i < digito; i++) { 
                System.out.print(" * |");
            }

            // Terminar la cuadrícula
            for (int i = digito+2; i < columnas+1; i++) {  //A dígito se le suma dos por las separaciones en número de cuadrícula, y a columnas se le suma 1 porque así da el total de separaciones.
                System.out.print("   |");
            }

            System.out.println("");
        }

        // Parte de abajo de la cuadrícula
        for (int i = 0; i < columnas; i++) {
                System.out.print(" ---");       
        }
    }    
}