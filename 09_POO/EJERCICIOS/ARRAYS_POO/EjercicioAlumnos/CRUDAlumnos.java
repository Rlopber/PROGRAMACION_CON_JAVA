package ARRAYS_POO.EjercicioAlumnos;

public class CRUDAlumnos {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[100]; //Creamos el array de objetos
        boolean continuar = true;
        String opcion;

        System.out.println("¡Bienvenido a la aplicación de gestión de alumnos!");

        do {
        System.out.println("¿Qué desea realizar?");
        System.out.print("1. Dar alta\n2. Mostrar listado\n3. Editar alumno\n4. Borrar alumno\n5. Salir\n");
        System.out.print("Opción: ");
        opcion = System.console().readLine();
        System.out.println();

            switch (opcion) {

                case "1":
                    GestorAlumnos.darAlta(alumnos);
                    System.out.println();
                    break;
                
                case "2":
                    GestorAlumnos.mostrarListado(alumnos);
                    System.out.println();
                    break;
                
                case "3":
                    GestorAlumnos.modificarAlumno(alumnos);
                    System.out.println();
                    break;

                case "4":
                    GestorAlumnos.borrarAlumno(alumnos);
                    System.out.println();
                    break;

                case "5":
                    continuar = false;
                    System.out.println("¡Vuelva cuando quiera!");
                    break;

                default:
                    System.out.println("La opción " + opcion + " no existe, vuelva a intentarlo.");
                    break;
            }
        } while (continuar);
    }
}
