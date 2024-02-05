package Ejercicio6;

public class Tiempo {
    ////Atributos
    private int horas;
    private int minutos;
    private int segundos;

    int segundosTotales;

    ////Constructores
    public Tiempo (int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        pasarASegundos();
    }
    

    ////Métodos
    /* Se pasa todo a segundos */
    private int pasarASegundos() {
        return (this.horas * 3600) + (this.minutos * 60) + this.segundos;
    }

    /*  Pasa los segundos a horas, minutos, segundos */
    private void pasarAFormatoHMS(int segundosTotales) {
        this.horas = segundosTotales / 3600;
        segundosTotales %= 3600;
        this.minutos = segundosTotales / 60;
        this.segundos = segundosTotales % 60;
    }

    /* Suma */
    public static Tiempo sumarTiempos(Tiempo t1, Tiempo t2) {
        int totalSegundos = t1.pasarASegundos() + t2.pasarASegundos();
        Tiempo resultado = new Tiempo(0, 0, totalSegundos);
        resultado.pasarAFormatoHMS(totalSegundos);
        return resultado;
    }

    /* Resta */
    public static Tiempo restarTiempos(Tiempo t1, Tiempo t2) {
        int totalSegundos = t1.pasarASegundos() - t2.pasarASegundos();
        Tiempo resultado = new Tiempo(0, 0, totalSegundos);
        resultado.pasarAFormatoHMS(totalSegundos);
        return resultado;
    }

    ////Override
    @Override
    public String toString() {
        return horas + "h " + minutos + "m " + segundos + "s";
    }
}