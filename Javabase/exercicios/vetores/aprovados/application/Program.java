package Javabase.exercicios.vetores.aprovados.application;

import java.util.Locale;
import java.util.Scanner;

import Javabase.exercicios.vetores.aprovados.models.Aluno;
import Javabase.exercicios.vetores.aprovados.util.Aprovados;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        System.out.print("Quantos alunos serao digitados? ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Aluno[] vetor = new Aluno[n];
        for(int i =0; i<vetor.length;i++){
            System.out.println("Digite nome, primeira nonta e segunda nota do "+(i+1)+"° aluno");
            input.nextLine();
            String nome=input.nextLine();
            double nota1 = input.nextDouble();
            double nota2 = input.nextDouble();
            vetor[i] = new Aluno(nome, nota1, nota2);    
        }
        Aprovados.mostrarAprovados(vetor);
        input.close();

    }
}
