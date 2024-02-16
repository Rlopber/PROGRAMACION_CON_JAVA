import java.util.ArrayList;

/**
*
* Ejemplo de uso de la clase ArrayList: recorrer listas con foreach
*
* @author: Raquel Lopez
*/

public class EjemploArrayList03 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();

        //Se añaden 5 elementos
        lista.add("rojo");
        lista.add("verde");
        lista.add("azul");
        lista.add("rojo");
        lista.add("amarillo");

        System.out.println("Contenido de la lista: ");

        for (String color: lista) {     //Saca uno a uno todos los elementos de lista y los metes en una variable llamada color
            System.out.println(color);  //Muestra por pantalla el contenido de la variable color
        }

        if (lista.contains("rojo")) {
            System.out.println("El rojo está en la lista de colores:");
        }

        lista.remove("rojo");
        System.out.println("Ha eliminado el primer elemento de la lista rojo.");
        if (lista.contains("rojo")) {
            System.out.println("Hay otro rojo");
        }

        if (lista.contains("naranja")) {
            System.out.println("Hay naranja");
        } else {
            System.out.println("No hay naranja");
        }

        lista.remove(3);
        System.out.println("Contenido de la lista después de quitar el elemento 3: ");

        for (String color: lista) {     
            System.out.println(color);
        }
    }
}