package Javabase.exercicios.vetores.soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar?  ");
        Integer n = input.nextInt();

        double[] vector = new double[n];  
        double soma = 0;

        for(int i =0;i<vector.length;i++ ){
            System.out.print("Digite um numero: ");            
            vector[i] =  input.nextDouble();
            soma+=vector[i];
        }
        System.out.print("VECTOR");
        for (double i: vector ) {
            System.out.printf(" %.2f ",i);
        }
        System.out.println("\nSOMA = " + String.format("%.2f", soma));
        System.out.println("MEDIA = "+ String.format("%.2f", soma/vector.length));


    }
}
