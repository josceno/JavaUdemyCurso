package Javabase.Poo.Aula156.entities;

public class BusinessAccount extends Account {
    private double loanLimit;
    
    public BusinessAccount(){}
    public BusinessAccount(int number, String holder, double balace,double loanLimit) {
        super(number, holder, balace);
        this.loanLimit = loanLimit;
        
    }
    
    public double getLoanLimit() {
        return loanLimit;
    }
    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }
   
    public void Loan(double amount){
        if(amount<=loanLimit){
            
            balace+=amount-10;
        }else{
            System.out.println("the amount to be loed is higher than the actual loan Limit");
        }
    }
    
}
