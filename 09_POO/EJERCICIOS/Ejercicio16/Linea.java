package Ejercicio16;

public class Linea {
    ////Atributos
    private Punto origen;
    private Punto fin;

    ////Constructores
    public Linea(Punto origen, Punto fin) {
        this.origen = origen;
        this.fin = fin;
    }

    ////Override
    @Override
    public String toString() {
        return "La línea está formada por los puntos " + origen + " y " + fin + "";
    }
}
