package Javabase.Poo.Aula173.entities;

import java.util.Date;

public class Reservation {
    
    private int roomNumber;
    private Date checkin;
    private Date checkout;

    public Reservation(){}
    
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
        long diff = checkin.getTime()-checkout.getTime();
        return diff;
    }
    public void updateCheckin(Date checkin, Date checkout){
        this.checkin = checkin;
        this.checkout = checkout;

    }

    @Override
    public String toString() {
        return "Reservation [roomNumber=" + roomNumber + ", checkin=" + checkin + ", checkout=" + checkout + "]";
    }
    
}