package Ejercicio3;

public class Canario extends Ave {

    ////Atributos
    String color;
    int edad;
    double peso;

    ////Constructores
    public Canario() {
        super(Sexo.HEMBRA);
        this.color = "Amarillo";
        this.edad = 2;
        this.peso = 0.5;
    }
    
    public Canario(Sexo sexo, String color, int edad, double peso) {
        super(sexo);
        this.color = color;
        this.edad = edad;
        this.peso = peso;
    }

    ////Métodos
    public void piar() {
        System.out.println("¡Pio! ¡Pio!");
    }

    ////Override
    @Override
    public String toString() {
        return super.toString() + "\nColor del plumaje: " + color + "\nEdad del canario: " + edad + "\nPeso del canario: " + peso;
    }

    @Override
    public void cantar() {
        System.out.println("El canario está cantando melodiosamente.");
    }
}
