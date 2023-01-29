package Javabase.exercicios.exercicioSet.entities;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int codigo;
    private List<Aluno> alunos; 

    public Curso(){
        alunos = new ArrayList<>();
    }
    public Curso(String nome, int codigo){
        this.codigo = codigo;
        this.nome = nome;
        alunos = new ArrayList<>();
    }
    public Curso(String nome, int codigo, List<Aluno> alunos){
        this.codigo = codigo;
        this.nome = nome;
        alunos = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public List<Aluno> getalunos() {
        return alunos;
    }
    public void setalunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    public void adcionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    @Override
    public String toString(){
        return "Codigo: "+ codigo+"\n"+"Nome do curso: "+nome;
    }
}
