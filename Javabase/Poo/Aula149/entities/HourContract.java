package Javabase.Poo.Aula149.entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private double valuePerHour; 
    private int hours;
    
    public HourContract(Date date, double valuePerHour, int hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }
    public HourContract(int hours, double valuePerHour){
        this.hours = hours;
        this.valuePerHour = valuePerHour;
     
    }
    
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
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

    
}
