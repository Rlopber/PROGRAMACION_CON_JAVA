/**
*
* Programa dado un número del 1 al 7 escriba el día de la semana.
*
* @author Raquel Lopez
*/

public class T04Ejercicio03 {
    public static void main(String[] args) {

        System.out.print("Dime un número del 1 al 7 y te diré a que día de la semana corresponde: ");
        int num = Integer.parseInt(System.console().readLine());
        String dia = "";

        switch (num) {
            case 1:
                dia = "lunes";
                break;
            case 2:
                dia = "martes";
                break;
            case 3:
                dia = "miércoles";
                break;
            case 4:
                dia = "jueves";
                break;
            case 5:
                dia = "viernes";
                break;
            case 6:
                dia = "sábado";
                break;
            case 7:
                dia = "domingo";
                break;

            default:
                System.out.println("El número que has introducido no corresponde a ningún día de la semana.");
                return;
        }
        System.out.println("El número " + num + " corresponde al " + dia + ".");
    }
    
}
