package Ejercicio5;

public class Gestisimal {
    static final int N = 10;
    static Articulo[] almacen = new Articulo[N];

    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            Gestisimal.almacen[i] = new Articulo();
        }

        ///Variables
        int opcion;
        String codigoIntroducido;
        int mercancia;

        //MENU
        do {
            System.out.println("\n GESTISIMAL");
            System.out.println("============");
    
            System.out.println("1. Listado\n2. Alta\n3. Baja\n4. Modificación\n5. Entrada de mercancía\n6. Salida de mercancía\n7. Salir");
    
            System.out.print("\nOpción: ");
            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:     //LISTADO
                    for (Articulo articulo : almacen) {
                        if (articulo.getCodigo() != null) {
                            System.out.println(articulo);
                        }
                    }
                    break;

                case 2:     //ALTA
                    if (primeraLibre() == -1) {
                        System.out.println("Lo sentimos. No quedan huecos para registrar artículos.");
                    } else {
                        int posicion = primeraLibre();

                        do {    //Comprobar que no existe el código antes de dar el alta
                            System.out.print("\nCódigo: ");
                            codigoIntroducido = System.console().readLine();
                            if (!codigoExiste(codigoIntroducido)) {
                                almacen[posicion].setCodigo(codigoIntroducido);
                            } else {
                                System.out.println("Ese código está siendo utilizado, pruebe otro.");
                            }
                        } while (almacen[posicion].getCodigo() == null);

                        System.out.print("Descripción: ");
                        almacen[posicion].setDescripcion(System.console().readLine());
                        System.out.print("Precio de compra: ");
                        almacen[posicion].setPrecioDeCompra(Double.parseDouble(System.console().readLine()));
                        System.out.print("Precio de venta: ");
                        almacen[posicion].setPrecioDeVenta(Double.parseDouble(System.console().readLine()));
                        System.out.print("Stock: ");
                        almacen[posicion].setStock(Integer.parseInt(System.console().readLine()));
                    }
                    break;

                case 3:     //BAJA
                    System.out.print("\nIndique el código del artículo que quiere dar de baja: ");
                    codigoIntroducido = System.console().readLine();

                    if (!codigoExiste(codigoIntroducido)) {
                        System.out.println("El código introducido no está en el sistema.");
                    } else {
                        almacen[encontrarCodigo(codigoIntroducido)].setCodigo(null);
                        System.out.println("El artículo ha sido dado de baja.");
                    }
                    
                    break;

                case 4:     //MODIFICACIÓN
                System.out.print("\nIndique el código del artículo que quiere modificar: ");
                codigoIntroducido = System.console().readLine();

                if (!codigoExiste(codigoIntroducido)) {
                    System.out.println("El código introducido no está en el sistema.");
                } else {
                    System.out.println("¿Qué quiere modificar?");
                    System.out.println("1. Código\n2. Descripción\n3. Precio de compra\n4. Precio de venta\n5. Stock\n6. Todo");

                    System.out.print("\nOpción: ");
                    opcion = Integer.parseInt(System.console().readLine());
                    
                    do { 
                        switch (opcion) {
                            case 1:
                                System.out.print("Nuevo código: ");
                                almacen[encontrarCodigo(codigoIntroducido)].setCodigo(System.console().readLine());
                                break;

                            case 2:
                                System.out.print("Nueva descripción: ");
                                almacen[encontrarCodigo(codigoIntroducido)].setDescripcion(System.console().readLine());
                                break;

                            case 3:
                                System.out.print("Nuevo precio de compra: ");
                                almacen[encontrarCodigo(codigoIntroducido)].setPrecioDeCompra(Double.parseDouble(System.console().readLine()));
                                break;

                            case 4:
                                System.out.print("Nuevo precio de venta: ");
                                almacen[encontrarCodigo(codigoIntroducido)].setPrecioDeVenta(Double.parseDouble(System.console().readLine()));
                                break;

                            case 5:
                                System.out.print("Nuevo stock: ");
                                almacen[encontrarCodigo(codigoIntroducido)].setStock(Integer.parseInt(System.console().readLine()));
                                break;

                            case 6:
                                modificarTodo(codigoIntroducido);
                                break;
                        
                            default:
                                System.out.println("El número introducido no corresponde a ninguna opción, pruebe de nuevo.");
                                break;
                        }
                    } while (opcion < 1 && opcion > 6);
                }
                    break;

                case 5:     //ENTRADA DE MERCANCIA
                    System.out.print("\nIntroduzca el código del artículo que ha llegado al almacén: ");
                    codigoIntroducido = System.console().readLine();

                    if (!codigoExiste(codigoIntroducido)) {
                        System.out.println("El código introducido no está en el sistema.");
                    } else {
                        System.out.print("¿Qué cantidad de mercancía ha llegado?: ");
                        mercancia = Integer.parseInt(System.console().readLine());
                        do {
                            System.out.print("¿Qué cantidad de mercancía tiene que salir?: ");
                            mercancia = Integer.parseInt(System.console().readLine());
                            if (mercancia < 1) {
                                System.out.println("La cantidad no puede ser inferior a 1, pruebe de nuevo.");
                            }
                        } while (mercancia < 1);
                        entradaMercancia(codigoIntroducido, mercancia);
                    }
                    
                    break;

                case 6:     //SALIDA DE MERCANCIA
                    System.out.print("\nIntroduzca el código del artículo que va a salir del almacén: ");
                    codigoIntroducido = System.console().readLine();

                    if (!codigoExiste(codigoIntroducido)) {
                        System.out.println("El código introducido no está en el sistema.");
                    } else {
                        do {
                            System.out.print("¿Qué cantidad de mercancía tiene que salir?: ");
                            mercancia = Integer.parseInt(System.console().readLine());
                            if (mercancia < 1) {
                                System.out.println("La cantidad no puede ser inferior a 1, pruebe de nuevo.");
                            }
                        } while (mercancia < 1);
                        salidaMercancia(codigoIntroducido, mercancia);
                    }
                    break;

                case 7:     //SALIDA DEL PROGRAMA
                    System.out.println("\n¡Gracias por usar nuestra aplicación! ¡Vuelva pronto!");
                    break;

                default:
                    System.out.println("\nLa opción elegida no existe. Elija otra opción.");
                    break;
            }
        } while (opcion != 7);
    }

    ////FUNCIONES

    /* Buscar la primera posición libre del array almacen*/
    public static int primeraLibre() {
        for (int i = 0; i < N; i++) {
            if (almacen[i].getCodigo() == null) {
                return i;
            } 
        }

        return -1;
    }

    /* Comprobar si el código introducido existe */
    public static boolean codigoExiste(String codigo) {
        for (Articulo articulo : almacen) {
            if (articulo.getCodigo() != null && articulo.getCodigo().equals(codigo)) {
                return true;
            }
        }

        return false;
    }

    /* Encontrar en los códigos dentro del array almacen el código introducido */
    public static int encontrarCodigo(String codigo) {
        for (int i = 0; i < N; i++) {
            if (almacen[i].getCodigo().equals(codigo)) {
                return i;
            }
        }
        return -1;
    }

    /* Modificar todos los datos del artículo */
    private static void modificarTodo(String codigo) {

        System.out.print("Nuevo código: ");
        String nuevoCodigo = System.console().readLine();

        almacen[encontrarCodigo(codigo)].setCodigo(nuevoCodigo);

        System.out.print("Nueva descripción: ");
        almacen[encontrarCodigo(nuevoCodigo)].setDescripcion(System.console().readLine());
        System.out.print("Nuevo precio de compra: ");
        almacen[encontrarCodigo(nuevoCodigo)].setPrecioDeCompra(Double.parseDouble(System.console().readLine()));
        System.out.print("Nuevo precio de venta: ");
        almacen[encontrarCodigo(nuevoCodigo)].setPrecioDeVenta(Double.parseDouble(System.console().readLine()));
        System.out.print("Nuevo stock: ");
        almacen[encontrarCodigo(nuevoCodigo)].setStock(Integer.parseInt(System.console().readLine()));
    }

    /* Entrada de mercancía */
    private static void entradaMercancia(String codigo, int nuevoStock) {
        int stockActual;

        stockActual = almacen[encontrarCodigo(codigo)].getStock();
        almacen[encontrarCodigo(codigo)].setStock(stockActual+nuevoStock);

        System.out.println("¡Mercancía almacenada!");
    } 

    /* Salida de mercancía */
    private static void salidaMercancia(String codigo, int salidaStock) {
        int stockActual;

        stockActual = almacen[encontrarCodigo(codigo)].getStock();
        if (stockActual - salidaStock >= 0) {
            almacen[encontrarCodigo(codigo)].setStock(stockActual-salidaStock);
            System.out.println("¡La mercancía ha salido del almacén!");
        } else {
            System.out.println("Lo siento, no hay suficiente stock para cubrir la salida.");
        }
    } 
}
