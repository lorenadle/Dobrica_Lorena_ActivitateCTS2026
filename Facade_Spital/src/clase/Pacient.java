package clase;

public class Pacient {
    private String nume;
    private boolean stareGrava;


    public Pacient(String nume, boolean stareGrava) {
        this.nume = nume;
        this.stareGrava = stareGrava;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isStareGrava() {
        return stareGrava;
    }

    public void setStareGrava(boolean stareGrava) {
        this.stareGrava = stareGrava;
    }
}
