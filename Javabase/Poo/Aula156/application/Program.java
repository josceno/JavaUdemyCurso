package Javabase.Poo.Aula156.application;

import java.sql.Savepoint;

import Javabase.Poo.Aula156.entities.Account;
import Javabase.Poo.Aula156.entities.BusinessAccount;
import Javabase.Poo.Aula156.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account account = new Account(1,"joão",1000.00); 
        BusinessAccount bAccount = new BusinessAccount(2,"joão",1000.00,500.00);

        //UPCASTING

        Account acc = bAccount;
        System.out.println(acc.getHolder());
        Account acc1 = new BusinessAccount(2,"joão kleber",1000.00,520.00);
        Account acc2 = new SavingsAccount(2,"joão victor",1000.00,500.00);

        //DOWNCASTING
        BusinessAccount acc3 = (BusinessAccount)acc1;
        System.out.println(acc3.getLoanLimit());
        if(acc2 instanceof BusinessAccount){
            BusinessAccount acc4 =  (BusinessAccount)acc2;
            acc4.Loan(20);
            System.out.println(acc4.getBalace());
            System.out.println("Loan!");
        }
        if (acc2  instanceof SavingsAccount){
            SavingsAccount acc4 = (SavingsAccount)acc2;
            acc4.updateBalance();
            System.out.println(acc4.getBalace());
            System.out.println("updatde!");
        }

    }
}
