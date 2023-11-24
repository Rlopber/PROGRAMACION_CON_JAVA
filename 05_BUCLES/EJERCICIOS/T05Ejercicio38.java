/**
*
* Programa que pinte un reloj de arena relleno hecho de asteriscos.
* El programa debe pedir la altura, teniendo que ser un número mayor o igual a 3. 
* Si no lo es, enseñar mensaje de error.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio38 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        
        //Descripción del programa y entrada de datos
        System.out.println("Este programa dibuja un reloj de arena con asteriscos, con una altura superior a 3 y que sea impar.");
        System.out.print("Introduce la altura: ");
        int alturaIntroducida = s.nextInt();
        while (alturaIntroducida%2==0 || alturaIntroducida <=3) {
            System.out.println("Lo siento, la altura no es correcta. Inténtelo de nuevo.");
            System.out.print("Introduce la altura: ");
            alturaIntroducida = s.nextInt();
        }
        s.close();

        //Variables necesarias

        int altura = 1;
        int asteriscos = alturaIntroducida;
        int espaciosPorDelante = 0;

        // Parte de arriba del reloj
        while (altura < alturaIntroducida / 2 + 1) {
        
            // Pintar los espacios por delante
            for (int i = 1; i <= espaciosPorDelante; i++) {
            System.out.print(" ");
            }
            
            // Pintar asteriscos
            for (int i = 0; i < asteriscos; i++) {
            System.out.print("*");
            }
            
            System.out.println();
            altura++;
            espaciosPorDelante++;
            asteriscos -= 2;      
        }
      
        // Parte de arriba del reloj
        espaciosPorDelante = alturaIntroducida / 2;
        altura = 1;
        while (altura <= alturaIntroducida / 2 + 1) {
            
            // Pintar los espacios por delante
            for (int i = 1; i <= espaciosPorDelante; i++) {
            System.out.print(" ");
            }
            
            // Pintar asteriscos
            for (int i = 0; i < asteriscos; i++) {
            System.out.print("*");
            }
            
            System.out.println();
            altura++;
            espaciosPorDelante--;
            asteriscos += 2;
        } 
    } 
}