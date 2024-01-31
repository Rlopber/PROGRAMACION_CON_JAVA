public class baraja {
    
    //Atributo
    private String[] palos = new String[] {"Oros", "Bastos", "Espadas", "Copas"};
    private String[] numeros = new String[] {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
    private carta[] cartas = new carta[40];

    double puntuacion;
    

    // Constructor de la baraja
    public baraja() {
        this.inicializaBaraja();
     }

    //Crear la baraja
    public void inicializaBaraja() {
        int contador = 0;

        do {
            for (int i = 0; i < palos.length; i++) {
                for (int j = 0; j < numeros.length; j++) {
                    puntuacion = numeros[j].obtenerPuntuacion();
                    this.cartas[contador] = new carta(palos[i], numeros[j], puntuacion);
                    System.out.println(this.cartas[contador]);
                    contador++;
                }
            }
        } while (contador < 40);
    }

    //Barajar las cartas
    public void mezclarBaraja() {
        for (int i = this.cartas.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i+1));

            //Intercambiar las posiciones de las cartas i - j
            carta auxiliar = this.cartas[i];
            this.cartas[i] = this.cartas[j];
            this.cartas[j] = auxiliar;
        }
    }
}
