/**
*
* Realiza un conversor del sistema decimal al sistema de “palotes”.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio37 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        //Desclarar variables
        int numeroInvertido = 0;
        int digito = 0;
        String resultadoPalito = "";

        //Descripción del programa y entrada de datos
        System.out.println("  \033[1;46mCONVERSOR DECIMAL-PALOTES\033[0m");
        System.out.println("=============================");
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int numero = s.nextInt();
        s.close();

        //Dar la vuelta al número
        int numeroOriginal = numero;

        while (numero > 0) {
            numeroInvertido = numeroInvertido * 10 + (numero % 10);
            numero /= 10;
        }

        // Coversión a palitos
        while (numeroInvertido>0) {
            digito = (int)(numeroInvertido%10);
            for (int i = 0; i < digito; i++) {
                resultadoPalito += "|";
            }
            
            // Verificar si hay más dígitos por procesar (número mayor que 9)
            if (numeroInvertido > 9) {
                resultadoPalito += "-";
            }
            numeroInvertido/=10;
        }

        System.out.println("El número " + numeroOriginal + " en decimal es el " + resultadoPalito + " en el sistema de palotes.");
    }    
}
