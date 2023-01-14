package Javabase.exercicios.tratamentoExceções.application;

import java.util.Locale;
import java.util.Scanner;

import Javabase.exercicios.tratamentoExceções.models.Account;



public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter account data: ");
        System.out.print("Number: ");
        int number = input.nextInt();
        input.nextLine();
        System.out.print("Holder");
        String holder = input.nextLine();
        System.out.print("Initial balance: ");
        double balance = input.nextDouble();
        System.out.print("Withdraw Limit: ");
        double withdrawLimit = input.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.print("Enter the amount for withdraw: ");
        account.withdraw(input.nextDouble());
        System.out.println("new balance: "+ account.getBalance());

        input.close();
    }
}
