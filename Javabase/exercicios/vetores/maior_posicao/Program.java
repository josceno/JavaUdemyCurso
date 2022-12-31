package Javabase.exercicios.vetores.maior_posicao;

import java.util.Locale;
import java.util.Scanner;

import Javabase.exercicios.vetores.maior_posicao.util.Finders;


public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar? ");
        int n = input.nextInt();
        double[] vector = new double[n];
        
        for(int i = 0;i<vector.length;i++){
            System.out.print("Digite um numero: ");
            vector[i] = input.nextDouble();
        }
        System.out.println("MAIOR VALOR = "+ Finders.maiorValor(vector));
        System.out.println("POSIÇÃO DO MAIOR VALOR = "+Finders.findIndex(vector));
        
        input.close();
    }

}
