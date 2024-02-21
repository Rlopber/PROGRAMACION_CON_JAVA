import java.util.ArrayList;

/**
*
* Ejemplo de uso de la clase ArrayList: recorrer listas
*
* @author: Raquel Lopez
*/

public class EjemploArrayList02 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();

        //Se añaden 3 elementos
        lista.add("rojo");
        lista.add("verde");
        lista.add("azul");

        System.out.println("Contenido de la lista: ");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
