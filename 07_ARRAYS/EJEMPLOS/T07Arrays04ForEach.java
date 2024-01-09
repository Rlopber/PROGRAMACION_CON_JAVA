/**
*
* Se muestra un array de número tipo double que almacena notas de alumnos
*
* @author: Raquel Lopez
*/

public class T07Arrays04ForEach {
    public static void main(String[] args) {
        double[] notas = new double[3];
        double media = 0;
        double suma = 0;

        //Escritura en el array
        for  (int i = 0; i < notas.length; i++) {
            System.out.print("Nota del examen nº " + (i + 1) + ": ");
            notas[i] = Double.parseDouble(System.console().readLine());
        }

        //Lectura del array
        System.out.println("Tus notas son: ");
        for (double n : notas) { // for (tipo_dato variable : nombrearray)
            System.out.println(n + "\t");
            suma += n;
        }

        media = suma / notas.length;

        System.out.printf("La suma de tus notas es %.2f. \n", suma);
        System.out.printf("La media de tus notas es %.2f. \n", media);
    }  
}
