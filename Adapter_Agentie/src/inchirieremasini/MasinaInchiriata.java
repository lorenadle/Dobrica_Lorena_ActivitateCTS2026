package inchirieremasini;

public class MasinaInchiriata {
    private Masina masina;

    public MasinaInchiriata(Masina masina) {
        this.masina = masina;
    }
    public void inchiriazaMasina(){
        System.out.println("masina inchiriata"+masina.toString());
    }

    @Override
    public String toString() {
        return "MasinaInchiriata{" +
                "masina=" + masina +
                '}';
    }
}
