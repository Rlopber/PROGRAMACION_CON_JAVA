package Ejercicio16;

public class Punto {
    ////Atributos
    private double x;
    private double y;

    ////Constructores
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    ////Override
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
