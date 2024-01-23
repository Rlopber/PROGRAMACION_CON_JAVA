/**
* PruebaT09Cubo.java
* Programa que prueba la clase T09Cubo
* @author Luis José Sánchez
*/
public class T09PruebaCubo {
    public static void main(String[] args) {
        T09Cubo cubito = new T09Cubo(2);
        T09Cubo cubote = new T09Cubo(7);
        System.out.println("Cubito: \n");
        cubito.pinta();

        System.out.println("\ncubote: \n");
        cubote.pinta();

        System.out.println("\nLleno el cubito: \n");
        cubito.llena();
        cubito.pinta();

        System.out.println("\nEl cubote sigue vacío: \n");
        cubote.pinta();

        System.out.println("\nAhora vuelco lo que tiene el cubito en el cubote.\n");
        cubito.vuelcaEn(cubote);

        System.out.println("Cubito: \n");
        cubito.pinta();

        System.out.println("\ncubote: \n");
        cubote.pinta();

        System.out.println("\nAhora vuelco lo que tiene el cubote en el cubito.\n");
        cubote.vuelcaEn(cubito);

        System.out.println("Cubito: \n");
        cubito.pinta();
        
        System.out.println("\ncubote: \n");
        cubote.pinta();
    }
}