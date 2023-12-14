/**
*
* Descripción del programa
*
* @author: Raquel Lopez
*/

public class NumeroPrimoConFuncion {

    ///Funciones definidas por el usuario
    public static boolean esPrimo(int x) {

        if (x <= 1) { // 0 y 1 no son primos.
            return false;
        } else if (x == 2) {
            return true;
        } else if (x%2 == 0) {
            return false;
        } else{
            for (int i = 3; i <= Math.sqrt(x); i += 2) { /*Explicacion en T05Ejercicio16 */
                if ((x % i) == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.print("Introduce un número entero positivo: ");
        int numIntroducido = Integer.parseInt(System.console().readLine());

        if (esPrimo(numIntroducido)) {
            System.out.println("El número " + numIntroducido + " es primo.");
        } else {
            System.out.println("El número " + numIntroducido + " no es primo.");
        }
    }
}
