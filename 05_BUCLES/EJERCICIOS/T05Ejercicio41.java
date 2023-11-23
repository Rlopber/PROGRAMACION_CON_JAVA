/**
*
* Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un número. 
* Se recomienda usar long en lugar de int ya que el primero admite números más largos.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio41 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        //Desclarar variables
        int par = 0;
        int impar = 0;

        //Descripción del programa y entrada de datos
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = s.nextLong();
        while (numero < 0) {
            System.out.println("El número introducido no es válido. Pruebe de nuevo.");
            System.out.print("Número: ");
            numero = s.nextInt();
        }
        s.close();

        //Comprobar si los digitos son pares o impares
        long numeroOriginal = numero;
        do {
            if (numero%2==0) {
                par++;
            } else {
                impar++;
            }
            numero/=10;
        } while (numero > 0);

        //Resolución del problema
        if (numeroOriginal == 0) {
            System.out.println("Sólo ha introducido el 0, un número par.");
        } else if (numero <=9) {
            if (par == 1) {
                System.out.println("El " + numeroOriginal + " es un número par.");
            } else if (impar == 1) {
                System.out.println("El " + numeroOriginal + " es un número impar.");
            }
        } else {
        System.out.println("El " + numeroOriginal + " contiene " + par + " dígitos pares y " + impar + " dígitos impares.");
        }
    }    
}
