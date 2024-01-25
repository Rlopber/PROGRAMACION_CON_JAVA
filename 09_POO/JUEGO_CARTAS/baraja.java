public class baraja {
    
    //Atributo
    public static String[] palos = new String[] {"Oros", "Bastos", "Espadas", "Copas"};
    public static String[] numeros = new String[] {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
    private carta[] cartas = new carta[40];

    double puntuacion;
    

    // Constructor de la baraja
    public baraja() {
        this.inicializaBaraja();
     }

    //Crear la baraja
    private void inicializaBaraja() {
        int contador = 0;
  
        while(contador < this.cartas.length) {
           int index = (int)(Math.random() * (double)this.cartas.length);
           String palo = palos[(int)(Math.random() * 4.0)];
           boolean libre = true;
  
            for(int i = 0; i < contador && libre; ++i) {
                if (this.cartas[i].getNumero().equals(numeros[index % 10]) && this.cartas[i].getPalo().equals(palo)) {
                    libre = false;
                }
            }
  
            if (libre) {
                puntuacion = this.cartas[contador].obtenerPuntuacion();
                this.cartas[contador] = new carta(palo, numeros[index % 10], puntuacion);
                ++contador;
            }
        }
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
