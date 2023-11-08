/**
*
* Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar a la medianoche.
*
* @author Raquel Lopez
*/
import java.util.Scanner;


public class T04Ejercicio11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Este programa te dice los segundos que quedan para la media noche a partir de la hora que quieras.");
        System.out.print("Dime la hora (0 a 23): ");
        int hora = s.nextInt();
        System.out.print("Dime los minutos (0 a 59): ");
        int minuto = s.nextInt();

        if ((hora>24 || hora<0) || (minuto>59 || minuto<0)) {
            System.out.println("Alguno de los los valores introducidos no es válido.");
        } else {
            int segundosMedianoche = (23 - hora) * 3600 + (59 - minuto) * 60;
            System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos .\n", hora, minuto, segundosMedianoche);
        }

        s.close();
    }
}
