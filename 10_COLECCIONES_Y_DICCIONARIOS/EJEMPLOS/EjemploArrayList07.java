import java.util.ArrayList;
import java.util.Collections;

public class EjemploArrayList07 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();

        lista.add(67);
        lista.add(78);
        lista.add(10);
        lista.add(4);

        System.out.println("\nNúmeros en el orden original: ");
        for (int numero : lista) {
            System.out.println(numero);
        }

        Collections.sort(lista);

        System.out.println("\nNúmeros ordenados: ");
        for (int numero : lista) {
            System.out.println(numero);
        }
    }
}
