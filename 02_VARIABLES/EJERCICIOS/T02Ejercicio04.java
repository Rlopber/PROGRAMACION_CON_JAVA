/**
 * Conversor de euros a pesetas.
 * 
 * @author: Raquel
*/
 public class T02Ejercicio04 {
    public static void main(String[] args) {

        double euros = 6;
        int pesetas = (int)(euros * 166.386);

        System.out.printf("%.2f euros son %d pesetas.\n", euros, pesetas);
    }
 }