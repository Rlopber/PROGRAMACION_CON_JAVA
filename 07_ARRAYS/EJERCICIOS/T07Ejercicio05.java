/**
*
* Descripción del programa
*
* @author: Raquel Lopez
*/

public class T07Ejercicio05 {
    public static void main(String[] args) {

        int[] numero = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        System.out.println("Introduzca números enteros y pulse INTRO: ");

        for (int i = 0; i < numero.length; i++) {
            numero[i] = Integer.parseInt(System.console().readLine());
            
            if (numero[i]>maximo) {
                maximo = numero[i];
            } else if (numero[i]<minimo) {
                minimo = numero[i];
            }
        }

        System.out.println("Tus números son: ");
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i] + " ");
            if (numero[i] == maximo) {
                System.out.print(" máximo");
            }

            if (numero[i] == minimo) {
                System.out.print(" mínimo");
            }
        }
    }
}
