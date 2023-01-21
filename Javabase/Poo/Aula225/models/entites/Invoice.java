package Javabase.Poo.Aula225.models.entites;

public class Invoice {
    private double BasicPayment;
    private Double tax;
    

    public Invoice(){};

    public Invoice(double BasicPayment, double tax) {
        this.BasicPayment = BasicPayment;
        this.tax = tax;
    }
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
        return Math.abs(getTax()+getBasicPayment());
    }
   

    

}
