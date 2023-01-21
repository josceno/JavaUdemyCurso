package Javabase.exercicios.ExercicioInterface.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Javabase.exercicios.ExercicioInterface.models.services.OnlinePaymentService;

public class Contracts {
    private int contractNumber;
    private LocalDate contractDate;
    private double contractTotalvalue;

    private List<Installments> installments = new ArrayList<>();

    private OnlinePaymentService onlinePaymentService;
    
    
    public Contracts(){}

    public Contracts(int contractNumber, LocalDate contractDate, double contractTotalvalue, OnlinePaymentService onlinePaymentService) {
        this.contractNumber = contractNumber;
        this.contractDate = contractDate;
        this.contractTotalvalue = contractTotalvalue;
        this.onlinePaymentService = onlinePaymentService;
    }

    
    public List<Installments> getInstallments() {
        return installments;
    }

    public int getContractNumber() {
        return contractNumber;
    }


    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }


    public LocalDate getContractDate() {
        return contractDate;
    }


    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }


    public double getContractTotalvalue() {
        return contractTotalvalue;
    }


    public void setContractTotalvalue(double contractTotalvalue) {
        this.contractTotalvalue = contractTotalvalue;
    }
    public void processPaymentes(int months){
        Double amount = contractTotalvalue/months;
        int date = contractDate.getMonthValue();
        int datey = contractDate.getYear();
        LocalDate dueDate;
        for (int i = 1; i <= months; i++) {
            System.out.println();  
            
            if(date+1 <12){
                date++;
                dueDate = LocalDate.of(datey,date,contractDate.getDayOfMonth());
                installments.add(new Installments(onlinePaymentService.paymentFee(onlinePaymentService.interest(amount, i)),dueDate));
            }else{
                datey++;
                date = 1;
                dueDate = LocalDate.of(datey,date,contractDate.getDayOfMonth());
                installments.add(new Installments(onlinePaymentService.paymentFee(onlinePaymentService.interest(amount, i)),dueDate));

            }
              

        }
        
    }


    


    
}
