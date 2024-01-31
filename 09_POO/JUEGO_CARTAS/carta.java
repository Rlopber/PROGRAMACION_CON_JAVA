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

    //Métodos getter
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
        } else { //El resto devuelve el valor del propio numero
            try {
                return Double.parseDouble(this.numero);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Número de carta no válido: " + this.numero);
            }
        }
    }
}

