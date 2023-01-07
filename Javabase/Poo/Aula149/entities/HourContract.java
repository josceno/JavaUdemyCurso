package Javabase.Poo.Aula149.entities;

import java.time.LocalDate;
import java.util.Date;

public class HourContract {
    private LocalDate date;
    private double valuePerHour; 
    private int hours;
    
    public HourContract(LocalDate date, double valuePerHour, int hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }
    public HourContract(int hours, double valuePerHour){
        this.hours = hours;
        this.valuePerHour = valuePerHour;
     
    }
    
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public double getValuePerHour() {
        return valuePerHour;
    }
    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }
    public int getInteger() {
        return hours;
    }
    public void setInteger(int hours) {
        this.hours = hours;
    }

    public double totalValue(){
        return valuePerHour * hours;
    }

    
}
