package HERENCIA.PERSONA;

/**
*
* Clase Persona que nos permitirá reutilizarla para ver el concepto de herencia en POO
*
* @author: Raquel Lopez
*/

public class Persona {

    /////Atributos
    private String nombre;
    private int edad;
    private String dni;

    /////Constructor
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre; //Se pone el this para diferenciar entre el atributo y el dato a recoger
        this.edad = edad;
        this.dni = dni;
    }

    /////Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    /////Métodos

    // public void mostrarDatos() {
    //     System.out.println("Nombre: " + nombre + "\tEdad: " + edad + "\tDNI: " + dni);
    // }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\tEdad: " + edad + "\tDNI: " + dni;
    } 
}
