package Ejercicio15;

public class FichaDomino {

    ////Atributos
    private int lado1;
    private int lado2;
    
    ////Constructores
    public FichaDomino() {
        this.lado1 = (int)(Math.random() * 7);
        this.lado2 = (int)(Math.random() * 7);
    }
   
    ////Getters
    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    ////Método
    /* Voltea la ficha de dominó */
    public String voltea() {
        int aux = lado1;
        lado1 = lado2;
        lado2 = aux;
        return toString();
    }
    
    /* Encajan o no los lados de la fichas */
    public boolean encaja(FichaDomino ficha) {
        if (this.lado2 == ficha.getLado1() ||  this.lado2 == ficha.getLado2()) {
            return true;
        } else {
            return false;
        }
    }

    /* Generar nueva ficha */
    public static FichaDomino generarSiguienteFicha(FichaDomino ficha) {
        return new FichaDomino();
    }

    ////Override
    @Override
    public String toString() {
        return "[" + ((lado1 == 0) ? " " : lado1) + "|" + ((lado2 == 0) ? " " : lado2) + "]";
    }
}
