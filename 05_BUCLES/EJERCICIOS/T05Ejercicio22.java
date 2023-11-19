/**
*
* Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
*
* @author: Raquel Lopez
*/

public class T05Ejercicio22 {
    public static void main(String[] args) {

        // Declarar variables
        int numeroActual;
        int divisor; //Variable para verificar los números primos.

        // Descripción del programa
        System.out.println("Este programa muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.");
        System.out.println("Los números primos entre 2 y 100 son: ");

        // Resolución del problema
        for (numeroActual = 2; numeroActual < 101; numeroActual++) {
            boolean esPrimo = true;
            if (numeroActual > 2 && numeroActual % 2 == 0) {
                esPrimo = false;
            } else {
                for (divisor = 3; divisor <= Math.sqrt(numeroActual); divisor += 2) {
                    if ((numeroActual % divisor) == 0) {
                        esPrimo = false;
                        divisor = (int) Math.sqrt(numeroActual) + 1;  // Forzar la salida del bucle
                    }
                }

                if (esPrimo) {
                    System.out.print(numeroActual + " ");
                }
            }
        }
    }
}


/*
La raíz cuadrada de 36 es 6. 
Si encuentras un divisor que es mayor que 6 (digamos 9), entonces automáticamente tendrías otro divisor que es menor que 6 (en este caso, 4), 
porque la multiplicación de esos dos números debe ser igual al número original (36).

Entonces, si no encuentras ningún divisor menor que o igual a la raíz cuadrada, tampoco encontrarás ninguno mayor que la raíz cuadrada. 
Por lo tanto, puedes ahorrar tiempo y recursos al limitar tu búsqueda hasta la raíz cuadrada, ya que cubre todos los posibles casos sin la necesidad de verificar más allá de ese punto. 
*/
