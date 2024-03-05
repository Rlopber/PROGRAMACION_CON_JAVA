import java.util.HashMap;

public class EjemploHashMap02 {
    public static void main(String[] args) {

        HashMap<Integer, String> m = new HashMap<>();
        int clave;

        m.put(111, "Amalia Nuñez");
        m.put(222, "Cindy Nero");
        m.put(333, "César Vázquez");
        m.put(444, "Víctor Tilla");

        System.out.println("Introduce la clave: ");
        clave = Integer.parseInt(System.console().readLine());

        System.out.println("Su valor es: " + m.get(clave));

    }
}