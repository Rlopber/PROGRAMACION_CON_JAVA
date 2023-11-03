/**
*
* Programa que pida una hora por teclado y muestre buenos días, buenas tardes o buenas noches.
* Los tramos son de 6 a 12, de 13 a 20 y de 21 a 5.
* No tienen que introducir los minutos, sólo las horas.
*
* @author Raquel Lopez
*/

public class T04Ejercicio02 {
    public static void main(String[] args) {
        
        System.out.print("Dime qué hora es de en formato de 24 horas (sin los minutos): ");
        int hora = Integer.parseInt(System.console().readLine());

        if (hora >= 6 && hora <= 12) {
            System.out.println("¡Buenos días!");
        } else if (hora >12 && hora <=20) {
            System.out.println("¡Buenas tardes!");
        } else if (hora >20 && hora <=24 || hora>=1 && hora <=5) {
            System.out.println("¡Buenas noches!");
        } else {
            System.out.println("El número introducido no es válido.");
        }
    }
}
