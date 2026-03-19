package ro.ase.cts.program;

import ro.ase.cts.models.Programare;

public class Program {

    public static void main(String[] args) {

        Programare rezervare = new Programare("JohnDoe", "0723111111", 3);
        Programare rezervareTwo = null;
        try {
            rezervareTwo = rezervare.copiaza();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        rezervareTwo.setNrAnalize(20);

        System.out.println(rezervare.toString());
        System.out.println(rezervareTwo.toString());
    }
}

