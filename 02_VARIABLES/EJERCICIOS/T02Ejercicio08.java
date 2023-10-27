/**
 * Programa que declare 5 variables tipo char.
 * 
 * 
 * @author: Raquel Lopez
 */
public class T02Ejercicio08 {
    public static void main(String[] args) {
        
    char letra1='p';
    char letra2='e';
    char letra3='r';
    char letra4='r';
    char letra5='o';

    String palabra= ""+ letra1 + letra2 + letra3 + letra4 + letra5;
    System.out.println(palabra);

    // Para que concatene las letras hay que añadir al principio de la frase dobles comillas "".
    // Si no, lo que haría es sumar el codigo ascii de esas letras.
    }
}
