/**
*
* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
*
* @author Raquel Lopez
*/

public class T05Ejercicio01 {
    public static void main(String[] args) {
        System.out.println("Este programa muestra los números múltiplos de 5 del 0 al 100.");

        for (int i = 0; i < 101; i += 5)
        System.out.print(i + " ");
    }
}
