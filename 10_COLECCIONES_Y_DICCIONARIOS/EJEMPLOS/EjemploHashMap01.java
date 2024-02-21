import java.util.HashMap;

public class EjemploHashMap01 {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();

        m.put(111, "Amalia Nuñez");
        m.put(222, "Cindy Nero");
        m.put(333, "César Vázquez");
        m.put(444, "Víctor Tilla");

        System.out.println("Los elementos m son: \n" + m);
    }
}
