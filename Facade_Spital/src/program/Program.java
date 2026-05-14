package program;


import clase.Facade;
import clase.Medic;
import clase.Pacient;
import clase.Salon;

public class Program {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ion Popescu", true);
        Medic medic = new Medic("Ionescu");
        Salon salon = new Salon(2);

        Facade facade = new Facade(medic, salon);
        facade.interneazaPacient(pacient);
    }
}