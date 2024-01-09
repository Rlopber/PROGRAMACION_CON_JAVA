import funcionesmates.Varias;

/**
*
* Muestra los números primos que hay entre 1 y 1000.
*
* @author: Raquel Lopez
*/

public class T08Ejercicio15 {
    public static void main(String[] args) {
    
        //Hacer bucle del 1 al 1000 y usar funcion de esPrimo para saber presentar en pantalla sólo los números primos.
        for (int i = 1; i <= 1000; i++) {
            if (Varias.esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }    
}
