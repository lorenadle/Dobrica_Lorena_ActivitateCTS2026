package clienti;

public class ClientFidel implements Observer{
    private String numeClient;

    public ClientFidel(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void receptionareMesej(String mesaj) {
        System.out.println(numeClient+" ai primit mesajul: "+mesaj);
    }
}
