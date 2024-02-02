package Ejercicio3;

public class Lagarto extends Animal {
    ////Atributos
    private String tipoEscamas;
    private boolean esVenenoso;

    ////Constructores
    public Lagarto(Sexo sexo, String tipoEscamas, boolean esVenenoso) {
        super(sexo);
        this.tipoEscamas = tipoEscamas;
        this.esVenenoso = esVenenoso;
    }

    public Lagarto() {
        super(Sexo.HEMBRA);
        this.tipoEscamas = "Escamas pequeñas";
        this.esVenenoso = true;
    }

    ////Getters
    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    //// Métodos
    public void tomarSol() {
        System.out.println("Está tomando el sol.");
    }

    public void mudarPiel() {
        System.out.println("Está mudando su piel.");
    }

    public void ataque() {
        if (esVenenoso == true) {
            System.out.println("¡Te han mordido! Sientes el efecto del veneno");
        } else {
            System.out.println("¡Te han mordido! Te duele la herida.");
        }
    }

    ////Override
    @Override
    public void comer(String comida) {
        System.out.println("Está cazando.");
        System.out.println("¡Ha atrapado un " + comida + "!");
    }
}
