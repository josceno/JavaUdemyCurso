package Javabase.Poo.Aula225.models.entites;

import java.time.LocalDateTime;



public class CarRental {
    private LocalDateTime start;
    private LocalDateTime finish;
    private Vehicle vehicle;
    private Invoice invoice;
    
    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle){
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
        invoice = new Invoice();

    }
    
    public LocalDateTime getStart() {
        return start;
    }
    public void setStart(LocalDateTime start) {
        this.start = start;
    }
    public LocalDateTime getFinish() {
        return finish;
    }
    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Invoice getInvoice() {
        return invoice;
    }
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void BasicPaymente(double priceperHour, double pricePerDay){
        
        int[] duration= new int[5];
        duration[0] =start.getYear()-finish.getYear();
        duration[1] =start.getMonthValue()-finish.getMonthValue();
        duration[2]= start.getDayOfMonth()-finish.getDayOfMonth();
        duration[3]= start.getHour()-finish.getHour();
        duration[4]= start.getMinute()-finish.getMinute();

        int  value; 
        if(Math.abs(duration[4])>0){ 
           value = Math.abs(duration[3]);
           value+=1;
           invoice.setBasicPayment(value * priceperHour);
         }
         
        if(Math.abs(duration[4])>=12){
            value = duration[2];
            invoice.setBasicPayment(value*pricePerDay);
        }
    }

    public void calculateTax(){
        
        if(invoice.getBasicPayment()<100){
            invoice.setTax(invoice.getBasicPayment()*0.2);
        }
        else{
            invoice.setTax(invoice.getBasicPayment()*0.15);
        }
    }
    
    
    

}
