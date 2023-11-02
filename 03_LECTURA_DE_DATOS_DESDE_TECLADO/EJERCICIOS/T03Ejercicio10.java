/**
*
* Conversor de Mb a Kb.
*
* @author: Raquel Lopez
*/

public class T03Ejercicio10 {
    public static void main(String[] args) {

        System.out.println("Conversor de MegaBytes a KiloBytes:");
        System.out.print("Cantidad en Mb: ");
        float mega = Float.parseFloat(System.console().readLine());

        System.out.println(mega + " Mb son " + (mega*1024) + " Kb.");
    }
}
