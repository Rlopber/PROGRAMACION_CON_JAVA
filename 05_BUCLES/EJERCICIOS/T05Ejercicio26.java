/**
*
* Realiza un programa que pida primero un número y a continuación un dígito. 
* El programa nos debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese dígito en el número introducido.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio26 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        //Desclarar variables
        int posicion = 1;
        boolean encontrado = false;

        //Descripción del programa y entrada de datos
        System.out.println("Este programa te dirá la posición de un dígito que quieras dentro de un número que elijas.");
        System.out.print("¿En qué número vamos a buscar?: ");
        int numeroIntroducido = s.nextInt();
        System.out.print("¿De qué dígito quieres saber la posición?: ");
        int digito = s.nextInt();
        s.close();

        //Averiguar la posición
        int numero = numeroIntroducido; //Para no modificar el valor de numeroIntroducido creamos una varaible auxiliar.

        if (numero < 10) {
            System.out.println("Tu número tiene una cifra, así que la posición es 1.");
        } else {
            while (numero > 0 && !encontrado) {
                if ((numero % 10) == digito) {
                    encontrado = true;
                } else {
                numero = numero / 10;
                posicion++;
                }          
            }
        }
        
        // Contador de dígitos del número
        int contador = 0;

        while (numeroIntroducido > 0) {
            numeroIntroducido = numeroIntroducido / 10;
            contador++;
        }

        //Resolución del problema 
        int posicionDesdeIzquierda = contador - (posicion-1);

        System.out.println();
        if (encontrado) { 
            System.out.println("El número elegido es " + numeroIntroducido + " y el dígito elegido es el " + digito + ".");
            System.out.println("La posición del dígito es la " + posicionDesdeIzquierda + "ª.");
           
        } else {
            System.out.println("El dígito " + digito + " no se encuentra en el número " + numeroIntroducido + ".");
        }
    }    
}
