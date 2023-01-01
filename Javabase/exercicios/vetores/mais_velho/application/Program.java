package Javabase.exercicios.vetores.mais_velho.application;

import java.util.Scanner;

import Javabase.exercicios.vetores.mais_velho.modelos.Pessoa;
import Javabase.exercicios.vetores.mais_velho.util.Calculos;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas pessoas vai cadastrar? ");
        int n = input.nextInt();
        Pessoa[] vetor = new Pessoa[n];

        for(int i = 0; i<vetor.length;i++){
            System.out.println("Dados da "+ (i+1)+"ª pessoa");
            System.out.print("Nome: ");
            String nome = input.next();
            System.out.print("Idade: ");
            int idade = input.nextInt();

            vetor[i] = new Pessoa(nome, idade);
        }
        Calculos.pessoaMaisvelha(vetor);
        input.close();
    } 
}
