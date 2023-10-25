/**
 * Total de una factura a partir de una base imponible.
 * La base imponible se almacena en una variable.
 * 
 * @author: Raquel
*/
 public class T02Ejercicio06 {
    public static void main(String[] args) {
        
        double baseImponible = 1200.50;

        System.out.printf("Base imponible %8.2f\n", baseImponible);
        System.out.println("IVA                 21%");
        System.out.println("-----------------------");
        System.out.printf("Total          %8.2f\n", (baseImponible*1.21));
        
    }
 }
