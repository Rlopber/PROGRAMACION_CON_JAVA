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

    System.out.printf("El primer número es: %d. \n", num1);
    System.out.printf("El segundo número es: %d. \n", num2);

    System.out.println("El doble del número " + num1 + " es " + (num1*2) + ".");

    System.out.println("// // // // // //");

    System.out.println("Introduce un número real.");
    linea = System.console().readLine();

    double numReal1;
    numReal1 = Double.parseDouble(linea);

    System.out.println("Introduce un número real.");
    linea = System.console().readLine();

    float numReal2;
    numReal2 = Float.parseFloat(linea);

    System.out.printf("El primer número es: %.2f \n", numReal1);
    System.out.printf("El segundo número es: %.2f \n", numReal2);

    System.out.println("El doble del número " + numReal1 + " es " + (numReal1*2) + ".");

    } 
}
