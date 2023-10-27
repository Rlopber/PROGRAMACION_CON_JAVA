/**
 * 
 * Programa que pida dos números y que luego muestre el resultado de su multiplicación.
 * 
 * @author Raquel López
 */

public class T03Ejercicio01 {
    public static void main(String[] args) {
        
        System.out.print("Introduce un número: ");
        int num1 = Integer.parseInt ( System.console().readLine() );

        System.out.print("Introduce otro número: ");
        int num2 = Integer.parseInt ( System.console().readLine() );
       
        System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
    }
}
