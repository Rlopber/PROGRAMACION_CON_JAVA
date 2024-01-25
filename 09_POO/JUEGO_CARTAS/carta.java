public class carta {

    //Atributo
    private String palo;    // Palo de la carta
    private String numero;  // Número de la carta
    private double valor;   // Puntuación de la carta

    //Constructor
    public carta (String palo, String numero, double valor) {
      this.palo = palo;
      this.numero = numero;
      this.valor = valor;
    }

    public String getPalo() {
        return this.palo;
    }
  
    public String getNumero() {
        return this.numero;
    }
  
    public double getValor() {
        return this.valor;
    }
  
    public String toString() {
        return String.format("%s de %s", this.numero, this.palo);
    }

    //Obtener la puntuación
    public double obtenerPuntuacion() {
        // Valor de la carta sota, caballo o rey = 0.5
        if (this.numero.equals("Sota") || this.numero.equals("Caballo") || this.numero.equals("Rey")) {
            return 0.5;
        } else if ((Integer.parseInt(this.numero) >= 1) && (Integer.parseInt(this.numero) <= 7)) {
            // Si es un número válido entre 1 y 7, se convierte a double y se devuelve
            return Double.parseDouble(this.numero);
        } else {
            // En caso de otras cartas
            throw new IllegalStateException("Número de carta inválido: " + this.numero);
        }
    }
}

