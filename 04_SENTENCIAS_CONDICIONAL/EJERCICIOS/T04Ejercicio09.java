/**
*
* Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax^2 + bx + c = 0).
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T04Ejercicio09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Este programa resuelve la ecuaciones de segundo grado: \033[1;30max² + bx + c = 0\033[0m");

        System.out.println("Por favor, introduzca los valores: ");
        System.out.print("a = ");
        double a = s.nextDouble();
        System.out.print("b = ");
        double b = s.nextDouble();
        System.out.print("c = ");
        double c = s.nextDouble();
        
        s.close();
        
        double discriminante = (Math.pow(b, 2)-(4*a*c));
        double x1 = (-b+Math.sqrt(discriminante))/(2*a);
        double x2 = (-b-Math.sqrt(discriminante))/(2*a);

        // 0x^2 + 0x + 0 = 0
        if ((a==0) && (b==0) && (c==0)) {
            System.out.println("La ecuación tiene infinitas soluciones.");

        // 0x^2 + 0x + c = 0 con c distinto a 0
        } else if ((a==0) && (b==0) && (c!=0)) {
            System.out.println("La ecuación no tiene solución.");

        // ax^2 + bx + 0 = 0 con a y b distintos a 0

        } else if ((a!=0) && (b!=0) && (c==0)) {
            System.out.println("x1 = 0" );
            System.out.printf("El valor 2 es x2 = %.4f\n", x2);
        
        // 0x^2 + bx + c = 0  con b y c distintos de 0     
        } else if ((a==0) && (b!=0) && (c!=0)) {
            System.out.printf("La ecuación pasa a ser de primer grado, siendo x = %.4f\n", (-c/b));

        // ax^2 + bx + c = 0  con a, b y c distintos de 0
        } else {
            if (discriminante<0) {
                System.out.println("La ecuación no tiene soluciones reales");
            }  else {
              System.out.printf("El valor 1 es x1 = %.4f\n", x1);
              System.out.printf("El valor 2 es x2 = %.4f\n", x2);
            }
        }
    }
}
