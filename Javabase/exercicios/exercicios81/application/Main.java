package Javabase.exercicios.exercicios81.application;

import java.util.Locale;
import java.util.Scanner;

import Javabase.exercicios.exercicios81.models.Conta;
import Javabase.exercicios.exercicios81.util.Controlador;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("insira o nome:");
        String nomeTitula = "rogerio";//input.nextLine();
        System.out.print("Numero da conta:");
        int numeroConta = 1;//input.nextInt();
        System.out.print("valor primeiro deposito:(opicional))");
        double valorDeposito = 1.9;//input.nextDouble();

        Conta rogerio = new Conta(numeroConta, nomeTitula,valorDeposito);

        Controlador.gerenciadorBanco(rogerio);
        System.out.println(rogerio);
    }
}
