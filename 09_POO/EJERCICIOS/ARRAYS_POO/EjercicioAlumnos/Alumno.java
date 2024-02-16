package ARRAYS_POO.EjercicioAlumnos;

public class Alumno {
    
    private String nombre;
    private double notaMedia = 0.0;
    private int idAlumno;

    ////Constructor
    public Alumno() {
    }

    public Alumno(String nombre, double notaMedia) {
        this.nombre = nombre;
        this.notaMedia = notaMedia;
    }

    // Nombre del alumno
    public String getNombre() { return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Nota media del alumno
    public double getNotaMedia() {return notaMedia;}

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    // ID del alumno
    public int getIdAlumno() { return idAlumno;}

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Override
    public String toString() {
        return this.idAlumno + ". Nombre del alumno: " + this.nombre + "\tNota media: " + this.notaMedia;
    }
}

