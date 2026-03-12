package ro.ase.cts.program;

import ro.ase.cts.factory.FabricaPersonal;
import ro.ase.cts.factory.TipPersonal;
import ro.ase.cts.personal.Angajat;

public class Program {
    public static void main(String[] args) {
        FabricaPersonal fabrica= FabricaPersonal.getInstance();
        Angajat brancardier=fabrica.getAngajat(TipPersonal.Brancardier, "Vasile");
        Angajat asistent=fabrica.getAngajat(TipPersonal.Asistent, "Popa");
        Angajat medic=fabrica.getAngajat(TipPersonal.Medic, "Ioan");


        System.out.println(brancardier.toString());
        System.out.println(asistent.toString());
        System.out.println(medic.toString());
        System.out.println(asistent.toString());
    }
}
