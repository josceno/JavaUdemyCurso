package Javabase.exercicios.fixaçãoPoo.Q3.applicarion;

import Javabase.exercicios.fixaçãoPoo.Q3.models.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Rogerio");
        aluno.Calcularnota();
        System.out.println(aluno);
    }
}
