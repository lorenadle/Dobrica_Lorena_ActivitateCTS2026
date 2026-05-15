package clase;

public class Rezervare implements IRezervare{
    private int numarNopti;
    private int codRezervare;

    public int getNumarNopti() {
        return numarNopti;
    }

    public void setNumarNopti(int numarNopti) {
        this.numarNopti = numarNopti;
    }

    public int getCodRezervare() {
        return codRezervare;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public Rezervare(int numarNopti, int codRezervare) {
        super();
        this.numarNopti = numarNopti;
        this.codRezervare = codRezervare;
    }

    @Override
    public void anulareRezervare() {
        System.out.println("rezrevarea cu codul "+codRezervare+" a fost anulata");
    }
}
