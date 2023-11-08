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

        if (dia<1 || dia>31) {
            System.out.println("El día que has introducido no es válido.");
        } else {
            switch (mes) {
            case "enero":
                if (dia>=1 && dia<=19){
                    System.out.println("Tu horóscopo es Capricornio.");
                } else if (dia>19 && dia<=31) {
                    System.out.println("Tu horóscopo es Acuario.");
                }
                break;
            case "febrero":
                if (dia>=1 && dia<=18){
                    System.out.println("Tu horóscopo es Acuario.");
                } else if (dia>18 && dia<=29) {
                    System.out.println("Tu horóscopo es Piscis.");
                }
                break;
            case "marzo":
                if (dia>=1 && dia<=20){
                    System.out.println("Tu horóscopo es Piscis.");
                } else if (dia>20 && dia<=31) {
                    System.out.println("Tu horóscopo es Aries.");
                }
                break;
            case "abril":
                if (dia>=1 && dia<=19){
                    System.out.println("Tu horóscopo es Aries.");
                } else if (dia>19 && dia<=30) {
                    System.out.println("Tu horóscopo es Tauro.");
                }
                break;
            case "mayo":
                if (dia>=1 && dia<=20){
                    System.out.println("Tu horóscopo es Tauro.");
                } else if (dia>20 && dia<=31) {
                    System.out.println("Tu horóscopo es Géminis.");
                }
                break;
            case "junio":
                if (dia>=1 && dia<=20){
                    System.out.println("Tu horóscopo es Géminis.");
                } else if (dia>20 && dia<=30) {
                    System.out.println("Tu horóscopo es Cáncer.");
                }
                break;
            case "julio":
                if (dia>=1 && dia<=22){
                    System.out.println("Tu horóscopo es Cáncer.");
                } else if (dia>22 && dia<=31) {
                    System.out.println("Tu horóscopo es Leo.");
                }
                break;
            case "agosto":
                if (dia>=1 && dia<=22){
                    System.out.println("Tu horóscopo es Leo.");
                } else if (dia>22 && dia<=30) {
                    System.out.println("Tu horóscopo es Virgo.");
                }
                break;
            case "septiembre":
                if (dia>=1 && dia<=22){
                    System.out.println("Tu horóscopo es Virgo.");
                } else if (dia>22 && dia<=31) {
                    System.out.println("Tu horóscopo es Libra.");
                }
                break;
            case "octubre":
                if (dia>=1 && dia<=22){
                    System.out.println("Tu horóscopo es Libra.");
                } else if (dia>22 && dia<=31) {
                    System.out.println("Tu horóscopo es Escorpio.");
                }
                break;
            case "noviembre":
                if (dia>=1 && dia<=21){
                    System.out.println("Tu horóscopo es Escorpio.");
                } else if (dia>21 && dia<=31) {
                    System.out.println("Tu horóscopo es Sagitario.");
                }
                break;
            case "diciembre":
                if (dia>=1 && dia<=21){
                    System.out.println("Tu horóscopo es Sagitario.");
                } else if (dia>21 && dia<=31) {
                    System.out.println("Tu horóscopo es Capricornio.");
                }
                break;

            default:
                System.out.println("El mes proporcionado no es válido.");
                break;
            }
            s.close();
        }       
    }
}
