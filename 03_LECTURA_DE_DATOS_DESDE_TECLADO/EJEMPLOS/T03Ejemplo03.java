import java.util.Scanner;

/**
 * LEctura de datos desde teclado usando la clase scanner.
 * 
 * @author Raquel Lopez
 */

public class T03Ejemplo03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, "Windows-1252"); // Creamos un onjeto de la clase Scanner, llamado s.
        
        // Para que funcionen los caracteres especiales en windows, hay que poner system.in, windows-1252 y despues activar abajo
        // chcp 1252

        System.out.print("Introduce tu nombre: ");
        String nombre = s.nextLine();                // Guardamos en la variable nombre lo que introducimos.

        System.out.print("Introduce tu edad: ");
        int edad = s.nextInt();   //

        System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
        s.close();
    }
}
