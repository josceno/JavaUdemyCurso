package Javabase.exercicios.importedProducts.models;

public class ImportedProducts extends Product{
    private double customfee;
    
    public ImportedProducts(){
        super();
    }
    public ImportedProducts(String name, double price, double customfee){
        super(name,price);
        this.customfee = customfee;
    }
    
    public double getCustomfee() {
        return customfee;
    }
    public void setCustomfee(double customfee) {
        this.customfee = customfee;
    }
    @Override
    public String priceTag() {
        return super.priceTag() + " (Custom fee "+customfee+")";
    }
    
}
