/**
*
* Conversor de Kb a Mb.
*
* @author: Raquel Lopez
*/

public class T03Ejercicio11 {
    public static void main(String[] args) {

        System.out.println("Conversor de KiloBytes a MegaBytes:");
        System.out.print("Cantidad en Kb: ");
        float kilo = Float.parseFloat(System.console().readLine());

        System.out.printf("%.2f Kb son %.2f Mb.\n", kilo, (kilo/1024));
    }
}

