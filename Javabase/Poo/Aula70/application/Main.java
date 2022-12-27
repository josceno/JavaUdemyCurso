package Javabase.Poo.Aula70.application;

import java.util.Locale;
import java.util.Scanner;

import Javabase.Poo.Aula70.Util.Calculator;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius");
        
        double radius = input.nextDouble();
        System.out.printf("Circumference: %.2f\n",Calculator.circumference(radius));
        System.out.printf("Volume: %.2f\n",Calculator.volume(radius));
        System.out.printf("PI value: %.2f\n",Calculator.PI);

    }
}
