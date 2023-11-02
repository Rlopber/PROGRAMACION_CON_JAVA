/**
*
* Calcular el área de un triángulo.
*
* @author: Raquel Lopez
*/

public class T03Ejercicio06 {
    public static void main(String[] args) {

        System.out.print("¿Cuál es la base del triángulo (cm)?: ");
        float base = Float.parseFloat(System.console().readLine());

        System.out.print("¿Cúal es la altura del triángulo (cm)?: ");
        float altura = Float.parseFloat(System.console().readLine());

        System.out.println("El área del triángulo es " + ((base*altura)/2) + " cm².");
        
    }
}