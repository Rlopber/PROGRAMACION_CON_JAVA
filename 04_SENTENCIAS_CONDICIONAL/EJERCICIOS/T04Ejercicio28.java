/**
*
* Descripción del programa
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T04Ejercicio28 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Turno del \033[1;31mjugador 1\033[0m (introduzca piedra, papel o tijera): ");
        String jugada1 = s.nextLine().toLowerCase();
        System.out.print("Turno del \033[1;34mjugador 2\033[0m (introduzca piedra, papel o tijera): ");
        String jugada2 = s.nextLine().toLowerCase();
        s.close();

        if (jugada1.equals(jugada2)) {
            System.out.println("¡La jugada queda en \033[1;33mempate\033[0m!");
            return;

        } else {
            int ganador = 1;
            switch (jugada2) {
                case "piedra":
                    if (jugada1.equals("tijeras")) {
                        ganador = 2;
                    }
                    break;

                case "tijeras":
                    if (jugada1.equals("papel")) {
                        ganador = 2;
                    }
                    break;

                case "papel":
                    if (jugada1.equals("piedra")) {
                        ganador = 2;
                    }
                    break;

                default:
                    System.out.println("Alguna de las opciones no es válida, ¡inténtalo de nuevo!");
                    return;
            }

            if (ganador == 1) { 
                System.out.println("¡El ganador es el \033[1;31mjugador 1\033[0m!");
            } else if (ganador == 2) {
                System.out.println("¡El ganador es el \033[1;34mjugador 2\033[0m!");
            }
        }
    }
}
