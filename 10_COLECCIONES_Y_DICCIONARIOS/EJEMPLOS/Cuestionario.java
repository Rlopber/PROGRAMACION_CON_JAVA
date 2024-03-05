import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Cuestionario {
    public static void main(String[] args) {

        //Crear el Hashmap con las respuestas correctas.
        HashMap <String, String> quiz = new HashMap<>();

        quiz.put("Bulgaria", "Sofia");
        quiz.put("España", "Madrid");
        quiz.put("Dinamarca", "Copenhague");
        quiz.put("Francia", "Paris");
        quiz.put("Hungria", "Budapest");
        quiz.put("Letonia", "Riga");
        quiz.put("Malta", "La Valeta");
        quiz.put("Moldavia", "Chisinau");
        quiz.put("Rusia", "Moscu");
        quiz.put("Suiza", "Berna");

        //Crear el arraylist con otras respuestas no correctas
        ArrayList<String> respIncorrectas = new ArrayList<>();

        respIncorrectas.add("Liubliana");
        respIncorrectas.add("Baku");
        respIncorrectas.add("Minsk");
        respIncorrectas.add("Sarajevo");
        respIncorrectas.add("Bratislava");
        respIncorrectas.add("Tallin");
        respIncorrectas.add("Helsinki");
        respIncorrectas.add("Tiflis");
        respIncorrectas.add("Vaduz");
        respIncorrectas.add("Skopie");
        respIncorrectas.add("Podgorika");
        respIncorrectas.add("Oslo");
        respIncorrectas.add("Ankara");
        respIncorrectas.add("Kiev");
        respIncorrectas.add("Lisboa");
        respIncorrectas.add("Varsovia");
        respIncorrectas.add("Amsterdam");
        respIncorrectas.add("Nicosia");
        respIncorrectas.add("Atenas");
        respIncorrectas.add("Nursultan");

        //Crear el test
        System.out.println("¡Cuestionario!");

        int puntuacion = 0;

        ArrayList<String> usadas = new ArrayList<>();
        ArrayList<String> paises = new ArrayList<>(quiz.keySet());

        Collections.shuffle(paises);

        for (int i = 0; i < paises.size(); i++) {
            boolean repetir;
            String respuesta1;
            String respuesta2;

            do {
                repetir = false;
                respuesta1 = respIncorrectas.get((int)(Math.random()*20));
                respuesta2 = respIncorrectas.get((int)(Math.random()*20));
                if (usadas.contains(respuesta1) || usadas.contains(respuesta1)) {
                    repetir = true;
                } 
            } while (repetir);

            usadas.add(respuesta1);
            usadas.add(respuesta2);
            
            System.out.println("¿Cuál es la capital de " + paises.get(i) + "?");
            int ordenPreguntas = (int)(Math.random()*3);

            if (ordenPreguntas == 0 ) {
                System.out.println("1. " + respuesta1);
                System.out.println("2. " + respuesta2);
                System.out.println("3. " + quiz.get(paises.get(i)));
            } else if (ordenPreguntas == 1) {
                System.out.println("1. " + respuesta2);
                System.out.println("2. " + quiz.get(paises.get(i)));
                System.out.println("3. " + respuesta1);
            } else {
                System.out.println("1. " + respuesta2);
                System.out.println("2. " + respuesta1);
                System.out.println("3. " + quiz.get(paises.get(i)));
            }
            
            System.out.print("Respuesta: ");
            String respuesta = System.console().readLine();

            
            if (respuesta.equals(quiz.get(paises.get(i)))) {
                puntuacion++;
            }
        }
        
        if (puntuacion >= 5) {
            System.out.println("¡Enhorabuena! ¡Has aprobado! Puntuación: " + puntuacion);
        } else {
            System.out.println("Lo siento, no has aprobado. Puntuación: " + puntuacion);
        }
    }
}
