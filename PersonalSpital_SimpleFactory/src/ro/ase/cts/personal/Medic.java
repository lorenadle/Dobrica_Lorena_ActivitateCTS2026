package ro.ase.cts.personal;

public class Medic extends Angajat{
    public Medic(String numeAngajat) {
        super(numeAngajat);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("NumeAngajat='").append(NumeAngajat).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
