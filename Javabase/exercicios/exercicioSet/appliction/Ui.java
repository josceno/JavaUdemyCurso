package Javabase.exercicios.exercicioSet.appliction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import Javabase.exercicios.exercicioSet.entities.Aluno;
import Javabase.exercicios.exercicioSet.entities.Curso;

public class Ui {
    public static List<Curso> gerarMatricula(){
        Scanner input = new Scanner(System.in);
        Curso A = new Curso("A", 1);
        Curso B = new Curso("B", 2);
        Curso C = new Curso("C", 3);
        List<Curso> cursos = new ArrayList<>();
        
        cursos.add(A);
        cursos.add(B);
        cursos.add(C);
        
        for (Curso curso : cursos) {
            System.out.print("how many studebnts for cource "+curso.getNome()+"? ");
            int n = input.nextInt();
            for (int j = 0; j < n; j++) {
                Aluno aluno1 = new Aluno(input.nextInt());
                curso.adcionarAluno(aluno1);
            }
        }
        input.close();
        return cursos;
        
    }
    public static int caltularTota(List<Curso> args){
        Set<Aluno> alunotsTotal = new HashSet<>();
        for (Aluno aluno : args.get(0).getalunos()) {
            alunotsTotal.add(aluno);
        }
        for (Aluno aluno : args.get(1).getalunos()) {
            alunotsTotal.add(aluno);
        }
        for (Aluno aluno : args.get(2).getalunos()) {
            alunotsTotal.add(aluno);
        }
        return alunotsTotal.size();
    }
    
}
