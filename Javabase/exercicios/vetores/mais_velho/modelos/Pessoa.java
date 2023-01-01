package Javabase.exercicios.vetores.mais_velho.modelos;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int  idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
}
