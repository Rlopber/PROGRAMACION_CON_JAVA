public class carta {

    //Atributo
    private String palo;
    private String numero;
    private double valor;

    //Constructor
    public carta (String palo, String numero, double valor) {
      this.palo = palo;
      this.numero = numero;
      this.valor = valor;
    }

    //Método
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
