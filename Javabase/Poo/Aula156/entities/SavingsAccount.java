package Javabase.Poo.Aula156.entities;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(){
        super();
     }
    public SavingsAccount(int number, String holder, double balace, double interestRate){
        super(number,holder,balace);
        this.interestRate = interestRate;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void updateBalance(){
        balace += balace * interestRate;
    }

    @Override
    public void withdraw(double amount){
        balace-=amount;
    }
    
    
    
}
