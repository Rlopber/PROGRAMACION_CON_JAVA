package T10Ejercicio08;

public class Carta {
    private static String[] palos = {"Oros", "Espadas", "Bastos", "Copas"};
    private static String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};

    private String palo;
    private String numero;

    ////Constructor
    public Carta() {
        this.palo = palos[(int)(Math.random()*4)];
        this.numero = numeros[(int)(Math.random()*10)];
    }

    public String getPalo() {
        return palo;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Carta other = (Carta) obj;      
        if (!numero.equals(other.numero))   //Esto es más probable que ocurra, por eso se pone primero
            return false;

        if (!palo.equals(other.palo))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}
