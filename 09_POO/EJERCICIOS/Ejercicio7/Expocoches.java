package Ejercicio7;

public class Expocoches {
    public static void main(String[] args) {

        //Variables a utilizar
        boolean continuar = true;
        Zona principal = new Zona(1000);
        Zona compraventa = new Zona(200);
        Zona vip = new Zona(25);

        
        //Crear el menú
        do {
            System.out.println("Elija una de las siguientes opciones: ");
            System.out.println("1. Mostrar número de entradas libres\n2. Vender entradas\n3. Salir");
            System.out.print("Opción: ");
            int opcion = Integer.parseInt(System.console().readLine());
            
            switch (opcion) {
                case 1:
                    System.out.println("Estas son las entradas que quedan: ");
                    System.out.println("Zona principal: " + principal.getEntradasPorVender() + " entradas");
                    System.out.println("Zona compra-venta: " + compraventa.getEntradasPorVender() + " entradas");
                    System.out.println("Zona VIP: " + vip.getEntradasPorVender() + " entradas");
                    System.out.println();
                    break;
                
                case 2:
                    System.out.println("¿Cuántas entradas va a querer?");
                    int numeroEntradas = Integer.parseInt(System.console().readLine());
                    System.out.println("¿De qué zona?:");
                    System.out.println("1. Zona principal\n2. Zona compra-venta\n3. Zona VIP");
                    System.out.print("Opción: ");
                    int zonaEntrada = Integer.parseInt(System.console().readLine());
                    switch (zonaEntrada) {
                        case 1:
                            principal.vender(numeroEntradas);
                            System.out.println();
                            break;

                        case 2:
                            compraventa.vender(numeroEntradas);
                            System.out.println();
                            break;

                        case 3:
                            vip.vender(numeroEntradas);
                            System.out.println();
                            break;
                    
                        default:
                        System.out.println("Opción no válida: " + opcion + ". Elija una de las opciones indicadas."); 
                            break;
                    }
                    break;
                
                case 3:
                continuar = false;
                System.out.println("Gracias por usar nuestra aplicación, ¡vuelva cuando quiera!");
                    break;
            
                default:
                    System.out.println("Opción no válida: " + opcion + ". Elija una de las opciones indicadas."); 
                    break;
            }
        } while (continuar);
    }
}
