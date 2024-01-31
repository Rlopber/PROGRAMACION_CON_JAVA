import sieteymedia.*;

public class App {
    public static void main(String[] args) throws Exception {

        baraja barajaEsp = new baraja();
        
        System.out.println("Haciendo pruebas de como hacer funcionar esto.");

        System.out.println("Conozcamos a los jugadores: ");
        System.out.println("¿Cómo te llamas?: ");
        String nombreJugador1 = System.console().readLine();

        System.out.println("¿Cuánto dinero traes?");
        double fondo = Integer.parseInt(System.console().readLine());

        System.out.println("¿Y el otro jugador? Ah... ¡Soy yo!");
        String nombreJugador2 = "Ordenador";

        jugador humano = new jugador(nombreJugador1, fondo);
        jugador ordenador = new jugador(nombreJugador2, 100);
    }
}
