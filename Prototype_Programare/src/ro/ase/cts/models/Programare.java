package ro.ase.cts.models;

public class Programare implements Cloneable {

    private String nume;

    private String nrTelefon;

    private int nrAnalize;

    public Programare(String nume, String nrTelefon, int nrAnalize) {
        if (nume.length() > 3) {
            this.nume = nume;
        } else {
            this.nume = "Nan";
        }

        if (nrTelefon.length() == 10) {
            this.nrTelefon = nrTelefon;
        } else {
            this.nrTelefon = "0000000000";
        }

        if (nrAnalize > 0) {
            this.nrAnalize = nrAnalize;
        }
    }

    private Programare() {
    }

    public void setNrAnalize(int nrAnalize) {
        this.nrAnalize = nrAnalize;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Programare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", nrPersoane=").append(nrAnalize);
        sb.append('}');
        return sb.toString();
    }


    public Programare copiaza() throws CloneNotSupportedException {
        return (Programare) super.clone();
    }


}
