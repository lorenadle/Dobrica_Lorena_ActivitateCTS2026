package ro.ase.cts.aplicatii.staticblock;

public class ServiceStaticBlock {   private String numeService;
    private int numarAngajati;
    private float suprafata;
    private static ServiceStaticBlock instanta;
    static{
        try{
            instanta=new ServiceStaticBlock();
        }catch (Exception exception){
            System.out.println("Service nu poate fi creat");
        }
    }

    public ServiceStaticBlock() {
        this.numeService = "SERVAUTO";
        this.numarAngajati = 45;
        this.suprafata = 950;
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

    public static ServiceStaticBlock getInstanta(String numeService, int numarAngajati, float suprafata) {
        return instanta;
    }


}

