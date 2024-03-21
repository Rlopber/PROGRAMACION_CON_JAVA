package T10Ejercicio08;
import java.util.ArrayList;

/**
*
* Realiza un programa que escoja al azar 10 cartas de la mano española (10 objetos de la clase Carta). 
* Emplea un objeto de la clase ArrayList para almacenarlas y asegúrate de que no se repite ninguna.
*
* @author: Raquel Lopez
*/

public class AppCarta {
    public static void main(String[] args) {

        final int TOTAL_CARTAS = 10;

        ArrayList<Carta> mano = new ArrayList<>();

        Carta c = new Carta();
        mano.add(c);

        for (int i = 0; i < TOTAL_CARTAS; i++) {
            do {
                c = new Carta();
            } while (mano.contains(c));

            mano.add(c);
        }

        System.out.println("");
        
        for (Carta carta : mano) {
            System.out.println(carta);
        }
    }
}
