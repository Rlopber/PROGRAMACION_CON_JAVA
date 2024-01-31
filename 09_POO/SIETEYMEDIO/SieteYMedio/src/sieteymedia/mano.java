package sieteymedia;

public class mano {
    carta[] cartas = new carta[40];
    int numeroCarta = 0;

    public mano() {
    }

    public void manodeCartas(carta carta) {
        this.cartas[this.numeroCarta] = carta;
        ++this.numeroCarta;
    }

    public double calcularPuntuacionTotal() {
        double puntuacionTotal = 0.0;
    
        // Utiliza un bucle for  para iterar sobre todas las cartas en la mano.
        for (carta cartaActual : this.cartas) {
            // Accede a la puntuación de la carta actual y la suma a la puntuación total.
            puntuacionTotal += cartaActual.getPuntos();
        }
    
        // Devuelve la puntuación total acumulada de todas las cartas en la mano.
        return puntuacionTotal;
    }
    

    public boolean esSieteYMedia() {
        return this.calcularPuntuacionTotal() == 7.5;
    }
}
