package ARRAYS_POO.EjercicioAlumnos;

public class Alumno {
    
    private String nombre;
    private double notaMedia = 0.0;
    private int idAlumno;

    public String getNombre() { return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaMedia() {return notaMedia;}

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public int getIdAlumno() { return idAlumno;}

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", notaMedia=" + notaMedia + "]";
    }
}

