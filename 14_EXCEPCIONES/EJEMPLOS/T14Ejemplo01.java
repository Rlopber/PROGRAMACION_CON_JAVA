/**
*
* Primer uso de excepciones.
*
* @author Raquel Lopez
*/

import java.util.Scanner;

public class T14Ejemplo01 {
    public static void main(String[] args) {
        double numero1;
        double numero2;
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Introduzca el primer número: ");
            numero1 = Double.parseDouble(s.nextLine());
            System.out.print("Introduzca el segundo número: ");
            numero2 = Double.parseDouble(s.nextLine());
            s.close();
            System.out.println("La media es " + (numero1 + numero2)/2);
        } catch (Exception e) {
            System.out.println("No se puede calcular la media.");
            System.out.println("Los datos introducidos no son correctos.");
        } finally { //Es opcional
            System.out.println("Gracias por utilizar este programa.");
        }
    }
}
