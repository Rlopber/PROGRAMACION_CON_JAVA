/**
*
* Escribe un programa que calcule el precio final de un producto según su base imponible (precio antes de impuestos), 
* el tipo de IVA aplicado (general, reducido o superreducido) y el código promocional. 
* Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4% respectivamente. 
* Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan respectivamente que no se aplica promoción, 
* el precio se reduce a la mitad, se descuentan 5 euros o se descuenta el 5%. 
* El ejercicio se da por bueno si se muestran los valores correctos, aunque los números no estén tabulados.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T04Ejercicio23 {
  public static void main(String[] args) {
 
    Scanner s = new Scanner(System.in);

    System.out.println("\033[1;32mPRECIO FINAL\033[0m");
    System.out.print("Introduzca la base imponible: ");
    double baseImponible = s.nextDouble();
    s.nextLine();
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIva = s.nextLine().toLowerCase();
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String promocion = s.nextLine().toLowerCase();
    s.close();

    int porcentajeIva = 0;
    double descuento = 0;

    // Aplicar el iva
    if (tipoIva.equals("general")) {
        porcentajeIva =21;
    } else if (tipoIva.equals("reducido")) {
        porcentajeIva =7;
    } else if (tipoIva.equals("superreducido")) {
        porcentajeIva =4;
    }

    double iva = baseImponible * (porcentajeIva/100.0);
    double precioConIva = baseImponible + iva;

    // Aplicar la promoción
    switch (promocion) {
        case "nopro": //No tiene descuento
            break;
        
        case "mitad": //Precio a la mitad
            descuento = (precioConIva/2);
            break;
        
        case "meno5": //5 euros de descuento
            descuento = 5;
            break;

        case "5porc": //5% de descuento
            descuento = precioConIva*0.05;
            break;
            
        default:
        System.out.println("El descuento introducido no es correcto.");
            break;
    }

    double total = precioConIva - descuento;

    System.out.println("========================");
    System.out.printf("Base imponible       %6.2f \u20AC\n", baseImponible);
    System.out.printf("IVA (%2d%%)            %6.2f \u20AC\n", porcentajeIva, iva);
    System.out.printf("Precio con IVA       %6.2f \u20AC\n", precioConIva);
    System.out.printf("Cód. promo. (%5s)  %6.2f \u20AC\n", promocion, descuento);
    System.out.printf("TOTAL                %6.2f \u20AC\n", total);
  } 
}
