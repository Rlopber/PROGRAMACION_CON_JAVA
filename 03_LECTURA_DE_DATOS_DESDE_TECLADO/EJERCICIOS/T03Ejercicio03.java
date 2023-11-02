/**
*
* Descripción del programa
*
* @author: Raquel Lopez
*/

public class T03Ejercicio03 {
    public static void main(String[] args) {
      

        System.out.print("¿Qué cantidad quieres pasar a euros?: ");
        int pesetas = Integer.parseInt(System.console().readLine());

        double euros = pesetas/166.386;

        System.out.printf("%d pesetas son %.2f euros.\n", pesetas, euros);
    
    }
}
