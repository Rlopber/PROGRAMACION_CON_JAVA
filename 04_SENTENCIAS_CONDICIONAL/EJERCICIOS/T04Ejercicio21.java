/**
*
* Descripción del programa
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T04Ejercicio21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("¿Cuál fue la nota de tu primer control?: ");
    double nota1 = s.nextDouble();
    System.out.print("¿Cuál fue la nota de tu segundo control?: ");
    double nota2 = s.nextDouble();

    double media = (nota1+nota2)/2;

    if (media <5) {
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      String recu = s.next().toLowerCase();
        if (recu.equals("apto")) {
          media = 5;
        } 
    }
    
    System.out.println("Tu nota de programación es " + media);
    s.close();
  }  
}
