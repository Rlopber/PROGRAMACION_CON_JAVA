/**
*
* Realiza un programa que calcule el precio de un desayuno. El programa preguntará primero qué ha tomado el usuario de comer: palmera, donut o pitufo. 
* La palmera vale 1.40 € y el donut 1 €. 
* En caso de tomar pitufo, el programa debe preguntar además si era con aceite o con tortilla; 
* el primero vale 1’20 € y el segundo 1’60 €. 
* Por último se pregunta por la bebida: zumo o café a 1’50 y 1’20 respectivamente.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T04Ejercicio29 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    String pitufo = "";

    System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
    String comida = s.nextLine().toLowerCase();
        if (comida.equals("pitufo")) {
            System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
            pitufo = s.nextLine().toLowerCase();
        }
    System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
    String bebida = s.nextLine();
    s.close();
    
        // Precios para la comida
        double precioC = 0;

        switch (comida) {
            case "palmera":
                precioC = 1.4;
                System.out.println("Palmera: 1,40 €");
                break;

            case "donut":
                precioC = 1;
                System.out.println("Donut: 1,00 €");
                break;

            case "pitufo":
                if (pitufo.equals("aceite")) {
                    precioC = 1.2;
                    System.out.println("Pitufo con aceite: 1,20 €");
                } else if (pitufo.equals("tortilla")) {
                    precioC = 1.6;
                    System.out.println("Pitufo con tortilla: 1,60 €");
                }
                break;

            default:
                System.out.println("Ese plato no está en el menú de desayuno, lo siento.");
                return;
        }

        // Precio para la bebida
        double precioB = 0;

        switch (bebida) {
            case "cafe":
                precioB = 1.2;
                System.out.println("Café: 1,20 €");
                break;

            case "zumo":
                precioB = 1.5;
                System.out.println("Zumo: 1,50 €");
                break;
        
            default:
                System.out.println("Esa bebida no está en el menú de desayuno, lo siento.");
                return;
        }
        System.out.printf("Total desayuno %.2f €", (precioB+precioC));
  }  
}
