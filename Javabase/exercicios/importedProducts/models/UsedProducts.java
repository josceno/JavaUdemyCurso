package Javabase.exercicios.importedProducts.models;

import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class UsedProducts extends Product {
    private LocalDate date;
    DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public UsedProducts(){super();}
    
    public UsedProducts(String name, double price, LocalDate date){
        super(name,price);
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String priceTag(){
        return name + " (Used) $ "+ String.format("%.2f", price)+ "(Manfacture date: "+date.format(dFormatter)+")";
    }

    @Override
    public String toString() {
        return priceTag();
    }
    
}
