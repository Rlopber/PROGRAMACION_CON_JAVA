/**
*
* Calcular el salario semanal de un empleado en base a las horas trabajadas, a 12€/hora las 40 primeras horas.
* A partir de 41 horas, se pagan a 16€/hora.
*
* @author Raquel Lopez
*/

public class T04Ejercicio04 {
    public static void main(String[] args) {

        System.out.print("¿Cuántas horas ha trabajado esta semana?: ");
        float horas = Float.parseFloat(System.console().readLine());

        if (horas>=1 && horas<=40) {
            System.out.printf("Esta semana su salario es de %.2f euros.\n", (horas*12));
        } else if (horas>41) {
            int horaOrd = 480;
            float horaExt = ((horas-40)*16);
            System.out.println("Por tus primeras 40 horas vas a ganar " + horaOrd + " euros.");
            System.out.printf("De horas extra, vas a ganar %.2f euros.\n", horaExt);
            System.out.printf("En total, tu salario esta semana es de %.2f euros.\n", (horaOrd + horaExt));
        } else {
            System.out.println("La cantidad de horas no es válida.");
        }    
    }
}
