package sieteymedia;

public class baraja {
    
    //// Atributos
    private String[] palos = {"Oros", "Bastos", "Espadas", "Copas"};
    private String[] valores = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
    private carta[] cartas; // Es un array del objeto carta, en su interior lo que hay es una "carta", el objeto, con su palo, numero y puntos.
    private int numeroCartas;
    
    //// Constructor
    public baraja() {
        numeroCartas = palos.length * valores.length; // 4 * 10 = 40 cartas
        cartas = new carta[numeroCartas];             // Con esto creamos las 40 cartas con valores "null"
    }

    //// Métodos
    
    //Creamos la baraja
    public void inicializaBaraja() {
        int indice = 0;
        while (indice < numeroCartas) { //Este while no es necesario, pero se puede poner por control
            for (int i = 0; i < palos.length; i++) {
                for (int j = 0; j < valores.length; j++) {
                    cartas[indice] = new carta(palos[i], valores[j],   puntuacionCarta(j));
                    indice++;
                }
            }
        }
    }

    //Otra forma de dar puntuacion
    public double puntuacionCarta(int j) {
        return j < 7 ? j + 1 : 0.5; //Esta estructura es un if / else
    }
    
    //Ver la baraja
    public void mostrarBaraja() {
        for (int i = 0; i < numeroCartas; i++) {
            System.out.printf("%-30s PUNTUACIÓN: %.1f\n", cartas[i].toString(), cartas[i].getPuntos());
        }
    }

    //Barajar las cartas
    private void mezclarBaraja() {
        for (int i = this.cartas.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));

            //Intercambiar las posiciones de las cartas i - j
            carta auxiliar = this.cartas[i];
            this.cartas[i] = this.cartas[j];
            this.cartas[j] = auxiliar;
        }
    }

    public static void main(String[] args) {
        baraja barajaEsp = new baraja();
        barajaEsp.inicializaBaraja();
        //barajaEsp.mostrarBaraja();
        barajaEsp.mezclarBaraja();
        barajaEsp.mostrarBaraja();
    }
}

//Dar una puntuación a la carta
    /*  public double puntuacionCarta(int j) {
        if (j < 7) {
            return j + 1; // En j = 0, queremos el valor j = 1
        } else {
            return 0.5;
        }*/
