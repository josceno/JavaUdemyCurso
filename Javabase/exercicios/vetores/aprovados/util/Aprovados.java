package Javabase.exercicios.vetores.aprovados.util;

import Javabase.exercicios.vetores.aprovados.models.Aluno;

public class Aprovados {
    public static void mostrarAprovados(Aluno[] vetor){
        Aluno[] aprovados = new Aluno[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            double media = (vetor[i].getNota1()+vetor[i].getNota2())/2;
            if(media>=6.0){
                aprovados[i] = vetor[i]; 
            }
        }
        System.out.println("Alunos Aprovados: ");
        for(Aluno aluno: aprovados){
            if(aluno != null){
                
                System.out.println(aluno.getNome());
            }
        }
    }
}
