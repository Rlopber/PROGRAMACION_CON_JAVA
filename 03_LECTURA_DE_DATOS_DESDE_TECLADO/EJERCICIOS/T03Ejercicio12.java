/**
*
* Calcular la nota que hace falta sacar en el segundo examen de la asignatura Programación para obtener la media deseada. 
* Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo examen un 60%.
*
* @author: Raquel Lopez
*/

public class T03Ejercicio12 {
    public static void main(String[] args) {

        System.out.print("Introduce la nota del primer examen: ");
        float nota1 = Float.parseFloat(System.console().readLine());
        System.out.print("¿Qué nota final quieres obtener en el trimestre?: ");
        float notaf = Float.parseFloat(System.console().readLine());

        float nota2 = (float) ((notaf - (nota1*0.4))/0.6);

        System.out.printf("La nota que debes sacar en el examen es %.2f.\n", (nota2));

    }
}
