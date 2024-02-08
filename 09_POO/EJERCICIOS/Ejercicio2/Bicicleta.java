package Ejercicio2;

public class Bicicleta extends Vehiculo {
    ////Atributos
    

    ////Constructores
    public Bicicleta() {
        super();
    }
    
    ////Métodos
    public String caballito() {
        String cadena = "                 o          _        _            _       \n    _o          /\\_       _ \\o     (_)\\__/o     (_)         \n  _< \\_        _>(_)     (_)/<_       \\_| \\      _|/' \\/    \n (_)>(_)      (_)            (_)      (_)       (_)'  _\\o_  \n --------^     ---^---   ---^---     -------    ----------- ";
        return cadena;
    }

    ////Override
    @Override
    public String toString() {
        return super.toString() + " en bicicleta.";
    }
}