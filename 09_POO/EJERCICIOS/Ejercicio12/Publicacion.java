package Ejercicio12;

public class Publicacion {
    ////Atributos
    private String isbn;
    private String titulo;
    private int fechaPublicacion;

    ////Constructores
    public Publicacion(String isbn, String titulo, int fechaPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
    }

     ////Override
    @Override
    public String toString() {
        return "ISBN: " + isbn + ", título: " + titulo + ", año de publicación: " + fechaPublicacion;
    }
}
