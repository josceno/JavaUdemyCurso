package Javabase.exercicios.tratamentoExceções.application;

import java.util.Locale;
import java.util.Scanner;

import Javabase.exercicios.tratamentoExceções.models.Account;
import Javabase.exercicios.tratamentoExceções.models.exeptions.WithdrawLimitError;
import Javabase.exercicios.tratamentoExceções.models.exeptions.WithdrawValueException;



public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<4;i++){
            try{
                System.out.println("Enter account data: ");
                System.out.print("Number: ");
                int number = input.nextInt();
                input.nextLine();
                System.out.print("Holder: ");
                String holder = input.nextLine();
                System.out.print("Initial balance: ");
                double balance = input.nextDouble();
                System.out.print("Withdraw Limit: ");
                double withdrawLimit = input.nextDouble();
    
                Account account = new Account(number, holder, balance, withdrawLimit);
                System.out.println();
                System.out.print("Enter the amount for withdraw: ");
                account.withdraw(input.nextDouble());
                System.out.println("new balance: "+ account.getBalance()+"\n");
            }catch(WithdrawValueException e){
                System.out.println("Error in Withdraw value: "+ e.getMessage()+"\n");
            }catch(WithdrawLimitError e){
                System.out.println("Error in Withdraw limit: "+ e.getMessage()+"\n");
            }catch(Exception e){
                System.out.println("Unexpectd error: "+e.getMessage()+"\n");
            }
        }
        
            
        input.close();
    }
}
