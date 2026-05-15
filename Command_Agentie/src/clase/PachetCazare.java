package clase;

public class PachetCazare implements PachetTuristic{
private int cod;

    public PachetCazare(int cod) {
        this.cod = cod;
    }

    @Override
    public void vanzare() {
        System.out.println(cod+" acest pachet a fost vandut");
    }

    @Override
    public void rezerva() {
        System.out.println(cod+ "acest pachet a fost rezervat");
    }
}
