package Javabase.exercicios.exercicioSet.appliction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Javabase.exercicios.exercicioSet.entities.Aluno;
import Javabase.exercicios.exercicioSet.entities.Curso;

public class Ui {
    public static void gerarMatricula(){
        
        Curso A = new Curso("A", 1);
        Curso B = new Curso("B", 2);
        Curso C = new Curso("C", 3);
        List<Curso> cursos = new ArrayList<>();
        cursos.add(A);
        cursos.add(B);
        cursos.add(C);


        
        //for(int i = 0; i<3; i++){
            System.out.println("how many studebnts for cource A");
            int n = 2;
            //for (int j = 0; j < n; j++) {
                Aluno aluno1 = new Aluno(21);
                A.adcionarAluno(aluno1);
                Aluno aluno2 = new Aluno(35);
                A.adcionarAluno(aluno2);
                Aluno aluno3 = new Aluno(22);
                A.adcionarAluno(aluno3);
            //}
            //for (int j = 0; j < n; j++) {
                Aluno aluno4 = new Aluno(21);
                B.adcionarAluno(aluno4);
                Aluno aluno5 = new Aluno(50);
                B.adcionarAluno(aluno5);    
            //}
            //for (int j = 0; j < n; j++) {
                Aluno aluno6 = new Aluno(42);
                C.adcionarAluno(aluno6);
                Aluno aluno7 = new Aluno(35);
                C.adcionarAluno(aluno7);
                Aluno aluno8 = new Aluno(13);
                C.adcionarAluno(aluno8);
            //}
           
        //}
        System.out.println(caltularTota(cursos));
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
