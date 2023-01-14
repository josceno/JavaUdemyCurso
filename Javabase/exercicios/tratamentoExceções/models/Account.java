package Javabase.exercicios.tratamentoExceções.models;

import Javabase.exercicios.tratamentoExceções.models.exeptions.WithdrawLimitError;
import Javabase.exercicios.tratamentoExceções.models.exeptions.WithdrawValueException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit; 
    
    public Account(){}
    public Account(int number, String holder, double balance, double withdrawLimit) throws WithdrawLimitError{
        if(withdrawLimit>balance){
            throw new WithdrawLimitError("the seted Withdraw value is higher than the current balance value");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }
    public int getNumber() {
        return number;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public double getBalance() {
        return balance;
    }
    public double getWithdrawLimit() {
        return withdrawLimit;
    }
    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    public void deposit(double amount){
        this.balance+=amount;
    } 
    public void withdraw(double amount) throws WithdrawValueException{
        if (amount>withdrawLimit){
            throw new WithdrawValueException("the amount of the withdraw is high than withdraw Limit");
        }
        this.balance-=amount;
    }

    @Override
    public String toString() {
        return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + ", withdrawLimit="
                + withdrawLimit + "]";
    }
    
    
}
