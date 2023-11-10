/**
*
* La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y nos ha pedido hacer un configurador que calcule el preciosegún el alto y el ancho. 
* El precio base de una bandera es de un céntimo de euro el centímetro cuadrado. 
* Si la queremos con un escudo bordado, el precio se incrementa en 2.50 € independientemente del tamaño. 
* Los gastos de envío son 3.25 €. El IVA ya está incluido en todas las tarifas.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;
public class T04Ejercicio25 {
  public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.println("\033[1;30mPRECIO\033[0m \033[1;41mBANDERAS\033[0m\033[1;43m DE \033[0m\033[1;41mESPAÑA\033[0m");
        System.out.print("Introduzca la altura de la bandera en cm: ");
        int anchura = s.nextInt();
        s.nextLine();
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        String bordado = s.nextLine().toLowerCase();
        s.close();

        // Precio de la tela
        double precio = 0.01*anchura;

        // Saber si lleva escudo y precio.
        String Escudo = "";
        double precioEscudo = 2.5;
        double gastosEnvio = 3.25;
        
        switch (bordado) {
            case "s":
                Escudo = "Con";
                break;

            case "n":
                Escudo = "Sin";
                precioEscudo = 0;
                break;
        
            default:
            System.out.println("La respuesta no es correcta.");
                break;
        }

        //Precio total
        double precioTotal = precio+precioEscudo+gastosEnvio;
        
        System.out.println("");
        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        System.out.printf("Bandera de %d cm\u00B2: %5.2f \u20AC\n", anchura, precio);
        System.out.printf("%s escudo: %13.2f \u20AC\n", Escudo, precioEscudo);
        System.out.printf("Gastos de envío: %8.2f \u20AC\n", gastosEnvio);
        System.out.printf("Total: %18.2f \u20AC\n", precioTotal);
    }
}