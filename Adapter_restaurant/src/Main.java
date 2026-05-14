public class Main
{
    public static void main(String[] args) {
        SoftBarNou softBarNou=new SoftBarNou();
        IPrintareFactura facturaBar=new AdapterSoftBar(softBarNou);
        facturaBar.printeazaFactura();
    }
}
