package sieteymedia;

public class carta {

    //// Atributo
    private String palo;    // Palo de la carta
    private String numero;  // Número de la carta
    private double puntos;  // Puntuación de la carta

    //// Constructor
    public carta(String palo, String numero, double puntos) {
        this.palo = palo;
        this.numero = numero;
        this.puntos = puntos;
    }   

    ////Getter
    public String getPalo() {
        return this.palo;
    }
  
    public String getNumero() {
        return this.numero;
    }
  
    public double getPuntos() {
        return this.puntos;
    }

    /*No hacen falta setters porque no se van a modificar en ningún momento:
    * Ni los números, ni los palos ni los puntos 
    */

    @Override
    public String toString() {
        return String.format("%s de %s", this.numero, this.palo, this.puntos);
    }
}
