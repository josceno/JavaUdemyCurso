package Javabase.exercicios.ExercicioInterface.application;

import java.util.Locale;
import java.util.Scanner;

import Javabase.exercicios.ExercicioInterface.models.Contracts;
import Javabase.exercicios.ExercicioInterface.models.Installments;
import Javabase.exercicios.ExercicioInterface.models.services.Paypal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Enter contract's datas: ");
        System.out.print("Numero: ");
        int contractNumber= input.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate contractDate = LocalDate.parse(input.next(),fmt);
        System.out.print("Contract Value: ");
        Double contractPaymentSrvice = input.nextDouble();
        System.out.print("insert installments: ");
        Integer months = input.nextInt();

        Contracts contracts = new Contracts(contractNumber, contractDate, contractPaymentSrvice, new Paypal());
    
        contracts.processPaymentes(months);
        contracts.getInstallments();
        for(Installments installmentes: contracts.getInstallments()){
            System.out.println(installmentes);
        }
        

        input.close();


    }

    

   
    

}
