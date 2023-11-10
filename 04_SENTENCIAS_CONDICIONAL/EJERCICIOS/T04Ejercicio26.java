/**
*
* Realiza un programa que calcule el precio de unas entradas de cine en función del número de personas y del día de la semana. 
* El precio base de una entrada son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. 
* Los jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
* Con la tarjeta CineCampa se obtiene un 10% de descuento. 
* Si un jueves, un grupo de 6 personas compran entradas, el precio total sería de 33 euros ya que son 3 parejas; pero si es un grupo de 7, 
* pagarán 3 entradas de pareja más 1 individual que son 41 euros (33 + 8).
*
* @author: Raquel Lopez
*/

import java.util.Scanner;
public class T04Ejercicio26 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("\033[1;32mVenta de entrada CineCampa\033[0m");
    System.out.println("\033[1;32m==========================\033[0m");
    System.out.print("Número de entradas: ");
    int numEntrada = s.nextInt();
    s.nextLine();
    System.out.print("Día de la semana: ");
    String dia = s.nextLine().toLowerCase();
    System.out.print("¿Tienes tarjeta CineCampa? (s/n): ");
    String tarjeta = s.nextLine().toLowerCase();
    s.close();

    // Precio de la entrada normal
    int precioBase = 8;

    //Determinar descuento
    double descuento = 0;

    if (tarjeta.equals("s")) {
        descuento = 0.1;
    }

    // Determinar precio final según el día de la semana.

    double precioFinal = 0;
    double precioParejas = 5.5;

    switch (dia) {
        case "lunes", "martes", "viernes", "sabado", "sábado", "domingo":
            precioFinal = precioBase*numEntrada;
            break;

        case "miercoles", "miércoles":
            precioBase = 5;
            precioFinal = precioBase*numEntrada;
            break;

        case "jueves":
            if (numEntrada%2==0) {
                precioFinal = precioParejas*numEntrada;
            } else {
                precioParejas = 5.5;
                precioFinal = (precioParejas*(numEntrada-1))+precioBase;
            }
            break;
    
        default:
            System.out.println("EL día de la semana que ha intrducido no es válido.");
            break;
    }

    System.out.println("");
    System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
    
    System.out.printf("Entradas individuales: %5d\n", numEntrada);
    System.out.printf("%s escudo: %13.2f \u20AC\n", Escudo, precioEscudo);
    System.out.printf("Gastos de envío: %8.2f \u20AC\n", gastosEnvio);
    System.out.printf("Total: %18.2f \u20AC\n", precioTotal);

    
   
  }  
}
/*
Aquí tiene sus entradas. Gracias por su compra.
Entradas individuales
4
Precio por entrada individual 8.00 €
Total
32.00 €
Descuento
A pagar
3.20 €
28.80 € */
