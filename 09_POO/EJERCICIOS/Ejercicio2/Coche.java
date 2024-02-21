package Ejercicio2;

public class Coche extends Vehiculo {
    
    ////Atributos de clase
    private String modelo;

    ////Constructores
    public Coche(String modelo) {
        super();
        this.modelo = modelo;
    }
    
    ////Métodos
    public String quemaRueda() {
        String cadena = "   _-_-  _/\\______\\__\n_-_-__  / ,-. -|-  ,-.`-.\n   _-_- `( o )----( o )-'\n          `-'      `-'";
        return cadena;
    }

    ////Override
    @Override
    public String toString() {
        return super.toString() + " en tu " + modelo + ".";
    }
}
