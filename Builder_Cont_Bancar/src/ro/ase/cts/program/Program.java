package ro.ase.cts.program;

import ro.ase.cts.contbancar.ContBancar;
import ro.ase.cts.contbancar.ContBancarBuilder;

public class Program {
    public static void main(String[] args) {
        ContBancar cont = new ContBancar();
        cont.setTitular("Ionescu Gheorghe");
        cont.setSuma(3000);
        cont.setValuta("RON");
        cont.setContSalariu(true);
        cont.setInternetBanking(true);
        cont.setCardAtasat(true);

        System.out.println(cont.toString());


        ContBancar cont2 = new ContBancarBuilder().setDetinator("Ion Vasole").setSuma(2500).setCardAtasat(true)
                .setContSalariu(true).build();
        System.out.println(cont2.toString());

    }
}

