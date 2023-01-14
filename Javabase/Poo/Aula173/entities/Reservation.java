
package Javabase.Poo.Aula173.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import Javabase.Poo.Aula173.entities.exceptions.DomainException;

public class Reservation {
    
    private int roomNumber;
    private Date checkin;
    private Date checkout;

    public Reservation(){}
    
    public static SimpleDateFormat sp = new  SimpleDateFormat("dd/MM/yyyy");

    public Reservation(int roomNumber, Date checkin, Date checkout){
        if(!checkout.after(checkin)){
            throw new DomainException( "\nCheck-out date must be after check -in date");
        }
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
    /*public  void updateCheckin(Date checkin, Date checkout){
        this.checkin = checkin;
        this.checkout = checkout;

    }*/
    public void updateCheckin(Date chekin, Date checkout) throws DomainException{
        Date now = new Date(); 
        if(checkout.before(now)|| checkin.before(now)){
            throw new DomainException( "\nRevertion date must be a future date ");
        }
        this.checkin = chekin;
        this.checkout = checkout;
        
    }

    @Override
    public String toString() {
        return "\nReservation: Room: " + roomNumber + ", check in=" + sp.format(checkin) + ", check Out" + sp.format(checkout) + " "+duration()+" Nights";
    }
    
}