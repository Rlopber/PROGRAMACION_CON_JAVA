/**
*
* Programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.
*
* @author Raquel Lopez
*/

public class T04Ejercicio01 {
    public static void main(String[] args) {

        System.out.print("¿De qué día de la semana quieres saber el horario de primera hora?: ");
        String dia = System.console().readLine();
        dia = dia.toLowerCase(); //Convierte en minúscula todas las letras.
        String asignatura = "";

        switch (dia) {
            case "lunes":
                asignatura = "formación y orientación laboral";
                break;

            case "martes", "viernes":
                asignatura = "programación";
                break;

            case "miercoles", "miércoles":
                asignatura = "entornos de desarrollo";
                break;
            
            case "jueves":
                asignatura = "bases de datos";
                break;

            case "sábado", "sabado", "domingo":
                System.out.println("El sábado y el domingo no tienes clase.");
                return;

            default:
                System.out.println("No has introducido un día de la semana.");
                return; // Termina el programa si no reconoce ningún día.
            }

                System.out.println("Los " + dia + " a primera hora tienes " + asignatura + ".");
         }
    }
