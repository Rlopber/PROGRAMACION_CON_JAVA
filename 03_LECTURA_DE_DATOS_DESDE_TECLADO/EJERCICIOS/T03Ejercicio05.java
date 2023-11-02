/**
*
* Calcular el área de un rectángulo.
*
* @author: Raquel Lopez
*/

public class T03Ejercicio05 {
    public static void main(String[] args) {

        System.out.print("¿Cuál es la base del rectángulo (cm)?: ");
        float base = Float.parseFloat(System.console().readLine());

        System.out.print("¿Cúal es la altura del rectángulo (cm)?: ");
        float altura = Float.parseFloat(System.console().readLine());

        System.out.println("El área del rectángulo es " + (base*altura) + " cm².");
        
    }
}
