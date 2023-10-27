/**
 * Programa para
 * 
 * @author: Raquel
 */

public class Ejemplo01 {
    public static void main(String[] args) {
        // Tipo byte
        byte miNumByte = 100;
        System.out.println(miNumByte);

        //Tipo short
        short miNumShort = 5000;
        System.out.println(miNumShort);

        //Tipo long
        long miNumLong = 150000000L;
        System.out.println(miNumLong);

        //Tipo float
        float miNumFloat = 5.75f;
        System.out.println(miNumFloat);

        //Tipo boolean
        boolean esJavaDivertido = true;
        System.out.println(esJavaDivertido);

        int numero = 5;
        System.out.println("El valor de la variable es " + numero);

        double x;
        double y;

        x = 7;
        y = 25.75;

        System.out.println("x vale " + x);
        System.out.println("y vale " + y);

        System.out.println("");
        System.out.println("// // // // // // // //");
        char letra1 = 'c'; // las varaibles tipo char almacenan un único carácter entre comillas simples.
        char letra2 = 'a';
        char letra3 = 'a';
        char letra4 = 'a';

        System.out.println("la primera letra es " + letra1);
        System.out.println("Todas las letras forman la palabra " + letra1 + letra2 + letra3 + letra4);

        System.out.println(letra1);
        System.out.println(letra2);
        System.out.println(letra1 + letra2);
        System.out.println(letra1 + "" + letra2);

        char letra5 = 99;
        char letra6 = 97;
        System.out.println(letra5);
        System.out.println(letra5 + letra6);
        System.out.println(letra5 + "" + letra6);

        System.out.println("");
        System.out.println("// // // // // // // //");

        String miString = "a";
        char letraA = 'a';
        System.out.println(miString);
        System.out.println(letraA);

        System.out.println(""); 
        System.out.println("// // // // // // // //");

        int num1 = 9;
        int num2 = 2;
        System.out.println("El resto de dividir " + num1 + " entre " + num2 + " es " + num1%num2);

        System.out.println(""); 
        System.out.println("// // // // // // // //");

        int num3 = 2;
        int num4 = 9;

        System.out.println("El casting de la variable num4: " + (double)num4);
        System.out.println(num4/num3);
        System.out.println((double)num4 / (double)num3);
        System.out.println((double) num4/num3);
        System.out.println(num4/(double)num3);
    }
}