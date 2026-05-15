package program;

import clase.*;

public class Program {
    public static void main(String[] args) {
        PachetTuristic pachet=new PachetCazare(23);
        Operator operator=new Operator();
        Command vanzare=new ComandaVanzare(pachet);
        Command rezervare=new ComandaRezervare(pachet);
        operator.invoca(rezervare);
        operator.invoca(vanzare);
    }
}
