package program;

import clase.Agentie;
import clienti.ClientFidel;

public class Program {
    public static void main(String[] args) {
        ClientFidel clientPopescu=new ClientFidel("Popescu");
        ClientFidel clientVasile=new ClientFidel("Vasile");
        ClientFidel clientGeorgescu=new ClientFidel("Georgescu");

        Agentie agentie=new Agentie("CTSAgentie");

        agentie.adaugaObserver(clientVasile);
        agentie.adaugaObserver(clientGeorgescu);
        agentie.notificareOfertaNoua();
        agentie.adaugaObserver(clientPopescu);
        agentie.notificareReducerePret();
    }
}
