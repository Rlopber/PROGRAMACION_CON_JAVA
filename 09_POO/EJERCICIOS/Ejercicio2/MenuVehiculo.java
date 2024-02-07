package Ejercicio2;

public class MenuVehiculo {
    public static void main(String[] args) throws InterruptedException {
        Coche coche = new Coche (0, "Ibiza");

        boolean continuar = true;
        
        do {
            System.out.println("VEHÍCULOS");
            System.out.println("=========");

            System.out.println("1. Anda con la bicicleta.");
            System.out.println("2. Haz el caballito con la bicicleta.");
            System.out.println("3. Anda con el coche.");
            System.out.println("4. Quema rueda con el coche.");
            System.out.println("5. Ver kilometraje de la bicicleta.");
            System.out.println("6. Ver kilometraje del coche.");
            System.out.println("7. Ver kilometraje total.");
            System.out.println("8. Salir.");

            System.out.print("Elige una opción (1-8): ");
            int opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                case 3:
                    System.out.println("¿Cuánto quieres andar?: ");
                    int kilometros = Integer.parseInt(System.console().readLine());
                    if (opcion == 1) {
                        bicicleta.anda(kilometros);
                    } else {
                        coche.anda(kilometros);
                    }
                    
                    System.out.print("Moviéndote");
                    for (int i = 0; i < 3; i++) {
                        Thread.sleep(500);
                        System.out.print(".");
                    }
                    System.out.print(" ¡Llegaste!\n");
                    Thread.sleep(500);
                    System.out.println();
                    break;

                case 2:
                
                    break;

                case 4:
                    System.out.println(coche.quemaRueda());
                    break;

                case 5:
                
                    break;

                case 6:
                
                    break;

                case 7:
                
                    break;

                case 8:
                    continuar = false;
                    System.out.println("¡Vuelva pronto!");
                    break; 
            
                default:
                    break;
            }
        } while (continuar);
    }
}
