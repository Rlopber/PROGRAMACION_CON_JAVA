/**
*
* Calcular el salario semanal de un empleado en base a las horas trabajadas, a 12€/hora.
*
* @author: Raquel Lopez
*/

public class T03Ejercicio08 {
    public static void main(String[] args) {

        System.out.print("¿Cuántas horas ha trabajado esta semana?: ");
        float horas = Float.parseFloat(System.console().readLine());

        System.out.printf("Esta semana su salario es de %.2f euros.\n", (horas*12));

    }
}
