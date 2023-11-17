/**
*
* Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
*
* @author: Raquel Lopez
*/

public class T05Ejercicio22 {
    public static void main(String[] args) {
        

        //Declarar variables
        boolean esPrimo = true;

        //Descripción del programa 
        System.out.println("Este programa muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.");
        System.out.println("Los números primos entre 2 y 100 son: ");


        //Resolución del problema
        for (int i = 2; i < 101; i++ ) { 
            if (i == 2) {
                System.out.println(i + " ");
            } else if (i%2 == 0) {
                esPrimo = false;
            } else{
                for (int i = 3; i <= Math.sqrt(numIntroducido); i += 2) { // Explicación del uso de la raíz al final.
                    if ((numIntroducido % i) == 0) {
                        esPrimo = false;
                    }
                }
            }
            }
        }
    }
}
