package Electrodomesticos;

public class Lavadora extends Electrodomestico{

    //Atributos
    private int carga;

    //Atributo constante
    private static final int CARGA_DEF = 5;

    //Constructores
    public Lavadora() {
        super();
        this.carga = CARGA_DEF;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = CARGA_DEF;
    }

    public Lavadora(double precioBase, String color, char consumoElectrico, double peso, int carga) {
        super(precioBase, color, consumoElectrico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (carga >= 30) {
            precioFinal += 50;
        }

        return precioFinal;
    }
}
