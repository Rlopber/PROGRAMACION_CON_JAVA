package Ejercicio17;

public class Rectangulo {
    ////Atributos
    private int altura;
    private int base;
    private static int rectangulosCreados;

    ////Constructores
    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
        rectangulosCreados++;
    }

    /* Contador de pirámides creadas */
    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

    ////Override
    @Override
    public String toString() {
        String cadena = "";

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                cadena += "*";
            }
            cadena +="\n";
        }
        return cadena;
    }
}
