/**
*
* Escribe un programa que diga si un número introducido por teclado es o no primo. 
* Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio16 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
            
        // Declarar variables
        int numIntroducido;
                
        // Explicación del problema y entrada de datos
        System.out.println("  \033[1;36m¿Es un número primo?\033[0m");
        System.out.println("=========================");
        System.out.println("Este programa te permite verificar si un número es primo o no.");
        System.out.print("Introduce el número entero positivo que quieres verificar: ");
        numIntroducido = s.nextInt();
        s.close();

        // Verificar si el número es primo
        boolean esPrimo = true;

        if (numIntroducido <=1) { // 0 y 1 no son primos.
            esPrimo = false;
        } else if (numIntroducido == 2) {
            // 2 es primo
        } else if (numIntroducido%2 == 0) {
            esPrimo = false;
        } else{
            for (int i = 3; i <= Math.sqrt(numIntroducido); i += 2) { // Explicación del uso de la raíz al final.
                if ((numIntroducido % i) == 0) {
                    esPrimo = false;
                }
            }
        }
        
        if (esPrimo == true) {
            System.out.println("El número " + numIntroducido + " es primo.");
        } else {
            System.out.println("El número " + numIntroducido + " no es primo.");
        }
        
    }
}

/*
La raíz cuadrada de 36 es 6. 
Si encuentras un divisor que es mayor que 6 (digamos 9), entonces automáticamente tendrías otro divisor que es menor que 6 (en este caso, 4), 
porque la multiplicación de esos dos números debe ser igual al número original (36).

Entonces, si no encuentras ningún divisor menor que o igual a la raíz cuadrada, tampoco encontrarás ninguno mayor que la raíz cuadrada. 
Por lo tanto, puedes ahorrar tiempo y recursos al limitar tu búsqueda hasta la raíz cuadrada, ya que cubre todos los posibles casos sin la necesidad de verificar más allá de ese punto. 
*/
