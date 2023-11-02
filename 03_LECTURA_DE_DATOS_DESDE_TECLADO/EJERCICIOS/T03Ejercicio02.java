/**
*
* Conversor de pesetas a euros.
*
* @author: Raquel Lopez
*/

public class T03Ejercicio02 {
    public static void main(String[] args) {
      

        System.out.print("¿Qué cantidad quieres pasar a pesetas?: ");
        double euros = Double.parseDouble(System.console().readLine());

        int pesetas = (int)(euros * 166.386);

        System.out.println(euros + " euros son " + pesetas + " pesetas.");
    
    }
}
