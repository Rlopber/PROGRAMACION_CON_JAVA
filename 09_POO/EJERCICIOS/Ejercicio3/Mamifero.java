package Ejercicio3;

public class Mamifero extends Animal {
    ////Atributos
    private String pelo;
    private boolean reproduccionExitosa;

    ////Constructores
    public Mamifero(Sexo sexo, String pelo) {
        super(sexo);
        this.pelo = pelo;
        reproduccionExitosa = false;
    }

    public Mamifero(Sexo sexo) {
        super(sexo);
        this.pelo = "No tiene pelo";
        reproduccionExitosa = false;
    }
    
    ////Getters
    public String getPelo() {
        return pelo;
    }

    ////Setters
    public void setPelo(String nuevoPelo) {
        this.pelo = nuevoPelo;
    }
    
    ////Métodos
    public void amamantar() {
        if (reproduccionExitosa && getSexo() == Sexo.HEMBRA) {
            System.out.println("Está amamantando a sus crías.");
        } else {
            System.out.println("La reproducción no ha ocurrido o el animal no es hembra. No se puede amamantar.");
        }
    }

    public void correr() {
        System.out.println("¡Está corriendo!");
    }

    ////Override
    @Override
    public void reproduccion() {
        super.reproduccion();
        System.out.println("Se reproduce de manera vivípara. ¡Han tenido crías!");
        reproduccionExitosa = true;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de pelo: " + pelo;
    }
}
