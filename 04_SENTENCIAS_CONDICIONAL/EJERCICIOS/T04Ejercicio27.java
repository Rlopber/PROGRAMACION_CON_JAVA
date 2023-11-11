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
            System.out.print("¿De qué tipo de chocolate (blanco o negro)?: ");
            tipoChoco = s.nextLine().toLowerCase();
        }
    System.out.print("¿Quiere nata?: (s/n) ");
    String nata = s.nextLine().toLowerCase();
    System.out.print("¿Quiere ponerle un nombre?: (s/n) ");
    String nombre = s.nextLine().toLowerCase();

    s.close();

    // Declaración de varibles

    double precioTarta = 0;
    double precioNata = 0;
    double precioNombre = 0;
    

    // Precios según el sabor
    switch (sabor) {
        case "manzana":
            precioTarta = 18;
            break;
        
        case "fresa":
            precioTarta = 16;
            break;

        case "chocolate":
            if (tipoChoco.equals("blanco")) {
                sabor = "chocolate blanco";
                precioTarta = 15;
            } else if (tipoChoco.equals("negro")) {
                sabor = "chocolate negro";
                precioTarta = 14;
            }
            break;

        default:
            System.out.println("¡No has elegido nuestros sabores de tartas!");
            return;
    }

    System.out.println("");
    System.out.println("\033[1;30mTu ticket:\033[0m");
    System.out.printf("Tarta de %s: %.2f \u20AC\n", sabor, precioTarta);
    if (nata.equals("s")) {
        precioNata = 2.5;
        System.out.printf("Con nata: %.2f \u20AC\n", precioNata);
    }
    if (nombre.equals("s")) {
        precioNombre = 2.75;
        System.out.printf("Con nombre: %.2f \u20AC\n", precioNombre);
    }

    double precioTotal = precioTarta + precioNata + precioNombre;

    System.out.printf("Total: %.2f \u20AC\n", precioTotal);

  }  
}
