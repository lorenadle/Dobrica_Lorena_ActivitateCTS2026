package clase;

public class Facade {
    public void rezervaPachetCazareTransport(String orasPlecare, String destinatie){
        CompanieAeriana companieAeriana=new CompanieAeriana("CTRS airlines");
        Zbor zborDus=companieAeriana.rezervaBiletAvion(orasPlecare, destinatie);
        Zbor zborIntors=companieAeriana.rezervaBiletAvion(destinatie, orasPlecare);

        Hotel hotel=new Hotel("CTS Hotel");
        System.out.println(zborDus.toString());
        System.out.println(zborIntors.toString());
        hotel.rezervaCamera(destinatie);
    }
}
