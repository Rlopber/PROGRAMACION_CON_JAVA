import funcionesmates.Varias;

/**
*
* Muestra los números primos que hay entre 1 y 1000.
*
* @author: Raquel Lopez
*/

public class T08Ejercicio15 {
    public static void main(String[] args) {
    
        for (int i = 1; i < 1000; i++) {
            if (Varias.esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }    
}
