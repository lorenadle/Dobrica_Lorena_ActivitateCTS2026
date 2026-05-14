package clase;

public class Salon {
    private int paturiLibere;

    public Salon(int paturiLibere) {
        this.paturiLibere = paturiLibere;
    }
    public boolean existaPatliber(){
        return paturiLibere>0;
    }
}

