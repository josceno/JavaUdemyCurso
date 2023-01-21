package Javabase.exercicios.ExercicioInterface.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Installments {
    private LocalDate dueDate;
    private Double amount;
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
    
    public Installments(){}

    public Installments(Double amount, LocalDate duDate) {
        this.amount = amount;
        this.dueDate = duDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount){
        this.amount = amount;
    }

   
    public String toString(){
        return dueDate.format(fmt)+" - "+ String.format("%.2f",amount);
    }

    

}
