package Javabase.Poo.Aula173.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    
    private int roomNumber;
    private Date checkin;
    private Date checkout;

    public Reservation(){}
    
    public static SimpleDateFormat sp = new  SimpleDateFormat("dd/MM/yyyy");

    public Reservation(int roomNumber, Date checkin, Date checkout){
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public long duration(){
        long diff = checkout.getTime()-checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    public void updateCheckin(Date checkin, Date checkout){
        this.checkin = checkin;
        this.checkout = checkout;

    }

    @Override
    public String toString() {
        return "Reservation: Room: " + roomNumber + ", check in=" + sp.format(checkin) + ", check Out" + sp.format(checkout) + " "+duration()+" Nights";
    }
    
}