package funcionquiniela;

public class FuncionQuiniela {

    public static int[][] generarQuinielaManual() {
        int[][] quiniela = new int [14][3];
        int respuesta;

        System.out.println("Ingrese las posiciones para cada partido (0 para local, 1 para empate, 2 para visitante):");
        
            for (int i = 0; i < quiniela.length; i++) {
                System.out.print("Partido " + (i+1) + " ");
                for (int j = 0; j < quiniela[i].length; j++) {
                    do {
                        System.out.print("Resultado " + (j+1) + ": ");
                        respuesta = Integer.parseInt(System.console().readLine());
                        quiniela[i][j] = respuesta;
                        
                    } while (respuesta < 0 || respuesta > 2);
                }
            }
       
        return quiniela;
    }

    public static int[][] generarQuinielaRandom() {
        int[][] quiniela = new int [14][3];

        for (int i = 0; i < quiniela.length; i++) {
            for (int j = 0; j < quiniela[i].length; j++) {
                quiniela[i][j] = (int)(Math.random()*3);
            }
        }
        return quiniela;
    }

    public static int[] generarPlenoRandom() {
        int pleno[] = new int[2];
        pleno[0] = (int)(Math.random()*4);
        pleno[1] = (int)(Math.random()*4);

        return pleno;
    }

    public static int[] generarPlenoManual() {
        int pleno[] = new int[2];
        int respuesta;

        System.out.println("Ingrese el resultado para el Pleno (0, 1, 2 o 3 para más de 2):");
        for (int i = 0; i < pleno.length; i++) {
            if (i == 0) {
                System.out.print("Local: ");
            } else {
                System.out.print("Visitante: ");
            }
            do {
                respuesta = Integer.parseInt(System.console().readLine());
                pleno[i] = respuesta;
            } while (respuesta < 0 || respuesta > 3);
        }
        
        return pleno;
    }

    public static void mostrarQuiniela(int[][] quiniela, int[] pleno) {
        for (int i = 0; i < quiniela.length; i++) {
            if (i <= 8) {
                System.out.print((i+1) + ".  |");
            } else {
                System.out.print((i+1) + ". |");
            }
            
            for (int j = 0; j < quiniela[i].length; j++) {
                if (quiniela[i][j] == 0) {
                    System.out.print(" X |");
                } else if (quiniela[i][j] == 1) {
                    System.out.print("1  |");
                } else {
                    System.out.print("  2|");
                }
            }
            System.out.println();
        }

        System.out.println("-----------------");

        System.out.println("15. | Local " + (pleno[0] == 3 ? "M" : pleno[0]) + " Visitante " + (pleno[1] == 3 ? "M" : pleno[1]));
    }

    public static void verAciertosQuiniela(int[][] quiniela, int[][] resultado, int[] plenoQuiniela, int[] plenoResultado) {
        int aciertos;
        boolean pleno = false;
        int columna = 0;

        for (int i = 0; i < resultado[0].length; i++) {
            columna++;
            aciertos = 0;
            for (int j = 0; j < resultado.length; j++) {
                if (quiniela[j][i] == resultado[j][i]) {
                    aciertos++;
                }
            }

            System.out.print("En la columna " + columna + " has acertado " + aciertos + ". ");
            if (aciertos >= 10) {
                System.out.print("¡La columna ha sido premiada!");
                System.out.println();
                pleno = true;
            }
            System.out.println();
        }
        
        if (pleno) {
            System.out.println("Comprobemos el pleno: ");
            aciertos = 0;
            for (int k = 0; k < plenoResultado.length; k++) {
                if (plenoQuiniela[k] == plenoResultado[k]) {
                    aciertos++;
                }
            }

            if (aciertos == 2) {
                System.out.println("¡ENHORABUENA! ¡HICISTE PLENO!");
            } else {
                System.out.println("Lo siento, no lograste el pleno.");
            }
        }
    }
}