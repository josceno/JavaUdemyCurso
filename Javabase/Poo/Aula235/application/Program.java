package Javabase.Poo.Aula235.application;

import java.util.Locale;
import java.util.Scanner;

import Javabase.Poo.Aula225.models.services.BrazilTaxService;
import Javabase.Poo.Aula235.services.BrazilInterestService;
import Javabase.Poo.Aula235.services.InterestService;
import Javabase.Poo.Aula235.services.UsaInterestService;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = input.nextDouble();
        System.out.print("Months: ");
        int months = input.nextInt();

        //BrazilInterestService is = new BrazilInterestService(2.0);
        InterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount,months);

        System.out.println("Payment after "+ months+" months:");
        System.out.println(String.format("%.2f", payment));

        input.close();
    }
}
