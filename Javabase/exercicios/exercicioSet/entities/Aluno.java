package Javabase.exercicios.exercicioSet.entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int codigo;
    private List<Curso> cursos; 

    public Aluno(){
        cursos = new ArrayList<>();
    }
    public Aluno(int codigo){
        this.codigo = codigo;
        cursos = new ArrayList<>();
    }
    public Aluno(String nome, int codigo){
        this.codigo = codigo;
        this.nome = nome;
        cursos = new ArrayList<>();
    }
    public Aluno(String nome, int codigo, List<Curso> cursos){
        this.codigo = codigo;
        this.nome = nome;
        cursos = new ArrayList<>();
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
    public List<Curso> getCursos() {
        return cursos;
    }
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void adcionarCurso(Curso curso){
        cursos.add(curso);
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }
    @Override
    public String toString(){
        return "matricula: "+ codigo+"\n"+"Nome: "+nome;
    }

    


}
