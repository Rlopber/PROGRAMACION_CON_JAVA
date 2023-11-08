/**
*
* Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
*
* @author Raquel Lopez
*/
import java.util.Scanner;

public class T04Ejercicio10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Este programa te va a decir tu horóscopo según tu día y mes de nacimiento.");
        System.out.print("¿Qué día naciste? ");
        int dia = s.nextInt();
        s.nextLine();
        System.out.print("¿De qué mes (en minúsculas)? ");
        String mes = s.nextLine();

        String horoscopo = "";

        if (dia<1 || dia>31) {
            System.out.println("El día que has introducido no es válido.");
        } else {
            switch (mes) {
            case "enero":
                if (dia>=1 && dia<=19){
                    horoscopo = "Capricornio";
                } else if (dia>19 && dia<=31) {
                    horoscopo = "Acuario";
                }
                break;
            case "febrero":
                if (dia>=1 && dia<=18){
                    horoscopo = "Acuario";
                } else if (dia>18 && dia<=29) {
                    horoscopo = "Piscis";
                }
                break;
            case "marzo":
                if (dia>=1 && dia<=20){
                    horoscopo = "Piscis";
                } else if (dia>20 && dia<=31) {
                    horoscopo = "Aries";
                }
                break;
            case "abril":
                if (dia>=1 && dia<=19){
                    horoscopo = "Aries";
                } else if (dia>19 && dia<=30) {
                    horoscopo = "Tauro";
                }
                break;
            case "mayo":
                if (dia>=1 && dia<=20){
                    horoscopo = "Tauro";
                } else if (dia>20 && dia<=31) {
                    horoscopo = "Géminis";
                }
                break;
            case "junio":
                if (dia>=1 && dia<=20){
                    horoscopo = "Géminis";
                } else if (dia>20 && dia<=30) {
                    horoscopo = "Cáncer";
                }
                break;
            case "julio":
                if (dia>=1 && dia<=22){
                    horoscopo = "Cáncer";
                } else if (dia>22 && dia<=31) {
                    horoscopo = "Leo";
                }
                break;
            case "agosto":
                if (dia>=1 && dia<=22){
                    horoscopo = "Leo";
                } else if (dia>22 && dia<=30) {
                    horoscopo = "Virgo";
                }
                break;
            case "septiembre":
                if (dia>=1 && dia<=22){
                    horoscopo = "Virgo";
                } else if (dia>22 && dia<=31) {
                    horoscopo = "Libra";
                }
                break;
            case "octubre":
                if (dia>=1 && dia<=22){
                    horoscopo = "Libra";
                } else if (dia>22 && dia<=31) {
                    horoscopo = "Escorpio";
                }
                break;
            case "noviembre":
                if (dia>=1 && dia<=21){
                    horoscopo = "Escorpio";
                } else if (dia>21 && dia<=31) {
                    horoscopo = "Sagitario";
                }
                break;
            case "diciembre":
                if (dia>=1 && dia<=21){
                    horoscopo = "Sagitario";
                } else if (dia>21 && dia<=31) {
                    horoscopo = "Capricornio";
                }
                break;

            default:
                System.out.println("El mes proporcionado no es válido.");
                break;
            }
            System.out.println("Tu horóscopo es" + horoscopo + ".");
            s.close();
        }       
    }
}
