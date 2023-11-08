/**
*
* Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el curso. 
* Cada pregunta acertada sumará un punto. El programa mostrará al final la calificación obtenida. 
*
* @author Raquel Lopez
*/

import java.util.Scanner;
public class T04Ejercicio12 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int puntos=0;
        String respuesta;

        System.out.println("\033[1;46mMINICUESTIONARIO\033[0m");
        System.out.println("");
        System.out.println("Este cuestionario tiene preguntas sencillas sobre Programación en Java. ¿Estás preparado?");
        System.out.println("");
        System.out.println("¡Empezamos!");

        System.out.println("1. ¿Cuál es el print que tienes que poner para poder formatear la salida?");
        System.out.println("a) print\nb) println\nc) printf"); 
        System.out.print("¿Cuál es tu respuesta? ");
        respuesta = s.nextLine();

        if (respuesta.equals("c")) {
          puntos++;
          System.out.println("\033[0;32m¡Correcto!\33[0m");
            } else {
          System.out.println("\033[0;31mIncorrecto\33[0m");
        }

        System.out.println("");
        System.out.println("2. ¿Cuál de las siguientes variables tiene más precisión para presentar números con decimales?");
        System.out.println("a) Double\nb) Long\nc) Float"); 
        System.out.print("¿Cuál es tu respuesta? ");
        respuesta = s.nextLine();

        if (respuesta.equals("a")) {
          puntos++;
          System.out.println("\033[0;32m¡Correcto!\33[0m");
            } else {
          System.out.println("\033[0;31mIncorrecto\33[0m");
        }

        System.out.println("");
        System.out.println("3. ¿Cuál de estas opciones es una sentencia condicional?");
        System.out.println("a) for\nb) switch\nc) while"); 
        System.out.print("¿Cuál es tu respuesta? ");
        respuesta = s.nextLine();

        if (respuesta.equals("b")) {
          puntos++;
          System.out.println("\033[0;32m¡Correcto!\33[0m");
            } else {
          System.out.println("\033[0;31mIncorrecto\33[0m");
        }

        System.out.println("");
        System.out.println("4. ¿Cuál de estas opciones declara la variable de forma correcta?");
        System.out.println("a) int num; \nb) string respuesta\nc) char 3"); 
        System.out.print("¿Cuál es tu respuesta? ");
        respuesta = s.nextLine();

        if (respuesta.equals("a")) {
          puntos++;
          System.out.println("\033[0;32m¡Correcto!\33[0m");
            } else {
          System.out.println("\033[0;31mIncorrecto\33[0m");
        }

        System.out.println("");
        System.out.println("5. ¿Cómo se imprime en la consola de Java?");
        System.out.println("a) console.log \nb) print\nc) System.out.print"); 
        System.out.print("¿Cuál es tu respuesta? ");
        respuesta = s.nextLine();

        if (respuesta.equals("c")) {
          puntos++;
          System.out.println("\033[0;32m¡Correcto!\33[0m");
            } else {
          System.out.println("\033[0;31mIncorrecto\33[0m");
        }

        System.out.println("");
        System.out.println("6. toUpperCase() convierte todos los caracteres en...");
        System.out.println("a) Mayúsculas \nb) Minúsculas \nc) Espacios");
        System.out.print("¿Cuál es tu respuesta? ");
        respuesta = s.nextLine();

        if (respuesta.equals("a")) {
          puntos++;
          System.out.println("\033[0;32m¡Correcto!\33[0m");
            } else {
          System.out.println("\033[0;31mIncorrecto\33[0m");
        }

        System.out.println("");
        System.out.println("7. ¿----?");
        System.out.println("a) ---\nb) ---\nc) ---"); 
        System.out.print("¿Cuál es tu respuesta? ");
        respuesta = s.nextLine();

        if (respuesta.equals("---")) {
          puntos++;
          System.out.println("\033[0;32m¡Correcto!\33[0m");
            } else {
          System.out.println("\033[0;31mIncorrecto\33[0m");
        }

        System.out.println("");
        System.out.println("8. ¿Qué representa Math.PI?");
        System.out.println("a) Constante Euler\nb) Constante Pi\nc) Grados"); 
        System.out.print("¿Cuál es tu respuesta? ");
        respuesta = s.nextLine();

        if (respuesta.equals("b")) {
          puntos++;
          System.out.println("\033[0;32m¡Correcto!\33[0m");
            } else {
          System.out.println("\033[0;31mIncorrecto\33[0m");
        }

        System.out.println("");
        System.out.println("9. Math.pow se usa para elevar un número a una potencia.");
        System.out.println("a) Si\nb) No\nc) Ni idea"); 
        System.out.print("¿Cuál es tu respuesta? ");
        respuesta = s.nextLine();

        if (respuesta.equals("a")) {
          puntos++;
          System.out.println("\033[0;32m¡Correcto!\33[0m");
            } else {
          System.out.println("\033[0;31mIncorrecto\33[0m");
        }

        System.out.println("");
        System.out.println("10. Math.abs se utiliza para: ");
        System.out.println("a) Redondear\nb) Raíz cuadrada\nc) Valor absoluto"); 
        System.out.print("¿Cuál es tu respuesta? ");
        respuesta = s.nextLine();

        if (respuesta.equals("c")) {
          puntos++;
          System.out.println("\033[0;32m¡Correcto!\33[0m");
            } else {
          System.out.println("\033[0;31mIncorrecto\33[0m");
        }
        s.close();

        System.out.println("");
        System.out.println("Vamos a ver que puntuación has sacado: " + puntos + "/10");

        if (puntos>=0 && puntos<5){
            System.out.println("No has conseguido aprobar, ¡a seguir estudiando!");
        } else if (puntos>=5 && puntos<8) {
            System.out.println("Bastante bien, ¡sigue mejorando!");
        } else if (puntos==8 || puntos==9) {
            System.out.println("Casi perfecto, ¡muy bien!");
        } else {
            System.out.println("¡Puntuación perfecta! !Enhorabuena!");
        }
    }
}
