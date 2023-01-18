package Javabase.Poo.Aula225.models;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    
    private String model;
    private LocalDateTime pickup;
    private LocalDateTime returndate;
    private Double priceperHour;
    private Double pricePerDay;
    
    public Car(String model, LocalDateTime pickup, LocalDateTime returndate, double priceperHour, double pricePerDay) {
        this.model = model;
        this.pickup = pickup;
        this.returndate = returndate;
        this.priceperHour = priceperHour;
        this.pricePerDay = pricePerDay;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDateTime getPickup() {
        return pickup;
    }

    public void setPickup(LocalDateTime pickup) {
        this.pickup = pickup;
    }

    public LocalDateTime getReturndate() {
        return returndate;
    }

    public void setReturndate(LocalDateTime returndate) {
        this.returndate = returndate;
    }


    public Double getPriceperHour() {
        return priceperHour;
    }

    public void setPriceperHour(Double priceperHour) {
        this.priceperHour = priceperHour;
    }
    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Double BasicPaymente(){
    
        int[] duration= new int[5];
        duration[0] =pickup.getYear()-returndate.getYear();
        duration[1] =pickup.getMonthValue()-returndate.getMonthValue();
        duration[2]= pickup.getDayOfMonth()-returndate.getDayOfMonth();
        duration[3]= pickup.getHour()-returndate.getHour();
        duration[4]= pickup.getMinute()-returndate.getMinute();


        int  hour = duration[3];
        if(duration[4]>0||duration[4]<0){ 
         if(hour<0){
            hour =(Math.abs(hour))+1;
         }
         else{
             hour+=1;
        }
        }
        return hour * priceperHour;
            
        
       
    }    

    @Override
    public String toString() {
        return "Car model:" + model + ", pickup:" + pickup + ", returndate:" + returndate + ", priceperHour"
        + priceperHour;
    }

    
    

    

    


    

}
