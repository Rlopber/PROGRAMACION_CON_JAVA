package HERENCIA.PERSONA;
/**
*
* Clase Estudiante que herada de la clase Persona
*
* @author: Raquel Lopez
*/

public class Estudiante extends Persona {

    /////Atributos
    private int creditos;

    /////Constructores
    public Estudiante(String nombre, int edad, String dni) {
        super(nombre, edad, dni);
        this.creditos = 60;
    }

    public Estudiante(String nombre, int edad, String dni, int creditos) {
        super(nombre, edad, dni);
        this.creditos = creditos;
    }

    /////Getters
    public int getCreditos() {
        return creditos;
    }

    @Override
    public String toString() { // Go to Super Implementation y te lleva al padre
        return super.toString() + " [Estudiante] Créditos: " + creditos;
    } 

    // @Override
    // public void mostrarDatos() {
    //     super.mostrarDatos();  //Llamo al método mostrar datos de la superclase (persona)
    //     System.out.println("Estudiante matriculado de " + creditos + " créditos.");
    // }
}
