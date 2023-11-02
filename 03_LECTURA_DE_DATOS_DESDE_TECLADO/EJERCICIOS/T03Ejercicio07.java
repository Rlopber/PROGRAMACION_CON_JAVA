/**
*
* Calcular el total de una factura a partir de la base imponible.
*
* @author: Raquel Lopez
*/

public class T03Ejercicio07 {
    public static void main(String[] args) {
        System.out.print("Introduzca el importe total de su factura (sin IVA): ");
        double factura = Double.parseDouble(System.console().readLine());
    
        System.out.printf("Factura        %8.2f €\n", factura);
        System.out.printf("IVA (21%%)      %8.2f €\n", (factura * 0.21));
        System.out.printf("-------------------------\n");
        System.out.printf("Total          %8.2f €\n", (factura * 1.21));
    }
}
