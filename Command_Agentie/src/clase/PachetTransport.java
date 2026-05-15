package clase;

public class PachetTransport implements PachetTuristic{
    private int cod;

    public PachetTransport(int cod) {
        super();
        this.cod = cod;
    }

    @Override
    public void vanzare() {
        System.out.println(cod+" acest pachet a fost vandut");
    }

    @Override
    public void rezerva() {
        System.out.println(cod +" acest pachet a fost rezervat");
    }
}
