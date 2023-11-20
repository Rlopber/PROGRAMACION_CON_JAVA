/**
*
* Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número leído por teclado.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio27 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        //Desclarar variables
        int contador=0;
        int suma=0;

        //Descripción del programa y entrada de datos
        System.out.println("Este programa cuenta y suma múltiplos de 3 hasta el número que ingreses.");
        System.out.print("¿Qué número has elegido?: ");
        int numeroIntroducido = s.nextInt();
        s.close();

        //Contar y sumar los números.
      
            for (int i = 3; i <= numeroIntroducido; i+=3) {
                contador ++;
                suma += i;
            }

        //Resolución del problema
        System.out.printf("Desde 1 hasta %d hay \033[1;31m%d\033[0m múltiplos de 3 y la suma de ellos es \033[1;32m%d\033[0m.", numeroIntroducido, contador, suma);
    }
}