package ro.ase.cts.aplicatii.lazyinitialization;

public class ServiceLazyInitialization {
    private String numeService;
    private int numarAngajati;
    private float suprafata;
    private static ServiceLazyInitialization instanta=null;

    public ServiceLazyInitialization(String numeService, int numarAngajati, float suprafata) {
        this.numeService = numeService;
        this.numarAngajati = numarAngajati;
        this.suprafata = suprafata;
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
    public static ServiceLazyInitialization getInstanta(String numeService, int numarAngajati, float suprafata){
        if(instanta==null){
            instanta=new ServiceLazyInitialization( numeService,  numarAngajati,  suprafata);
        }
        return instanta;
    }
}
