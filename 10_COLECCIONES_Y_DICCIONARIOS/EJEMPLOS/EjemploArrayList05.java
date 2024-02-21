import java.util.ArrayList;

/**
*
* Borrar elementos específicos: removeIf
*
* @author: Raquel Lopez
*/

public class EjemploArrayList05 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();

        //Se añaden 5 elementos
        lista.add("rojo");
        lista.add("verde");
        lista.add("azul");
        lista.add("rojo");
        lista.add("amarillo");

        System.out.println("Contenido de la lista: ");
        System.out.println(lista);

        lista.removeIf(palabra -> palabra.contains("o"));

        System.out.println("Contenido de la lista después de borrar las plabras que contienen la letra \"o\": ");
        System.out.println(lista);

        lista.removeIf(palabra -> palabra.contains("az"));

        System.out.println("Contenido de la lista después de borrar las plabras que contienen la letra \"az\": ");
        System.out.println(lista);
    }
}
