public class AdapterSoftBar implements IPrintareFactura{
    private SoftBarNou softBarNou;

    public AdapterSoftBar(SoftBarNou softBarNou) {
        this.softBarNou = softBarNou;
    }

    @Override
    public void printeazaFactura() {
        softBarNou.printeazaBonBar();
    }
}
