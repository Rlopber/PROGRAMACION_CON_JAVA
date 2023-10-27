/**
 * 
 * 
 * @author: Raquel Lopez
 */

public class T03Ejemplo02 {
    public static void main(String[] args) {
        
    String linea;

    System.out.println("Introduce un número entero.");
    linea = System.console().readLine();

    int num1;
    num1 = Integer.parseInt(linea);

    System.out.println("Introduce un número entero.");
    linea = System.console().readLine();

    int num2;
    num2 = Integer.parseInt(linea);

    System.out.printf("El primer número es: %d.5 \n", num1);
    System.out.printf("El segundo número es: %d. \n", num2);

    System.out.println("EL doble del número " + num1 + " es " + (num1*2) + ".");

    } 
}
