/**
 * 
 * Lectura de datos por teclado usando Scanner y .next()
 * 
 * @author Raquel Lopez
 */

import java.util.Scanner;

public class T03Ejemplo04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre y tu edad (separados por un espacio): ");
        String nombre = sc.next();
        String apellido1 = sc.next();
        String apellido2 = sc.next();
        int edad = sc.nextInt();

        System.out.println("Tu nombre es " + nombre);
        System.out.println("Apellido 1: " + apellido1);
        System.out.println("Apellido 2: " + apellido2);
        System.out.println("Tu edad es " + edad);
        sc.close();
    }
}
