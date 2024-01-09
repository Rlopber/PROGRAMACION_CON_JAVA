import funcionesmates.*;
/**
*
* Muestra los números capicúa que hay entre 1 y 99999.
*
* @author: Raquel Lopez
*/

public class T08Ejercicio16 {
    public static void main(String[] args) {

        //Hacer bucle del 1 al 99999 y usar funcion de esCapicua para saber presentar en pantalla sólo los números capicuas.
        for (int i = 1; i <= 99999; i++) {
            if (Varias.esCapicua(i)) {
                System.out.println(i);
            }
        }
    }    
}
