package HERENCIA.PERSONA;

public class AppPersonaEstudiante {
    public static void main(String[] args) {
        Persona p = new Persona("Pepe Rodríguez", 30, "12345678K");
        Estudiante e = new Estudiante("Paula Gómez", 21, "87653421L");
        Profesor prof = new Profesor("Antonio Molino", 53, "98745632U", "Informática", 10000.25);

        System.out.println(p.toString());
        System.out.println(p);

        System.out.println(e.toString());
        System.out.println(e);

        System.out.println(prof.toString());
        System.out.println(prof);
    }
}

    // p.mostrarDatos();
    // e.mostrarDatos();
