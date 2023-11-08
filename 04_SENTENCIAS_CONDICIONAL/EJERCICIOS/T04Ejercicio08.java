/**
*
* Realiza un programa que calcule la media de tres notas y que diga la nota del boletín 
*(insuficiente, suficiente, bien, notable o sobresaliente).
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T04Ejercicio08 {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

        System.out.println("Con este programa vamos a hacer la media de tres notas.");

        System.out.print("Por favor, introduzca la primera nota: ");
        double nota1 = s.nextDouble();
        System.out.print("Por favor, introduzca la primera segunda: ");
        double nota2 = s.nextDouble();
        System.out.print("Por favor, introduzca la segunda nota: ");
        double nota3 = s.nextDouble();

        if (nota1<0 || nota2<0 || nota3<0) {
            System.out.println("No puede haber notas negativas.");
        } else {
            double media = (nota1+nota2+nota3)/3;
            System.out.printf("La media de las notas añadidas es de %.2f.\n", media);
            
        if (media<5){
            System.out.println("Tu nota final es: insuficiente.");
        } else if (media<6) {
            System.out.println("Tu nota final es: suficiente.");
        } else if (media<7) {
            System.out.println("Tu nota final es: bien.");
        } else if (media<9) {
            System.out.println("Tu nota final: notable.");
        } else {
            System.out.println("Tu nota final: sobresaliente.");
        }
        }
        s.close();
    }
}
