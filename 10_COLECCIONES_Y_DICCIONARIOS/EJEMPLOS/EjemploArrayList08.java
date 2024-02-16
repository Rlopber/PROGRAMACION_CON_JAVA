import java.util.ArrayList;

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

        System.out.println("Listado de gatos: ");

       for (GatoSimple gato : camada) {
            System.out.println(gato);
       }
    }
}
