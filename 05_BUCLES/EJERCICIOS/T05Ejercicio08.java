/**
*
* Muestra la tabla de multiplicar de un número introducido por teclado.
*
* @author Raquel Lopez
*/

import java.util.Scanner;

public class T05Ejercicio08 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.println( " \033[1;46mTABLAS DE MULTIPLICAR\033[0m");
    System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("");
    System.out.println("¿Qué tabla de multiplicar quieres hacer?");
    System.out.println("");
    System.out.print("\033[3;30mTabla del\033[0m ");
    int numero = s.nextInt();
    

    for (int i = 0; i < 11; i++) {
        System.out.println(numero + " * " + i + " = " + (numero*i));
    }

    s.close();

  }  
}
