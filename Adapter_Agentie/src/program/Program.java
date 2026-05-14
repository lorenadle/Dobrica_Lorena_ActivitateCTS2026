package program;

import clase.PachetCazare;
import clase.PachetMasinaInchiriata;
import clase.PachetTuristic;
import inchirieremasini.Masina;
import inchirieremasini.MasinaInchiriata;

public class Program {
    public static void printeazaRezervare(PachetTuristic pachetTuristic){
        System.out.println("client:");
        pachetTuristic.descriere();
        System.out.println("operator:");
        pachetTuristic.rezervarePachet();
    }

    public static void main(String[] args) {
        PachetTuristic pachetCazare=new PachetCazare();
        printeazaRezervare(pachetCazare);

        System.out.println("se doreste utilizarea masini inchiriate ");
        System.out.println();
        Masina masina=new Masina("Mazda", 1600.0);
        MasinaInchiriata masinaInchiriata=new MasinaInchiriata(masina);
        System.out.println();
        System.out.println("nu se fol metoda de printare");
        System.out.println("client:");
        System.out.println(masinaInchiriata.toString());
        System.out.println("operator: ");
        masinaInchiriata.inchiriazaMasina();

        System.out.println();
        System.out.println("adapter ");
        Masina masina2=new Masina("Opel", 1400.0);
        System.out.println();
        System.out.println("pachet creat cu masina dorita");
        PachetMasinaInchiriata pachetMasinaInchiriata=new PachetMasinaInchiriata(masina2);
        System.out.println();
        printeazaRezervare(pachetMasinaInchiriata);
    }
}
