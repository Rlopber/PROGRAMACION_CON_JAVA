/**
*
* Tablas de multiplicar del 2, 4 y 6.
*
* @author Raquel Lopez
*/

public class T05EJ02 {
    public static void main(String[] args) {
        for (int i = 2; i <=6; i = i + 2) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }
}
