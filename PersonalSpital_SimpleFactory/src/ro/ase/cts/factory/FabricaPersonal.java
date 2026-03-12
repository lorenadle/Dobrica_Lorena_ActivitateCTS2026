package ro.ase.cts.factory;

import ro.ase.cts.personal.Angajat;
import ro.ase.cts.personal.Asistent;
import ro.ase.cts.personal.Brancardier;
import ro.ase.cts.personal.Medic;

public class FabricaPersonal {
    private static FabricaPersonal  instanta=null;
    public static synchronized FabricaPersonal getInstance(){
        if(instanta==null){
            instanta=new FabricaPersonal();
        }
        return instanta;
    }
    private FabricaPersonal(){}

public Angajat getAngajat(TipPersonal tip, String nume ){
    Angajat angajat = switch (tip) {
        case Brancardier -> new Brancardier(nume);
        case Asistent -> new Asistent(nume);
        case Medic -> new Medic(nume);
        default -> null;
    };

    return angajat;
}
}
