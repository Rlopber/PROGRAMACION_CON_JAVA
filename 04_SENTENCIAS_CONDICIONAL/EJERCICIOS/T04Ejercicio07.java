/**
*
* Realiza un programa que calcule la media de tres notas.
*
* @author: Raquel Lopez
*/
import java.util.Scanner;
public class T04Ejercicio07 {
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
        }
        s.close();
    }
}
