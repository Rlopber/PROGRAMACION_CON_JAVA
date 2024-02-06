package Ejercicio10;

public class Ameba {

    ////Atributos
    private int peso;

    ////Constructores
    public Ameba() {
        this.peso = 3;
    }
    
    ////Getters
    public int getPeso() {
        return peso;
    }
    
    
    
    ////Métodos

    // Una ameba se alimenta.
    public int come(int comida) {
        peso += comida - 1;
        return peso;
    }

    // Una ameba se come a otra.
    public int come(Ameba ameba) {
        peso += ameba.getPeso() - 1;
        ameba.peso = 0; //La ameba comida se queda sin sustancia
        return peso;
    }
    
    ////Override
    @Override
    public String toString() {
        return "Soy una ameba y peso " + peso + " microgramos.";
    }


    
    
    
}
