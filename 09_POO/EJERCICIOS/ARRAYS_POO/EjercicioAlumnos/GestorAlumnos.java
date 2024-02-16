package ARRAYS_POO.EjercicioAlumnos;

public class GestorAlumnos {
    
    
    /** 
     * Dar de alta a un alumno en el sistema.
     * @param alumnos
     */
    public static void darAlta(Alumno[] alumnos) {
        System.out.println("¿Cuántos alumnos va a dar de alta?");

        //Ver el espacio disponible en el array
        int espaciosDisponibles = 0;
        for (Alumno alumno : alumnos) {
            if (alumno == null) {
                espaciosDisponibles++;
            }
        }

        //Cantidad de alumnos a dar alta
        int numAlta = 0;
        do {
            numAlta = Integer.parseInt(System.console().readLine());
            if (numAlta > espaciosDisponibles) {
                System.out.println("La cantidad introducida excede los espacios disponibles. Introduzca otra cantidad.");
            }
        } while (numAlta > espaciosDisponibles);

        //Dar de alta al alumno
        int alumnoDadoAlta = 0;
        for (int i = 0; i < alumnos.length && alumnoDadoAlta < numAlta ; i++) {
            if (alumnos[i] == null) {
                alumnos[i] = new Alumno();
                System.out.print("Indique el nombre del alumno: ");
                String nombre = System.console().readLine();
                alumnos[i].setNombre(nombre);

                System.out.print("Nota media del alumno: " );
                Double notaMedia = Double.parseDouble(System.console().readLine());
                alumnos[i].setNotaMedia(notaMedia);

                alumnos[i].setIdAlumno(i+1);

                alumnoDadoAlta++;
            } 
        }
    }
    
    
    /** 
     * Mostrar por pantalla el listado de alumnos.
     * @param alumnos
     */

    public static void mostrarListado(Alumno[] alumnos) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                System.out.println(alumnos[i].toString());
            }
        }
    }

    
    /** 
     * Modificar la información de un alumno.
     * @param alumnos
     */

    public static void modificarAlumno(Alumno[] alumnos) {
        System.out.println("Para modificar un alumno necesita conocer su identificador.");
        System.out.print("¿Necesita buscar el id del alumno? (y/n): ");
        String opcion = System.console().readLine().toLowerCase();
        switch (opcion) {
            case "y":
                buscarID(alumnos);
                break;
            
            case "n":
                System.out.print("Indique el identificador del alumno: ");
                int numeroAlumno = Integer.parseInt(System.console().readLine());
                    
                if (compararID(alumnos, numeroAlumno)) { 
                    //Modificar el contenido
                    System.out.print("Indique el nombre del alumno: ");
                    String nombre = System.console().readLine();
                    alumnos[(numeroAlumno-1)].setNombre(nombre);

                    System.out.print("Nota media del alumno: ");
                    Double notaMedia = Double.parseDouble(System.console().readLine());
                    alumnos[(numeroAlumno-1)].setNotaMedia(notaMedia);

                    System.out.println("¡Alumno actualizado!");

                } else {// Si no coincide, reproduce mensaje de error
                    System.out.println("El número " + numeroAlumno + " es inválido. Inténtelo de nuevo.");
                }
                break;
                
            default:
                System.out.println("La opción " + opcion + " no existe, pruebe de nuevo.");
                break;
        }
    }

    
    /** 
     * Busca el ID del alumno.
     * @param alumnos
     */
    public static void buscarID(Alumno[] alumnos) {
        int numeroID = 0;
        String nombreIntroducido;
        double notaIntroducida;
        boolean idEncontrado = false;
        
        System.out.print("Introduzca el nombre del alumno: ");
        nombreIntroducido = System.console().readLine();
        System.out.print("Introduzca la nota media del alumno: ");
        notaIntroducida = Double.parseDouble(System.console().readLine());

        for (int i = 0; i < alumnos.length && !idEncontrado; i++) {
            if (alumnos[i] != null && alumnos[i].getNombre().equals(nombreIntroducido) && alumnos[i].getNotaMedia() == notaIntroducida) {
                idEncontrado = true;
                numeroID = i+1;
            } 
        }

        if (idEncontrado) {
            System.out.println("El identificador del alumno es " + numeroID);
        } else {
            System.out.println("Los datos introducidos no coinciden con ningún alumno del listado.");
        }
    }
    
    
    /** 
     * Compara el id de los alumnos con el id introducido.
     * @param alumnos
     * @param numeroIntroducido
     * @return boolean true si coinciden, boolean false si no coinciden.
     */
    public static boolean compararID(Alumno[] alumnos, int numeroIntroducido) {
        boolean alumnoEncontrado = false;

            
        //Recorre el array hasta que conincida el numero introducido con el id del alumno  
            for (int i = 0; i < alumnos.length && !alumnoEncontrado; i++) {
                if (alumnos[i] != null && alumnos[i].getIdAlumno() == numeroIntroducido) {
                    alumnoEncontrado = true;
                }
            }
        return alumnoEncontrado;
    }
    
    /** 
     * Borra la información de un alumno.
     * @param alumnos
     */
    public static void borrarAlumno(Alumno[] alumnos) {
        System.out.println("Para modificar un alumno necesita conocer su identificador.");
        System.out.print("¿Necesita buscar el id del alumno? (y/n): ");
        String opcion = System.console().readLine().toLowerCase();
        switch (opcion) {
            case "y":
                buscarID(alumnos);
                break;
            
            case "n":
                System.out.print("Indique el identificador del alumno: ");
                int numeroAlumno = Integer.parseInt(System.console().readLine());
                
                if (compararID(alumnos, numeroAlumno)) { 
                    //Borrar el contenido
                    alumnos[(numeroAlumno-1)] = null;

                    System.out.println("¡Alumno borrado!");

                } else { // Si no coincide, reproduce mensaje de error
                    System.out.println("El número " + numeroAlumno + " es inválido. Inténtelo de nuevo.");
                }
                break;

            default:
                System.out.println("La opción " + opcion + " no existe, pruebe de nuevo.");
                break;
        }
    }
}
