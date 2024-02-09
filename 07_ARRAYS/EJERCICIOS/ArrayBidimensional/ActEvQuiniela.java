package ArrayBidimensional;

public class ActEvQuiniela {
    public static void main(String[] args) {

        //Declarar variables
        int[][] quiniela = new int [14][3];
        int[][] resultado = new int [14][3];

        int local;
        int visitante;

        int localResul;
        int visitanteResul;

        int aciertos = 0;
        int columna = 0;

    
        //Generar la quiniela
        for (int i = 0; i < quiniela.length; i++) {
            for (int j = 0; j < quiniela[i].length; j++) {
                quiniela[i][j] = (int)(Math.random()*3);
            }
        }

        //Genarar el Pleno de la quiniela
        local = (int)(Math.random()*4);
        visitante = (int)(Math.random()*4);
        
        //Presentar la quiniela por pantalla

        System.out.println("TU QUINIELA");
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

        System.out.println("15. | Local " + local + " Visitante " + visitante);
        
        //Generar resultado de los partidos
        
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                resultado[i][j] = (int)(Math.random()*3);
            }
        }
        //Genarar el Pleno de la quiniela
        localResul = (int)(Math.random()*4);
        visitanteResul = (int)(Math.random()*4);
        

        //Presentar el resultado por pantalla
        System.out.println("EL RESULTADO");
        for (int i = 0; i < resultado.length; i++) {
            if (i <= 8) {
                System.out.print((i+1) + ".  |");
            } else {
                System.out.print((i+1) + ". |");
            }
            
            for (int j = 0; j < resultado[i].length; j++) {
                if (resultado[i][j] == 0) {
                    System.out.print(" X |");
                } else if (resultado[i][j] == 1) {
                    System.out.print("1  |");
                } else {
                    System.out.print("  2|");
                }
            }
            System.out.println();
        }

        System.out.println("-----------------");

        System.out.println("15. | Local " + localResul + " Visitante " + visitanteResul);
        System.out.println();

        //Ver los aciertos y si has sido premiado
        for (int i = 0; i < resultado[0].length; i++) {
            columna++;
            for (int j = 0; j < resultado.length; j++) {
                if (quiniela[j][i] == resultado[j][i]) {
                    aciertos++;
                }
            }

            System.out.print("En la columna " + columna + " has acertado " + aciertos + ". ");
            if (aciertos >= 10) {
                System.out.print("¡La columna ha sido premiada!");
            }
            System.out.println();
        }
    }
}
