package Javabase.exercicios.vetores.media_pares.application;

import java.util.Locale;
import java.util.Scanner;

import Javabase.exercicios.vetores.media_pares.util.Calculos;

public class MediaPares {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o o vetor? ");
        int n = input.nextInt();
        int[] vetor = new int[n];
        for(int i = 0; i<vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = input.nextInt();
        }
        if(Calculos.media(vetor)==0.0){
            System.out.println("NENHUM PAR ENCONTRADO");
        }
        else{
            System.out.println("MEDIA DOS PARES = "+String.format("%.1f",Calculos.media(vetor)));
        }

        input.close();
    }
}
