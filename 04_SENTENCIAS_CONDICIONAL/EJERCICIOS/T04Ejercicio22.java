/**
*
* Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y minutos), 
* calcule cuántos minutos faltan para el fin de semana.
* Se considerará que el fin de semana comienza el viernes a las 15:00h. 
* Se da por hecho que el usuario introducirá un día y hora correctos, anterior al viernes a las 15:00h.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;
import static colors.ConsoleColors.*;

public class T04Ejercicio22 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(BLACK_BOLD + "=============================" + RESET);
        System.out.println("||" + PURPLE_BACKGROUND +  "CONTADOR DE FIN DE SEMANA" + RESET + "||");
        System.out.println(BLACK_BOLD + "=============================" + RESET);
        System.out.print("Día de la semana (de lunes a viernes): ");
        String dia = s.nextLine().toLowerCase();
        System.out.print("Hora (horas y minutos separados por un \":\"): ");
        String entradaHora = s.nextLine();
        s.close();

        // Procesar la entrada para obtener horas y minutos
        String[] partesHora = entradaHora.split(":");
        int horas = Integer.parseInt(partesHora[0]);
        int minutos = Integer.parseInt(partesHora[1]);

        int minutosFinal = 0;
        int horaFinal = 0;

        if ((minutos>0) && (minutos<=59)) {
            minutosFinal = 60 - minutos;
            horas ++;
        }

        switch (dia) {
            case "lunes":
                horaFinal = (24-horas) + (24*3) + 15;
                break;

            case "martes":
                horaFinal = (24-horas) + (24*2) + 15;
                break;

            case "miércoles", "miercoles":
                horaFinal = (24-horas) + 24 + 15;
                break;

            case "jueves":
                horaFinal = (24-horas) + 15;
                break;

            case "viernes":
                horaFinal = (24-horas);
                break;

            default:
                System.out.println("El día de la semana no es válido");
                break;
        }

        System.out.printf("¡Te quedan %d horas y %d minutos para el fin de semana!", horaFinal, minutosFinal);
    }
}

