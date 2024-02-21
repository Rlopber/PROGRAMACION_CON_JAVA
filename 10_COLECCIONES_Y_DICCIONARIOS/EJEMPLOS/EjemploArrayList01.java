import java.util.ArrayList;

/**
*
* Ejemplo de uso de la clase ArrayList de String: métodos size, add y get
*
* @author: Raquel Lopez
*/

public class EjemploArrayList01 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();

        System.out.println("Nº de elementos: " + lista.size());

        //Se añaden 3 elementos
        lista.add("rojo");
        lista.add("verde");
        lista.add("azul");

        System.out.println("Nº de elementos: " + lista.size());

        lista.add("blanco");

        System.out.println("Nº de elementos: " + lista.size());

        System.out.println("El elemento que hay en la posición 0 es " + lista.get(0));
        System.out.println("El elemento que hay en la posición 3 es " + lista.get(3));
    }
}

/*
 * El tipo tiene que identificarse como si fuera una clase, es decir, en mayúscula. Se denominan WRAPPER:
 * Float, Double, <clase>, Boolean
 * Cambian: int a Integer, char a Character
 * El String se mantiene igual, no es un WRAPPER
 */