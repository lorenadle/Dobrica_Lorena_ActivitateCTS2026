package clase;

public class Hotel {
    private String numeHotel;

    public Hotel(String numeHotel) {
        this.numeHotel = numeHotel;
    }
    public void rezervaCamera(String oras){
        System.out.println("hotel: "+this.numeHotel+" oras" +oras +" se rezerva camera");
    }

}
