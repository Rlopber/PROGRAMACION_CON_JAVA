package Electrodomesticos;

public class AppElectrodomesticos {
    public static void main(String[] args) {
        Electrodomestico[] compra = new Electrodomestico[5];

        compra[0] = new Electrodomestico(25, 65.2);
        compra[1] = new Television();
        compra[2] = new Lavadora(85.99, "negro", 'A', 90, 25);
        compra[3] = new Lavadora();
        compra[4] = new Television(999.88, "gris", 'B', 25, 50, true);

        //Variables para almacenar la suma de los precios
        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;

        for (int i = 0; i < compra.length; i++) {
            if(compra[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=compra[i].precioFinal();
            }
            if(compra[i] instanceof Lavadora){
                sumaLavadoras+=compra[i].precioFinal();
            }
            if(compra[i] instanceof Television){
                sumaTelevisiones+=compra[i].precioFinal();
            }
        }

        System.out.printf("La suma del precio de los electrodomesticos es de %.2f €\n", sumaElectrodomesticos);
        System.out.printf("La suma del precio de las lavadoras es de %.2f €\n", sumaLavadoras);
        System.out.printf("La suma del precio de las televisiones es de %.2f €\n", sumaTelevisiones);
    }
}
