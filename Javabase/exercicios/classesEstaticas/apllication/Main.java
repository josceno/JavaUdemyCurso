package Javabase.exercicios.classesEstaticas.apllication;

import java.util.Currency;
import java.util.Scanner;

import Javabase.exercicios.classesEstaticas.util.CurrencyConverter;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("What is the dollar price:");
        double currency = input.nextDouble();
        System.out.print("How many dollars will be bought");
        double bought = input.nextDouble();

     
        System.out.printf("The anount to be paid in reais is: %.2f",CurrencyConverter.convertedValue(currency, bought));
        input.close();

    }
    
}