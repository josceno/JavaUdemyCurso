package Javabase.Poo.Aula89.models;

import java.security.PublicKey;

public class Produto {
    
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    } 
    

}    
