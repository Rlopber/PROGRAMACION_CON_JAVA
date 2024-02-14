package HERENCIA.ANIMALES;

/**
*
* Clase ave hija de Animal
*
* @author: Raquel Lopez
*/

public class Ave extends Animal{

    public Ave(Sexo sexo) {
        super(sexo);
    }

    public Ave() {
        super();
    }

    /**
    * Hace que el ave se limpie.
    */
    public void aseate() {
        System.out.println("Me estoy limpiando las plumas");
    }

    /**
    * Hace que el ave levante el vuelo.
    */
    public void vuela() {
        System.out.println("Estoy volando");
    }
}

