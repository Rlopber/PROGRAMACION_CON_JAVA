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
    double notaf = 0;

    if (media <5) {
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      String recu = s.next().toLowerCase();
        if (recu.equals("apto")) {
          notaf = 5;
        } else {
          notaf = media;
        }
      } else {
      notaf = media;
    }

    System.out.println("Tu nota de programación es " + notaf);
    s.close();
  }  
}
