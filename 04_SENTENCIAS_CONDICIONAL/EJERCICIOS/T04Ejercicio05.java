/**
*
<<<<<<< HEAD
* Programa que resuelva una ecuación de primer grado (ax+b=0).
*
* @author Raquel Lopez
*/

public class T04Ejercicio05 {
    public static void main(String[] args) {
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax+b = 0");
        System.out.println();
=======
* Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b=0).
*
* @author: Raquel Lopez
*/
import java.util.Scanner;
public class T04Ejercicio05 {
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");

        System.out.print("Por favor, introduzca el valor de a: ");
        float a = s.nextFloat();

        System.out.print("Ahora introduzca el valor de b: ");
        float b = s.nextFloat();

        if (a==0) {
            System.out.println("Esa ecuación no tiene solución real.");
        } else {
            double solucion =  -(b/a);
            System.out.printf("x = %.4f\n", solucion);
            }

        s.close();
>>>>>>> 973c760551266b0fb9e2bc6604ba700d539e8c97
    }
}
