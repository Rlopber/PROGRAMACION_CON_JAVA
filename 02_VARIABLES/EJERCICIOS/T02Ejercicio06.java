/**
 * Total de una factura a partir de una base imponible.
 * La base imponible se almacena en una variable.
 * 
 * @author: Raquel
*/
 public class T02Ejercicio06 {
    public static void main(String[] args) {
        int factura = 5600;
        double baseImponible = 0.21;
        
        double totalFactura = factura+(factura*baseImponible);

        System.out.printf("El total de la factura de %d euros más su base imponible del 21%% es de %.2f euros.\n", factura, totalFactura);
    }
 }
