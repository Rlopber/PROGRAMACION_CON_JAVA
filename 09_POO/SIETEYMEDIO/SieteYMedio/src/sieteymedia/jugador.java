package sieteymedia;

public class jugador {

    private baraja baraja;
    private String nombre;
    private double fondos;
    mano mano;

    public jugador(String nombre, double fondos, baraja baraja) {
        this.baraja = baraja;
        this.fondos = fondos;
        this.nombre = nombre;
        this.mano = new mano();
    }

   public double getFondos() {
        return this.fondos;
    }

   public String getNombre() {
        return this.nombre;
    }

   public void recibirCarta() {
        this.mano.manodeCartas(this.baraja.extraerCarta());
    }
}
