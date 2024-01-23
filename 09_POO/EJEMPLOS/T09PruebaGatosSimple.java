/**
* PruebaGatoSimple.java
* Programa que prueba la clase GatoSimple
* @author Luis José Sánchez
*/
public class T09PruebaGatosSimple {
    public static void main(String[] args) {
        T09GatoSimple garfield = new T09GatoSimple("macho");

        System.out.println("hola gatito");
        garfield.maulla();
        System.out.println("toma tarta");
        garfield.come("tarta selva negra");
        System.out.println("toma pescado, a ver si esto te gusta");
        garfield.come("pescado");

        T09GatoSimple tom = new T09GatoSimple("macho");
        System.out.println("Tom, toma sopita de verduras");
        tom.come("sopa de verduras");

        T09GatoSimple lisa = new T09GatoSimple("hembra");
        
        System.out.println("gatitos, a ver cómo maulláis");
        garfield.maulla();
        tom.maulla();
        lisa.maulla();

        garfield.peleaCon(lisa);
        lisa.peleaCon(tom);
        tom.peleaCon(garfield);
        }
    }