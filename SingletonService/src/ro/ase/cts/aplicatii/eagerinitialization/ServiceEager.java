package ro.ase.cts.aplicatii.eagerinitialization;

public class ServiceEager {
    private String numeService;
    private int numarAngajati;
    private float suprafata;

    private static final ServiceEager instanta= new ServiceEager();

    public ServiceEager() {
        this.numeService = "AutoService";
        this.numarAngajati = 20;
        this.suprafata = 200;
    }

    public String getNumeService() {
        return numeService;
    }

    public void setNumeService(String numeService) {
        this.numeService = numeService;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public float getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(float suprafata) {
        this.suprafata = suprafata;
    }
    public static ServiceEager getInstanta(String numeService, int numarAngajati, float suprafata){
        return instanta;
    }
}

