package Javabase.Poo.Aula156.util;

import Javabase.Poo.Aula156.entities.Account;
import Javabase.Poo.Aula156.entities.BusinessAccount;
import Javabase.Poo.Aula156.entities.SavingsAccount;

public class ProgramTest {
    public static void upCastingiDownCasting() {
       
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
    public static void testingOverrid(){
        Account acc1 = new Account(1001, "João", 1000.0);
        acc1.withdraw(200);
        System.out.println(acc1.getBalace());
 
        Account acc2 = new SavingsAccount(1002,"Maria",1000.0,0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalace());

        Account acc3 = new BusinessAccount(1003,"jose",1000.0,500.0);
        acc3.withdraw(200);
        System.out.println(acc3.getBalace());
 
    }
    public static void polimorfismoExemplo(){
        Account x = new Account(1020,"Alex",1000.0);
        Account y = new SavingsAccount(1023,"Maria",1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);
       
        System.out.println(x.getBalace());
        System.out.println(y.getBalace());
    }
}
