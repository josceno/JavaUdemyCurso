package Javabase.Poo.Aula88.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vectors {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        System.out.print("insira o numero de pessoas que terão sua média calculada: ");
        int numPeople = input.nextInt();
        double[] vector = new double[3];
        double sum = 0;

        System.out.printf("insira %d alturas\n", numPeople);
        for ( int i = 0; i<vector.length;i++){
            vector[i] = input.nextDouble();
        }
        for (double j : vector) {
            sum += j;
        }
        System.out.printf("a média de alturas é : %.2f", sum/numPeople);
        input.close();
    }
}
