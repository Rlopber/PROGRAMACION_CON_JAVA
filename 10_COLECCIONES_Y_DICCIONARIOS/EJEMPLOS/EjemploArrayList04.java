import java.util.ArrayList;
import java.util.Collections;

/**
*
* Cambiar contenido del array por otro: set
*
* @author: Raquel Lopez
*/

public class EjemploArrayList04 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();

        //Se añaden 5 elementos
        lista.add("rojo");
        lista.add("verde");
        lista.add("azul");
        lista.add("rojo");
        lista.add("amarillo");

        System.out.println(lista);

        System.out.println("Contenido al cambiar azul por turquesa: ");
        lista.set(2, "turquesa");
        System.out.println(lista);

        Collections.sort(lista);

        System.out.println("\nLista ordenada: ");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}
