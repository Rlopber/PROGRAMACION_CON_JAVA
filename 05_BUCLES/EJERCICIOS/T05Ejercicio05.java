/**
*
* Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.
*
* @author Raquel Lopez
*/

public class T05Ejercicio05 {
  public static void main(String[] args) {
    
    System.out.println("Números del 320 al 160, de 20 en 20 hacia atrás.");

    int i = 320;

    while (i >= 160) {
    System.out.print(i + " ");
    i -= 20;
    }
  }  
}