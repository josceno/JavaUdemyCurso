package Javabase.exercicios.exercicios81.models;

import java.util.Scanner;

public class Conta {
    private int numeroConta;
    private String nomeTitular;
    private double saldoConta;
    
    public Conta(int numeroConta, String nomeTitular, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        saldoConta = depositoInicial;
    }
    public Conta(int numeroConta, String  nomeTitular){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta(){
        return numeroConta;
    }
   
    public String getNomeTitular(){
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public double getSaldoConta(){
        return saldoConta;
    }
    public void depositar(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("\ninsira o valor do deposito: ");
        double valorDeposito = input.nextDouble();
        saldoConta +=valorDeposito;
        System.out.printf("quantia inserida com sucesso saldo da conta: %.2f",saldoConta);
        
    }

    public void sacar(){
        Scanner input = new Scanner(System.in);

        System.out.print("insira o valor do saque: ");
        double valorDeposito = input.nextDouble();
        saldoConta -=valorDeposito+5.00;
        System.out.printf("quantia sacada com sucesso saldo da conta: %.2f",saldoConta);
              
    }

    public String toString(){
        return "Nome do titular: "+ nomeTitular
        +"\nNumero da conta: "+ numeroConta
        +"\nSaldo atual: "+ String.format("%.2f", saldoConta);
    }

    
    

}
