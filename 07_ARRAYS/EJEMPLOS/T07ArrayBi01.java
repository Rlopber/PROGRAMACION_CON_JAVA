/**
*
* Descripción del programa
*
* @author: Raquel Lopez
*/

public class T07ArrayBi01 {
    public static void main(String[] args) throws InterruptedException {
        int[][] n = new int[3][2]; //Array de 3 filas x 2 columnas
                                    // n = {{20,0}, {67,33}, {0,7}}

        n[0][0] = 20;   //1ª fila 1ª columna
        n[1][0] = 67;   //2ª fila 1ª columna
        n[1][1] = 33;   //2ª fila 2ª columna
        n[2][1] = 7;    //3ª fila 2ª columna

        System.out.println("Número de filas: " + n.length);
        System.out.println("Número de columnas: " + n[0].length);
        for (int filas = 0; filas < n.length; filas++) {
            for (int columna = 0; columna < n[filas].length; columna++) {
                System.out.printf("%10d", n[filas][columna]);
                Thread.sleep(1000); //retardo de un segundo (Para que funciona hay que poner throws InterrumptedException o encerrar todo en un try/catch)
            }
            System.out.println();
        }
    }
}
