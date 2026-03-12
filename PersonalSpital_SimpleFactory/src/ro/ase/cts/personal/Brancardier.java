package ro.ase.cts.personal;

public class Brancardier extends Angajat{
    public Brancardier(String numeAngajat) {
        super(numeAngajat);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append("NumeAngajat='").append(NumeAngajat).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
