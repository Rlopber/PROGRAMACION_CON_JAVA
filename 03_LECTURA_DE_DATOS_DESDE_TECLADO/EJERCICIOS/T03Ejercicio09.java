/**
*
* Programa que calcule el volumen de un cono.
*
* @author: Raquel Lopez
*/

public class T03Ejercicio09 {
    public static void main(String[] args) {
        
        System.out.println("Vamos a calccular el volumen de un cono.");

        System.out.print("¿Cuál es el radio del cono (cm)?: ");
        float radio = Float.parseFloat(System.console().readLine());

        System.out.print("¿Cuál es la altura del cono (cm)?: ");
        float altura = Float.parseFloat(System.console().readLine());

        System.out.printf("EL volumen del cono es %.2f cm³.\n", ((altura*(Math.pow(radio, 2))*Math.PI)/3)); //Math.pow es una función para elevar números a una potencia.
    }
}
