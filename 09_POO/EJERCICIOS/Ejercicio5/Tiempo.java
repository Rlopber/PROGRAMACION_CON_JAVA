package Ejercicio5;

public class Tiempo {
    ////Atributos
    private int horas;
    private int minutos;
    private int segundos;

    ////Constructores
    public Tiempo (int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    ////Getters
    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
   
    ////Métodos

    public void sumaTiempo() {
        
    }

    /* Suma */
    /* Resta */

    ////Override
    @Override
    public String toString() {
        return horas + "h " + minutos + "m " + segundos + "s";
    }

    
}
