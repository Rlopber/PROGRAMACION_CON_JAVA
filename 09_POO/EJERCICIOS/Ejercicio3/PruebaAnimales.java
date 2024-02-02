package Ejercicio3;

public class PruebaAnimales {
    public static void main(String[] args) {
        Gato Misifú = new Gato();
        Perro Thor = new Perro(Sexo.MACHO, "Pelo corto", "Marrón claro", "Pitbull", 3, 10);
        Canario Cantarín = new Canario();
        Pingüino Pingu = new Pingüino(Sexo.HEMBRA, "Gris", 5, 15);
        Lagarto Lenny = new Lagarto(Sexo.MACHO, "Escamas Grandes", false);
        Cerdo Babe = new Cerdo();

        System.out.println(Misifú);
        System.out.println();

        Misifú.dormir();
        Misifú.reproduccion();
        Misifú.amamantar();
        System.out.println();
        
        System.out.println(Thor);
        System.out.println();

        Thor.dormir();
        Thor.jugarPelota();
        Thor.amamantar();
        Thor.comer("galletas");
        System.out.println();

        System.out.println(Cantarín);
        System.out.println();

        Cantarín.cantar();
        Cantarín.asear();
        Cantarín.reproduccion();
        System.out.println();

        System.out.println(Pingu);
        System.out.println();

        Pingu.cantar();
        Pingu.nadar();
        Pingu.anidar();
        Pingu.reproduccion();
        System.out.println();

        System.out.println(Lenny);
        System.out.println();

        Lenny.dormir();
        Lenny.tomarSol();
        Lenny.ataque();
        Lenny.comer("grillo");
        System.out.println();

        System.out.println(Babe);
        System.out.println();
    }
}
