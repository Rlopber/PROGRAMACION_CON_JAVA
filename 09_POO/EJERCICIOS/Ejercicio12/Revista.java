package Ejercicio12;

public class Revista extends Publicacion {
    ////Atributos
    private int numeroRevista;
    
    ////Constructores
    public Revista(String isbn, String titulo, int fechaPublicacion, int numeroRevista) {
        super(isbn, titulo, fechaPublicacion);
        this.numeroRevista = numeroRevista;
    }

    ////Override
    @Override
    public String toString() {
        return super.toString() + ", " + numeroRevista;
    }

    
    
}
