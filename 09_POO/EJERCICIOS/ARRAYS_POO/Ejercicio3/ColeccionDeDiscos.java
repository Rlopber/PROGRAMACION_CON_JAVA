package ARRAYS_POO.Ejercicio3;

public class ColeccionDeDiscos {
    public static void main(String[] args) {
        Disco[] discos = new Disco[10];

        String autor;
        String titulo;
        String genero;
        int duracion;
        int codigo = 1;

        
        System.out.print("Nuevo código: ");
        String codigoIntroducido = System.console().readLine();
        if (!codigoIntroducido.equals("")) {
            codigo = Integer.parseInt(codigoIntroducido);
        }
        System.out.println(codigo);
    }
}
