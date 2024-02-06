package Ejercicio14;

public class FichaDomino {

    ////Atributos
    private int lado1;
    private int lado2;
    
    ////Constructores
    public FichaDomino(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
   
    ////Getters
    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    ////Método
    public String voltea() {
        int aux = lado1;
        lado1 = lado2;
        lado2 = aux;
        return toString();
    }

    public boolean encaja(FichaDomino ficha) {
        if (this.lado1 == ficha.getLado2() || this.lado2 == ficha.getLado1() || this.lado1 == ficha.getLado1() || this.lado2 == ficha.getLado2()) {
            return true;
        } else {
            return false;
        }
    }

    ////Override
    @Override
    public String toString() {
        return "[" + ((lado1 == 0) ? " " : lado1) + "|" + ((lado2 == 0) ? " " : lado2) + "]";
    }
}
