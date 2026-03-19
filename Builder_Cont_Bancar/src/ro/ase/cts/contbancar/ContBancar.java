package ro.ase.cts.contbancar;

public class ContBancar {
    private String titular;
    private double sumaBlocata;
    private double suma;
    private String valuta;

    private boolean cardAtasat;
    private boolean internetBanking;
    private boolean contSalariu;

    @Override
    public String toString() {
        return "ContBancar [titular=" + titular + ", sumaBlocata=" + sumaBlocata + ", suma=" + suma + ", valuta="
                + valuta + ", cardAtasat=" + cardAtasat + ", internetBanking=" + internetBanking + ", contSalariu="
                + contSalariu + "]";
    }

    public ContBancar() {

    }

    public ContBancar(String titular, double sumaBlocata, double suma, String valuta, boolean cardAtasat,
                      boolean internetBanking, boolean contSalariu) {
        super();
        this.titular = titular;
        this.sumaBlocata = sumaBlocata;
        this.suma = suma;
        this.valuta = valuta;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
        this.contSalariu = contSalariu;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSumaBlocata() {
        return sumaBlocata;
    }

    public void setSumaBlocata(double sumaBlocata) {
        this.sumaBlocata = sumaBlocata;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    public boolean isCardAtasat() {
        return cardAtasat;
    }

    public void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    public boolean isInternetBanking() {
        return internetBanking;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    public boolean isContSalariu() {
        return contSalariu;
    }

    public void setContSalariu(boolean contSalariu) {
        this.contSalariu = contSalariu;
    }

}