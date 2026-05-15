package clase;

public class NotificatorManager extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println(" nu sunt date de contact pt clientul: "+client.getNume());
    }
}
