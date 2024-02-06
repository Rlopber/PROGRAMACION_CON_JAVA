package Ejercicio12;

public class Libro extends Publicacion implements Prestable {
    ////Atributos
    private boolean estaPrestado;

    ////Constructor
    public Libro(String isbn, String titulo, int fechaPublicacion) {
        super(isbn, titulo, fechaPublicacion);
        estaPrestado = false;
    }

    ////Override
    @Override
    public void presta() {
        if (estaPrestado == true) {
            System.out.println("Lo siento, este libro ya está prestado.");
        } else {
            estaPrestado = true;
        }
    }

    @Override
    public void devuelve() {
        estaPrestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return estaPrestado;
    }

    @Override
    public String toString() {
        return super.toString() + (estaPrestado ? " (prestado)" : " (no prestado)");
    }
}
