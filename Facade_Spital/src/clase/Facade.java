package clase;

public class Facade {
    private Medic medic;
    private Salon salon;

    public Facade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient){
        if (pacient.isStareGrava()
        &&medic.confirmaInternare(pacient)
        &&salon.existaPatliber()) {
            System.out.println("pacient " + pacient.getNume() + " poate fi internat");
        }
        else    {
            System.out.println("pacient " + pacient.getNume() + "nu  poate fi internat");
        }
    }

}
