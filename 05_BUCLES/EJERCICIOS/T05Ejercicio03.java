/**
*
* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
*
* @author Raquel Lopez
*/

public class T05Ejercicio03 {
    public static void main(String[] args) {
        System.out.println("Este programa muestra los números múltiplos de 5 del 0 al 100.");

        int i = 0;

        do {
            System.out.print(i + " ");
            i += 5 ;
        } while (i < 101);
    }
}