/**
*
* Escribe un programa que genere la nómina (bien desglosada) de un empleado.:
*
* @author: Raquel Lopez
*/

import java.util.Scanner;

public class T04Ejercicio24 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("1 - Programador Junior\n2 - Prog. senior\n3 - Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        int cargoEmpleado = s.nextInt();
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int diasViaje = s.nextInt();
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        int estadoCivil = s.nextInt();
        s.close();

        // Saber el sueldo base
        int sueldoBase = 0;
        switch (cargoEmpleado) {
            case 1:
                sueldoBase = 950;
                break;
            case 2:
                sueldoBase = 1200;
                break;
            case 3:
                sueldoBase = 1600;
                break;
            default:
                System.out.println("El cargo no es correcto.");
                break;
        }

        //Calcular dietas
        double dietas = diasViaje*30;

        // Calcular IRPF
        double sueldoBruto = sueldoBase+dietas;

        int porcRetencion = 0;
        double retencion = 0;


        switch (estadoCivil) {
            case (1):
                porcRetencion = 25;
                retencion = sueldoBruto * (porcRetencion/100.0);
                break;
            
            case (2):
                porcRetencion = 20;
                retencion = sueldoBruto * (porcRetencion/100.0);
                break;

            default:
                System.out.println("El estado civil no es correcto.");
                break;
        }

        //Calcular sueldo neto
        double sueldoNeto = sueldoBruto-retencion;


        System.out.println("------------------------------");
        System.out.printf("| Sueldo base %15.2f |\n", (double)sueldoBase);
        System.out.printf("| Dietas (%d viajes) %9.2f |\n", diasViaje, dietas);
        System.out.println("|-----------------------------|");
        System.out.printf("| Sueldo bruto %14.2f |\n", sueldoBruto);
        System.out.printf("| Retención (%d%%) %11.2f |\n", porcRetencion, retencion);
        System.out.println("|-----------------------------|");
        System.out.printf("| Sueldo neto %15.2f |\n", sueldoNeto);
        System.out.println("-------------------------------");


    }    
}
