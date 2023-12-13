/**
*
* Realiza un programa que sume los 100 números siguientes a un número entero y positivo introducido por teclado. 
* Se debe comprobar que el dato introducido es correcto (que es un número positivo).
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio17 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        // Declarar variables
        int numIntroducido;
        int sumaNumeros = 0;
        int auxiliarSuma;
                
        // Explicación del problema y entrada de datos
        System.out.println("  \033[1;35mSumando 100 números\033[0m");
        System.out.println("- - - - - - - - - - - -");
        System.out.println("Este programa suma los 100 números siguientes a un número entero y positivo.");
        
            do { // Comprobación del dato (tiene que ser entero y positivo)
            System.out.print("Indica el número inicial: ");
            numIntroducido = s.nextInt();
                if (numIntroducido<0) { 
                    System.out.println("Lo siento, el número introducido no es entero y positivo.");
                    System.out.println("Inténtelo con otro número.");
                }
            } while (numIntroducido<0);
        s.close();
        
        // Bucle para resolución
        auxiliarSuma = numIntroducido;
        
        for (int i = 1; i <= 100; i++) {  
        sumaNumeros += auxiliarSuma;
        auxiliarSuma = auxiliarSuma+1;
        }
        
        System.out.printf("La suma de los 100 números a partir de %d es %d.", numIntroducido, sumaNumeros);
    }
}

/*
 * Otras soluciones:
 * int sumaNumeros = numIntroducido + (numIntroducido + 1) * 100 / 2 -> fórmula para saber la progresión aritmética de una suma.
 * for(int i = numeroIntroducido; i < numeroIntroducido + 100; i++) {suma += i;}
 */