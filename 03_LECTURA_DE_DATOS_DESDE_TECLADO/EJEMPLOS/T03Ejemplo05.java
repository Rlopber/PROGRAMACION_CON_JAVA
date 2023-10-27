/**
 * 
 * Lectura de datos desde teclado usando la clase Scanner.
 * 
 *@author Raquel Lopez
 */

import java.util.Scanner;

public class T03Ejemplo05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce tres números (pueden contener decimales) separados por espacios: ");

    double num1 = s.nextDouble();
    double num2 = s.nextDouble();
    double num3 = s.nextDouble();

    double media = (num1 + num2 + num3)/3;

    System.out.println("La media de esos tres números es " + media);
    s.close();
  }  
}
