/**
 * Programa que declare variables enteras x e y. Asginar valor 144 y 999, respectivamente.
 * Muestra en pantalla: suma, resta, multiplicación y división.
 * 
 * @author: Raquel
*/
 public class T02Ejercicio01 {
    public static void main(String[] args) {
        int x = 144;
        int y = 999;

        System.out.println("La suma de " + x + " y " + y + " es " + (x+y));
        System.out.println("La resta de " + x + " menos " + y + " es " + (x-y));
        System.out.println("La multiplicación de " + x + " por " + y + " es " + (x*y));
        System.out.println("La división de " + x + " entre " + y + " es " + ((float)x/(float)y));
    }
}
