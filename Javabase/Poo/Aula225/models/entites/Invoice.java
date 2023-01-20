package Javabase.Poo.Aula225.models.entites;

public class Invoice {
    private double BasicPayment;
    private Double tax;
    private Double totalpayment;
    
    
    public double getBasicPayment() {
        return BasicPayment;
    }
    public void setBasicPayment(double basicPayment) {
        BasicPayment = basicPayment;
    }
    public Double getTax() {
        return tax;
    }
    public void setTax(Double tax) {
        this.tax = tax;
    }
    public Double getTotalpayment() {
        return getTax()+getBasicPayment();
    }
   

    

}
