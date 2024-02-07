package Ejercicio2;

public class Coche extends Vehiculo {
    
    ////Atributos
    private String modelo;

    ////Constructores
    public Coche(int kilometrosRecorridos, String modelo) {
        super(kilometrosRecorridos);
        this.modelo = modelo;
    }
    
    ////Métodos
    public String quemaRueda() {
        String cadena = "   _-_-  _/\\______\\__\n_-_-__  / ,-. -|-  ,-.`-.\n   _-_- `( o )----( o )-'\n          `-'      `-'";
        return cadena;
    }

    ////Override
}
