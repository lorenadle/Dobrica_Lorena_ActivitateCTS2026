package clase;

public class PachetCazare implements PachetTuristic{
    @Override
    public void descriere() {
        System.out.println("Doar cazare");
    }

    @Override
    public void rezervarePachet() {
        System.out.println("a fost rezervata cazare");

    }
}
