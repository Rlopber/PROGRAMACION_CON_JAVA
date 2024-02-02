package Ejercicio3;

public class Gato extends Mamifero {

    ////Atributos
    String color, raza;
    int edad;
    double peso;

    ////Constructores
    public Gato() {
        super(Sexo.HEMBRA);
        setPelo("Pelo corto");
        this.color = "Gris";
        this.raza = "Angora";
        this.edad = 5;
        this.peso = 5;
    }
    
    public Gato(Sexo sexo, String pelo, String color, String raza, int edad, double peso) {
        super(sexo, pelo);
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }

    ////Métodos
    public void maullar() {
        System.out.println("Miauuuu");
    }

    public void ronronear() {
        System.out.println("mrrrrrr");
    }

    ////Override
    @Override
    public String toString() {
        return super.toString() + "\nColor del pelaje: " + color + "\nRaza: " + raza + "\nEdad del gato: " + edad + "\nPeso del gato: " + peso;
    }

    @Override
    public void dormir() {
        System.out.println("El gato está durmiendo acurrucado.");
    }
}
