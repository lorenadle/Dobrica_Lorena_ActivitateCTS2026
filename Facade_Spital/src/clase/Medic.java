package clase;

public class Medic {
    private  String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public boolean  confirmaInternare(Pacient pacient){
        System.out.println("medicuul "+nume +"confirma internarea pacientului " +pacient.getNume());
        return true;
    }
}
