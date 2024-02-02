package Ejercicio3;

public class Pingüino extends Ave {

    ////Atributos
    String color;
    int edad;
    double peso;

    ////Constructores
    public Pingüino() {
        super(Sexo.MACHO);
        this.color = "Blanco y negro";
        this.edad = 2;
        this.peso = 1;
    }
    
    public Pingüino(Sexo sexo, String color, int edad, double peso) {
        super(sexo);
        this.color = color;
        this.edad = edad;
        this.peso = peso;
    }

    ////Métodos
    public void nadar() {
        System.out.println("Está nadando muy rápido.");
    }

    ////Override
    @Override
    public String toString() {
        return super.toString() + "\nColor del plumaje: " + color + "\nEdad del Pingüino: " + edad + "\nPeso del Pingüino: " + peso;
    }

    @Override
    public void cantar() {
        System.out.println("¿Desde cuándo canta un pingüino?");
    }

    @Override
    public void volar() {
        System.out.println("No puede volar");
    }
}