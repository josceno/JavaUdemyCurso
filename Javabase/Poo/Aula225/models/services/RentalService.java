package Javabase.Poo.Aula225.models.services;

import java.time.Duration;

import Javabase.Poo.Aula225.models.entites.CarRental;
import Javabase.Poo.Aula225.models.entites.Invoice;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxServiceBr;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxServiceBr) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxServiceBr = taxServiceBr;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

 
    public TaxService getTaxServiceBr() {
        return taxServiceBr;
    }

    public void setTaxServiceBr(TaxService taxServiceBr) {
        this.taxServiceBr = taxServiceBr;
    }

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hour = minutes/60.0;

        double basicPayment;
        if(hour<=12){
            basicPayment = pricePerHour * Math.ceil(hour);
        }else{
            basicPayment = pricePerDay * Math.ceil(hour/24.0);
        }
        double tax =taxServiceBr.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

    

    
}
