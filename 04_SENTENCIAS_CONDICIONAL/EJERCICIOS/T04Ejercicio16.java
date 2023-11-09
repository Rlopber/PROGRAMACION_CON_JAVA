/**
*
* Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo infiel. 
* El programa irá haciendo preguntas que el usuario contestará con verdadero o falso. 
* Cada pregunta contestada como verdadero sumará 3 puntos. 
* Las preguntas contestadas con falso no suman puntos.
*
* @author: Raquel Lopez
*/

import java.util.Scanner;
public class T04Ejercicio16 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);

    System.out.println("¿Quieres saber si tu pareja te está siendo infiel? ¡Haz nuestro test!");
    System.out.println("Responde a las preguntas con Verdadero (V) o falso (F).");
    System.out.println("");
    System.out.println("\033[1;45mTEST DE INFIDELIDAD\033[0m");

    int puntos = 0; // Contador de puntos

    // Comienzo del test
    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    System.out.println("a) Verdadero\nb) Falso");
    String respuesta = s.nextLine().toUpperCase();

    if (respuesta.equals("V")) {
        System.out.println("");
        puntos += 3;
    } else if (respuesta.equals("F")) {
        System.out.println("");
    } else {
        System.out.println("La respuesta es inválida.");
    }

    System.out.println("2. Ha aumentado sus gastos de vestuario.");
    System.out.println("a) Verdadero\nb) Falso");
    respuesta = s.nextLine().toUpperCase();

    if (respuesta.equals("V")) {
        System.out.println("");
        puntos += 3;
    } else if (respuesta.equals("F")) {
        System.out.println("");
    } else {
        System.out.println("La respuesta es inválida.");
    }

    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
    System.out.println("a) Verdadero\nb) Falso");
    respuesta = s.nextLine().toUpperCase();

    if (respuesta.equals("V")) {
        System.out.println("");
        puntos += 3;
    } else if (respuesta.equals("F")) {
        System.out.println("");
    } else {
        System.out.println("La respuesta es inválida.");
    }

    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
    System.out.println("a) Verdadero\nb) Falso");
    respuesta = s.nextLine().toUpperCase();

    if (respuesta.equals("V")) {
        System.out.println("");
        puntos += 3;
    } else if (respuesta.equals("F")) {
        System.out.println("");
    } else {
        System.out.println("La respuesta es inválida.");
    }

    System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
    System.out.println("a) Verdadero\nb) Falso");
    respuesta = s.nextLine().toUpperCase();

    if (respuesta.equals("V")) {
        System.out.println("");
        puntos += 3;
    } else if (respuesta.equals("F")) {
        System.out.println("");
    } else {
        System.out.println("La respuesta es inválida.");
    }

    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
    System.out.println("a) Verdadero\nb) Falso");
    respuesta = s.nextLine().toUpperCase();

    if (respuesta.equals("V")) {
        System.out.println("");
        puntos += 3;
    } else if (respuesta.equals("F")) {
        System.out.println("");
    } else {
        System.out.println("La respuesta es inválida.");
    }
        
    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
    System.out.println("a) Verdadero\nb) Falso");
    respuesta = s.nextLine().toUpperCase();

    if (respuesta.equals("V")) {
        System.out.println("");
        puntos += 3;
    } else if (respuesta.equals("F")) {
        System.out.println("");
    } else {
        System.out.println("La respuesta es inválida.");
    }

    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
    System.out.println("a) Verdadero\nb) Falso");
    respuesta = s.nextLine().toUpperCase();

    if (respuesta.equals("V")) {
        System.out.println("");
        puntos += 3;
    } else if (respuesta.equals("F")) {
        System.out.println("");
    } else {
        System.out.println("La respuesta es inválida.");
    }

    System.out.println("9. Has notado que últimamente se perfuma más.");
    System.out.println("a) Verdadero\nb) Falso");
    respuesta = s.nextLine().toUpperCase();

    if (respuesta.equals("V")) {
        System.out.println("");
        puntos += 3;
    } else if (respuesta.equals("F")) {
        System.out.println("");
    } else {
        System.out.println("La respuesta es inválida.");
    }

    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
    System.out.println("a) Verdadero\nb) Falso");
    respuesta = s.nextLine().toUpperCase();

    if (respuesta.equals("V")) {
        System.out.println("");
        puntos += 3;
    } else if (respuesta.equals("F")) {
        System.out.println("");
    } else {
        System.out.println("La respuesta es inválida.");
    }

    s.close();

    // Resultados del test
    System.out.println("\033[1;45mRESULTADO:\033[0m");
    if (puntos <= 10) {
        System.out.println("¡Enhorabuena! Tu pareja parece ser totalmente fiel.");
    } else if (puntos >=11 && puntos<=22) {
        System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    } else {
        System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }

    }
}
