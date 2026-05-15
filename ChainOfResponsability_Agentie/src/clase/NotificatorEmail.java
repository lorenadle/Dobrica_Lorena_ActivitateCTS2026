package clase;

public class NotificatorEmail extends Notificator{

    @Override
    public void notifica(Client client, String mesaj) {
        if (client.getAdresaEmail()!=null)
            System.out.println(client.getNume()+" ai un Email cu mesajul: "+mesaj);
        else
            super.getUrmatorulNotificator().notifica(client, mesaj);

    }
}
