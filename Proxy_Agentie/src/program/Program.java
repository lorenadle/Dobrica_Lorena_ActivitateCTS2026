package program;

import clase.PachetTransport;
import clase.Persoana;
import clase.ProxyPachet;

public class Program {
    public static void main(String[] args) {
        Persoana persoana=new Persoana("Popescu", 35);
        PachetTransport pachetTransport=new PachetTransport(persoana);
        pachetTransport.rezervaPachet();
        ProxyPachet proxyPachet=new ProxyPachet(persoana);
        proxyPachet.rezervaPachet();
    }
}
