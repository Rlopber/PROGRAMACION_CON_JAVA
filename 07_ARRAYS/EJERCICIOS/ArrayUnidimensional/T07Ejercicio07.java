package ArrayUnidimensional;

/**
*
* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla separados por espacios. 
* El programa pedirá entonces por teclado dos valores y a continuación cambiará todas las ocurrencias del primer
* valor por el segundo en la lista generada anteriormente. 
* Los números que se han cambiado deben aparecer entrecomillados.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T07Ejercicio07 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] tabla = new int[100];

        int antiguoNumero = 0;
        int nuevoNumero;

        //Creación del array
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int)(Math.random()*21);
            System.out.print(tabla[i] + " ");
        }
        
        // Pedir los números que se van a cambiar
        System.out.println("");
        System.out.print("Introduzca el número que quiere sustituir: ");
        do {
            antiguoNumero = s.nextInt();
            if ((antiguoNumero < 0) || (antiguoNumero > 20)) {
                System.out.println("El número introducido no es válido, introduzca un número del 1 al 20.");
            }
        } while ((antiguoNumero < 0) || (antiguoNumero > 20));

        System.out.print("Introduzca el nuevo número: ");
        nuevoNumero = s.nextInt();
        s.close();

        //Modificación del array

        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == antiguoNumero) {
                tabla[i] = nuevoNumero;
            }
            System.out.print(tabla[i] + " ");
        }
    }
}
