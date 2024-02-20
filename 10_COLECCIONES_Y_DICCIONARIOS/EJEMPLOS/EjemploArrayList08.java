import java.util.ArrayList;
import java.util.Collections;

/**
*
* ArrayList de objetos: creación y adición a la lista de objetos de la clase Gato
*
* @author: Raquel Lopez
*/

public class EjemploArrayList08 {
    public static void main(String[] args) {

        ArrayList<GatoSimple> camada = new ArrayList<GatoSimple>();

        //Se añaden 5 elementos
        camada.add(new GatoSimple("HEMBRA", "Naranja", "Atigrado"));
        camada.add(new GatoSimple("MACHO", "Gris", "Siamés"));
        camada.add(new GatoSimple("MACHO", "Negro", "Callejero"));
        camada.add(new GatoSimple("HEMBRA", "Manchas", "Callejero"));
        camada.add(new GatoSimple("MACHO", "Blanco", "Callejero"));

        System.out.println("Listado de gatos: ");

       for (GatoSimple gato : camada) {
            System.out.println(gato);
       }

       Collections.sort(camada);

       System.out.println("\nGatos ordenados por sexo: ");

       for (GatoSimple gato : camada) {
        System.out.println(gato);
        }
    }
}
