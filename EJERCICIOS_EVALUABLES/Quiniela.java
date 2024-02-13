import funcionquiniela.*;

public class Quiniela {
    public static void main(String[] args) {
        int[][] quiniela = new int[14][3];
        int[][] resultado = FuncionQuiniela.generarQuinielaRandom();
        int[] plenoQuiniela = new int[2];
        int[] plenoResultado = FuncionQuiniela.generarPlenoRandom();
        int opcion;

        // Generar la quiniela
        System.out.println("¡Bienvenido a la QUINIELA!");
        System.out.println("Elija una de las opciones para generar su quiniela.");
        System.out.println("1. Generar manualmente.\n2. Generar aleatoriamente.");
        opcion = Integer.parseInt(System.console().readLine());

        switch (opcion) {
            case 1:
                quiniela = FuncionQuiniela.generarQuinielaManual();
                System.out.println();
                plenoQuiniela = FuncionQuiniela.generarPlenoManual();
                break;

            case 2:
                quiniela = FuncionQuiniela.generarQuinielaRandom();
                plenoQuiniela = FuncionQuiniela.generarPlenoRandom();
                break;
        
            default:
                System.out.println("Esa opción no existe, vuelva a intentarlo.");
                break;
        }

        // Enseñar la quiniela
        System.out.println("Aquí está tu quiniela: ");
        FuncionQuiniela.mostrarQuiniela(quiniela, plenoQuiniela);
        System.out.println();

        // Enseñar la quiniela de resultados
        System.out.println("Estos son los resultados: ");
        FuncionQuiniela.mostrarQuiniela(resultado, plenoResultado);
        System.out.println();

        //Ver los aciertos y si has sido premiado
        FuncionQuiniela.verAciertosQuiniela(quiniela, resultado, plenoQuiniela, plenoResultado);
    }
}
