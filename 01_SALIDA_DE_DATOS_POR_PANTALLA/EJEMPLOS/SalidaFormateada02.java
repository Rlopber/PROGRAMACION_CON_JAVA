/**
 * Salida formateada utilizando distintos flags.
 * 
 * @author: Raquel Lopez
 */

public class SalidaFormateada02 {
    public static void main(String[] args) {
        System.out.printf("%8d\n", 100); // Rellena con espacios a la izquierda. 
        // TENER EN CUENTA: si pongo 8, van a ser 5 + 3, es decir, 5 huecos más 3 de cada número del 100.
        System.out.printf("%08d\n", 100); // Rellena con ceros a la izquierda.
        System.out.printf("%+d\n", 100); // Muestra el signo del número.
        System.out.printf("%-8d\n", 100); //Rellena con espacios a la derecha.
        System.out.printf("%+-8d\n", 100); // En este, los espacios son sólo 4 porque el + ocupa un espacio. 
    }
}