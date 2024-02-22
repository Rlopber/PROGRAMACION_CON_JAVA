package Password;

public class Password {

    private static int longitudDefault = 8;

    private int longitud;
    private String password;

    ///Constructor
    public Password() {
        this.longitud = longitudDefault;
        this.password = GenerarPassword(longitudDefault);
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.password = GenerarPassword(longitud);
    }

    //Getters
    public int getLongitud() {
        return longitud;
    }

    public String getpassword() {
        return password;
    }

    //Setters
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    //Métodos
    /** 
     * Método para generar passwords
     * @param longitud
     * @return String con la password
     */
    
    private String GenerarPassword(int longitud) {
        String password = "";
        int eleccion;

        for (int i = 0; i < longitud; i++) {
            eleccion = (int)(Math.random()*3+1);

            switch (eleccion) {
                case 1:
                    //Añade un número
                    char numero =(char)((int)(Math.random()*10) + '0');
                    password += numero;
                    break;
                
                case 2:
                    //Añade una mayúscula
                    char minuscula =(char)((int)(Math.random()*26) + 'A');
                    password += minuscula;
                    break;

                case 3:
                    //Añade una minúscula
                    char mayuscula =(char)((int)(Math.random()*26) + 'a');
                    password += mayuscula;
                    break;
            
                default:
                    System.out.println("Error al generar el carácter de la password.");
                    break;
            }
        }

        return password;
    }

    public boolean esFuerte() {
        int cuentanumeros = 0;
        int cuentaminusculas = 0;
        int cuentamayusculas = 0;

        for (int i = 0; i < password.length(); i++) {

            if (password.charAt(i)>=97 && password.charAt(i)<=122) {
                cuentaminusculas+=1;
            } else if (password.charAt(i)>=65 && password.charAt(i)<=90) {
                cuentamayusculas+=1;
            } else {
                cuentanumeros+=1;
            }
        } 

        return (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2);
    }
}

