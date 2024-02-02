package Ejercicio3;

public class Perro extends Mamifero {

    ////Atributos
    String color, raza;
    int edad;
    double peso;

    ////Constructores
    public Perro() {
        super(Sexo.MACHO);
        setPelo("Pelo corto");
        this.color = "Marrón";
        this.raza = "Perro de Aguas";
        this.edad = 5;
        this.peso = 20;
    }
    
    public Perro(Sexo sexo, String pelo, String color, String raza, int edad, double peso) {
        super(sexo, pelo);
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }

    ////Métodos
    public void ladrar() {
        System.out.println("¡Guau guau!");
    }

    public void jugarPelota() {
        System.out.println("Lanzas una pelota.");
        correr();
    }

    ////Override
    @Override
    public String toString() {
        return super.toString() + "\nColor del pelaje: " + color + "\nRaza: " + raza + "\nEdad del Perro: " + edad + "\nPeso del Perro: " + peso;
    }

    @Override
    public void dormir() {
        System.out.println("El perro está durmiendo en su cama.");
    }
}
