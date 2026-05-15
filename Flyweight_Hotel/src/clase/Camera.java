package clase;

public class Camera implements ICamera{
    private int codAranjare;
    private int numarProsoape;
    private int numarCearceafuri;
    private int numarPerne;
    private int numarUmerase;


    @Override
    public void tiparire(Rezervare rezervare) {
        System.out.println(this.toString()+ " " + rezervare.toString());
    }

    public Camera(int codAranjare, int numarProsoape, int numarCearceafuri, int numarPerne, int numarUmerase) {
        super();
        this.codAranjare = codAranjare;
        this.numarProsoape = numarProsoape;
        this.numarCearceafuri = numarCearceafuri;
        this.numarPerne = numarPerne;
        this.numarUmerase = numarUmerase;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "codAranjare=" + codAranjare +
                ", numarProsoape=" + numarProsoape +
                ", numarCearceafuri=" + numarCearceafuri +
                ", numarPerne=" + numarPerne +
                ", numarUmerase=" + numarUmerase +
                '}';
    }
}
