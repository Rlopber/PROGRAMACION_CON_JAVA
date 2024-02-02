package Ejercicio3;

public abstract class Animal {
    
    ////Atributos
    private Sexo sexo;

    ////Constructores
    public Animal() {
        sexo = Sexo.MACHO;
    }

    public Animal(Sexo sexo) {
        this.sexo = sexo;
    }

    ////Getters
    public Sexo getSexo() {
        return sexo;
    }
    
    ////Métodos
    public void dormir () {
        System.out.println("Está durmiendo, zzzzz");
    }

    public void comer (String comida) {
        System.out.println("Está comiendo " + comida);
    }

    public void reproduccion () {
        System.out.println("¡Es época de apareamiento!");
    }

    ////Override
    @Override
    public String toString() {
        return "Sexo: " + sexo;
    }

}
