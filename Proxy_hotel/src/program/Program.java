package program;

import clase.ProxyRezervare;
import clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        Rezervare rezervare =new Rezervare(2,111);
        rezervare.anulareRezervare();

        ProxyRezervare proxyRezervare=new ProxyRezervare(rezervare);
        proxyRezervare.anulareRezervare();
    }
}
