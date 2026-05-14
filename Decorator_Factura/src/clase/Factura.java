package clase;

public class Factura implements IFactura{
    private int codFactura;
    private double sumaFactura;

    public Factura(int codFactura, double sumaFactura) {
        this.codFactura = codFactura;
        this.sumaFactura = sumaFactura;
    }

    @Override
    public void printeazafactura() {
        System.out.println("factura " +codFactura+" are suma de" +sumaFactura);
    }

    public int getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(int codFactura) {
        this.codFactura = codFactura;
    }

    public double getSumaFactura() {
        return sumaFactura;
    }

    public void setSumaFactura(double sumaFactura) {
        this.sumaFactura = sumaFactura;
    }
}
