package ro.ase.cts.program;

import ro.ase.cts.aplicatii.eagerinitialization.ServiceEager;
import ro.ase.cts.aplicatii.staticblock.ServiceStaticBlock;

public class Program {
    public static void main(String[] args) {
        ServiceEager s1= ServiceEager.getInstanta("AutoSRV", 50, 800);

        System.out.println(s1.getNumeService());

        ServiceStaticBlock s2=ServiceStaticBlock.getInstanta("AUT", 200, 2500);
        System.out.println(s2.getNumeService());
    }



}
