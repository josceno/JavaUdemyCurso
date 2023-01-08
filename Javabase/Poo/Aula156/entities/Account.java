package Javabase.Poo.Aula156.entities;

public class Account {
    protected int number;
    protected String holder;
    protected double balace;
   
    public Account(){}
    public Account(int number, String holder, double balace) {
        this.number = number;
        this.holder = holder;
        this.balace = balace;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public double getBalace() {
        return balace;
    }
    public void withdraw(double discount) {
        this.balace-= discount+5.0;
    }
    public void deposit(double added){
        this.balace+=added;
    }
    
}
