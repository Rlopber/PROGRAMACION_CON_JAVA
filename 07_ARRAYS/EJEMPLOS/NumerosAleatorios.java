public class NumerosAleatorios {
    public static void main(String[] args) {

        System.out.println("Números aleatorios:");
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }

        System.out.println();
        System.out.println( "Números aleatorios: parte entera");
        for (int i = 0; i < 10; i++) {
            System.out.println((int)(Math.random()*10));
        }

        System.out.println();
        System.out.println( "Números aleatorios: cambiar para que empiece en 0 y acabe en 11(no incluido)");
        for (int i = 0; i < 10; i++) {
            System.out.println((int)(Math.random()*10+1));
        }

        System.out.println();
        System.out.println( "Números aleatorios: números entre 50 y 61 (no incluido)");
        for (int i = 0; i < 10; i++) {
            System.out.println((int)(Math.random()*11+50));
        }


        System.out.println();
        System.out.println( "Números aleatorios: números entre 100 y 999");
        for (int i = 0; i < 10; i++) {
            System.out.println((int)(Math.random()*900+100));
        }
    }
}
