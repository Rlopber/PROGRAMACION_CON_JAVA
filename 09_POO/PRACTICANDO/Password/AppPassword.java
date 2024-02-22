package Password;

public class AppPassword {
    public static void main(String[] args) {

        System.out.print("Vamos a generar contraseñas. ¿Cuántas?: ");
        int numPass = Integer.parseInt(System.console().readLine());

        System.out.print("¿Qué longitud debe tener la contraseña?: ");
        int longitud = Integer.parseInt(System.console().readLine());

        //Crear el arrays de passwords
        Password[] savePass = new Password[numPass];

        for (int i = 0; i < savePass.length; i++) {
            savePass[i] = new Password(longitud);
        }

        //Comprobar si son fuertes
        boolean[] fortaleza = new boolean[numPass];

        for (int i = 0; i < fortaleza.length; i++) {
            fortaleza[i] = savePass[i].esFuerte();
        }

        //Enseñar resultado
        for (int i = 0; i < savePass.length; i++) {
            System.out.println("Contraseña: " + savePass[i].getpassword() + "\t" + (fortaleza[i] ? "Es fuerte" : "No es fuerte"));
        }
    }
}
