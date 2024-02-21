package ARRAYS_DE_OBJETOS.ALUMNOS;

public class AppAlumnos {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[5]; //Creamos el array de objetos
        String nombre;
        double notaMedia;

        //Creación de alumnos
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno();
            System.out.println("Nombre del alumno " + i + ": ");
            nombre = System.console().readLine();
            alumnos[i].setNombre(nombre);

            System.out.println("Nota media del alumno " + i + ": ");
            notaMedia = Double.parseDouble(System.console().readLine());
            alumnos[i].setNotaMedia(notaMedia);
        }

        //Lectura del array
        for (Alumno a : alumnos) {
            System.out.println(a.toString());
        }

        //Lectura con getter
        for (Alumno alu : alumnos) {
            System.out.print("Nombre del alumno: " + alu.getNombre());
            System.out.println("\tNota media del alumno: " + alu.getNotaMedia());
        }
    }
}
