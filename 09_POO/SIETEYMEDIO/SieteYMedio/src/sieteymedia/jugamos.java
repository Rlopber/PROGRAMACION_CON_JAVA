package sieteymedia;

public class jugamos {
   jugador jugador;
   jugador ordenador;
   baraja baraja;

   public jugamos(String nombreJugador, double fondos) {
      this.inicializa(nombreJugador, fondos);
   }

   public void inicializa(String nombreJugador, double fondos) {
      this.baraja = new baraja();
      this.jugador = new jugador(nombreJugador, fondos, this.baraja);
      this.ordenador = new jugador("Ordenador", 0.0, this.baraja);
   }
}
