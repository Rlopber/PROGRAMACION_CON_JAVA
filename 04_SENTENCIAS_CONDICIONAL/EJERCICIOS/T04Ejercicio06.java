/**
*
* Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h. 
* Aplica la fórmula t =√250h/g siendo g = 9.81m/s2
*
* @author: Raquel Lopez
*/

import java.util.Scanner;
public class T04Ejercicio06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Este programa calcula el tiempo que tardará en caer un objeto desde cierta altura.");

        System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
        double h = s.nextDouble();

        final double G = 9.81; //Como g es un valor constante (gravedad), final lo declara como constante.

        if (h<=0) {
            System.out.println("No hay tiempo de caída si la altura es 0 o negativa.");
        } else {
            double solucion = (double) Math.sqrt(2*h/G);
             if (h == (int) h) {
            System.out.printf("El tiempo que tarda el objeto en caer desde %.0f metros es de %.4f segundos.\n", h, solucion); //Si queremos que salgan los segundos como comillas, hay que poner %.af\"
            } else {
            System.out.printf("El tiempo que tarda el objeto en caer desde %.2f metros es de %.4f segundos.\n", h, solucion);
            }
        }
        s.close();
    }
}
