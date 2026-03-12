package ro.ase.cts.program;

import ro.ase.cts.aplicatii.eagerinitialization.ServiceEager;
import ro.ase.cts.aplicatii.lazyinitialization.ServiceLazyInitialization;
import ro.ase.cts.aplicatii.staticblock.ServiceStaticBlock;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        ServiceEager s1= ServiceEager.getInstanta("AutoSRV", 50, 800);

        System.out.println(s1.getNumeService());

        ServiceStaticBlock s2=ServiceStaticBlock.getInstanta("AUT", 200, 2500);
        System.out.println(s2.getNumeService());

        ServiceLazyInitialization s3=ServiceLazyInitialization.getInstanta("AUTo", 100, 50);
        System.out.println(s3.getNumarAngajati());
    }
}
