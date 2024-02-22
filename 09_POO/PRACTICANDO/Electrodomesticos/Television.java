package Electrodomesticos;

public class Television extends Electrodomestico {

    //Atributos
    private double resolucion;
    private boolean tieneTDT;

    //Atributos constante
    private static final double RESOLUCION_DEF = 20;
    private static final boolean TDT_DEF = false;

    //Constructores
    public Television() {
        this.resolucion = RESOLUCION_DEF;
        this.tieneTDT = TDT_DEF;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION_DEF;
        this.tieneTDT = TDT_DEF;
    }

    public Television(double precioBase, String color, char consumoElectrico, double peso, double resolucion, boolean tieneTDT) {
        super(precioBase, color, consumoElectrico, peso);
        this.resolucion = resolucion;
        this.tieneTDT = tieneTDT;
    }

    //Getters
    public double getResolucion() {
        return resolucion;
    }

    public boolean isTieneTDT() {
        return tieneTDT;
    }

    
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (resolucion >= 40) {
            precioFinal += precioFinal*0.3;
        }

        if (tieneTDT) {
            precioFinal += 50;
        }

        return precioFinal;
    }
}
