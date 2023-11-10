import java.util.Scanner;

/**
*
* Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas. 
* El programa preguntará primero de qué sabor quiere el usuario la tarta: manzana, fresa o chocolate. 
* La tarta de manzana vale 18 euros y la de fresa 16. 
* En caso de seleccionar la tarta de chocolate, el programa debe preguntar además si el chocolate es negro o blanco; 
* la primera opción vale 14 euros y la segunda 15. 
* Por último se pregunta si se añade nata y si se personaliza con un nombre; 
* la nata suma 2.50 y la escritura del nombre 2.75.
*
* @author Raquel Lopez
*/

import java.util.Scanner;

public class T04Ejercicio27 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    String tipoChoco = "";

    System.out.println("\033[1;35m    Venta de TARTAS\033[0m");
    System.out.println("\033[1;32m=======================\033[0m");
    System.out.print("Elija uno de nuestros sabores (manzana, fresa o chocolate): ");
    String sabor = s.nextLine().toLowerCase();
        if (sabor.equals("chocolate")) {
            System.out.println("¿De qué tipo de chocolate (blanco o negro)?: ");
            tipoChoco = s.nextLine().toLowerCase();
        }
    System.out.println("¿Quiere nata? (s/n)");
    String nata = s.nextLine().toLowerCase();
    System.out.println("¿Quiere ponerle un nombre? (s/n)");
    String nombre = s.nextLine().toLowerCase();

    s.close();

    // Precios según el sabor

    int precioTarta = 0;

    switch (sabor) {
        case "manzana":
            precioTarta = 18;
            break;
        
        case "fresa":
            precioTarta = 16;
            break;

        case "chocolate":
            switch (tipoChoco) {
                case "blanco":
                    precioTarta = 15;
            }
            
            precioTarta = 18;
            break;
        default:
            break;
    }
  }  
}

/*Elija un sabor (manzana, fresa o chocolate): chocolate
¿Qué tipo de chocolate quiere? (negro o blanco): negro
¿Quiere nata? (si o no): si
¿Quiere ponerle un nombre? (si o no): no
Tarta de chocolate negro: 14,00 €
Con nata: 2,50 €
Total: 16,50 € */