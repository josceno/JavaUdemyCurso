package Javabase.exercicios.vetores.alturas.application;

import java.util.Locale;
import java.util.Scanner;
import Javabase.exercicios.vetores.alturas.models.Pessoa;
import Javabase.exercicios.vetores.alturas.utli.Calculos;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas pessoas serão cadastradas?  ");
        int n = input.nextInt();
        Pessoa[] vetor = new Pessoa[n];
       
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("dados da "+(i+1)+"ª pessoa");
            System.out.print("Nome: ");
            String nome = input.next();
            System.out.print("Idade: ");
            int idade = input.nextInt();
            System.out.print("Altura: ");
            double altura = input.nextDouble();
            
            vetor[i] = new Pessoa(nome, idade, altura);  
        }
        System.out.println("Altura média: "+String.format("%.2f",Calculos.calcuLarMédia(vetor)));
        Calculos.menos16(vetor);
        
        input.close();
    }
   
}
