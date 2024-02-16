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

        //Se añaden 3 elementos
        lista.add("rojo");
        lista.add("verde");
        lista.add("azul");

        System.out.println("Contenido de la lista: ");

        for (String color: lista) {     //Saca uno a uno todos los elementos de lista y los metes en una variable llamada color
            System.out.println(color);  //Muestra por pantalla el contenido de la variable color
        }
    }
}