/**
 * Salida formateada utilizando enteros, decimales y decimales con precisión
 * 
 * @author Raquel Lopez
 */
public class SalidaFormateada01 {
    public static void main(String[] args) {
        System.out.printf("El número %d no tiene decimales. \n", 21);
        System.out.printf("El número %f sale con decimales.\n", 21.0);
        System.out.printf("El número %.3f sale exactamente con %d decimales. \n", 21.0, 3);
        System.out.printf("Letra: %c.\n", 83);// %c te imprime el código ASCII del número que se haya puesto.
        System.out.printf("Mostramos el segundo argumento: %2$d; y después el primero: %1$d.\n", 54, 25); // El símbolo n$ indica la posición del número
        // que queremos enseñar. $ es el indicador, n la posición.
        System.out.printf("Probando ahora con diferentes decimales: %2$f y %1$.3f. \n", 23.0, 25.0);
    }
}