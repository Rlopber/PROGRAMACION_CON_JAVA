/**
*
* Sumar, restar, multiplicar y dividir dos números introducidos por teclado.
*
* @author: Raquel Lopez
*/
import java.util.Scanner;
public class T03Ejercicio04 {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Introduce dos números (puede contener decimales) separados por un espacio: ");

    double num1 = s.nextDouble();
    double num2 = s.nextDouble();

    System.out.println("El primer número es " + num1 + " y el segundo número es " + num2);
    System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
    System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
    System.out.println(num1 + " / " + num2 + " = " + (num1/num2));

    s.close();
       
    }
}
