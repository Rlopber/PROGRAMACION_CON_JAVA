/**
*
* Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio25 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        //Desclarar variables
        int numeroIntroducido;
        int numeroAlReves = 0;

        //Descripción del programa y entrada de datos
        System.out.println("¡Introduce cualquier número entero y le daré la vuelta!");
        System.out.print("El número que has elegido es: ");
        numeroIntroducido = s.nextInt();
        s.close();
        
        //Dar la vuelta a los números.
        int numero = numeroIntroducido; // Variable auxiliar para mantener no cambiar los datos de numeroIntroducido.
        
        while (numero > 0) {
        numeroAlReves = (numeroAlReves*10) + (numero%10);
        numero /= 10;
        }
        
        //Respuesta al usuario
        System.out.println();
        System.out.printf("El número que has introducido es \033[1;34m%d.\033[0m\n", numeroIntroducido);
        System.out.printf("El número al revés es \033[1;35m%d.\033[0m\n", numeroAlReves);
    }
}
