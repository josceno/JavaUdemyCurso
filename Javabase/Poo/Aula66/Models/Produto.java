package Javabase.Poo.Aula66.Models;

import java.util.concurrent.ExecutionException;
import java.util.jar.Attributes.Name;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    
    public Produto(){}
    public Produto(String nome, double preço,int quantidadeEstoque){
        this.nome = nome;
        this.preco = preço;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void exibir(){
        System.out.println(nome);
        System.out.printf("preço: R$%.2f\n",preco);
        System.out.println("Quantidade em estoque "+ quantidadeEstoque);
    }
    public void entradaEstoque(int quantidade){
        quantidadeEstoque+=quantidade;
        System.out.println("Quatidade " + quantidade +" inseridada com sucesso\nNova quantidade é:" + quantidadeEstoque);    
        exibir();
    }
    public void saidaEstoque(int quantidade){
       try{
        if (quantidade> quantidadeEstoque){
            System.out.println("quantidade insuficiente");
        }
        else{
            quantidadeEstoque-=quantidade;
            exibir();
        }
       }catch(Exception exception){
            System.out.println("valor invalido");
        }  
    }
    public double ValorEstoque(){
         return quantidadeEstoque*preco;
    }
    public String toString(){
        return nome
        + ", R$ "
        + String.format("%.2f", preco)
        +", quantidade: "
        + quantidadeEstoque
        + " Valor tora R$:"
        + String.format("%.2f",ValorEstoque());
    }
}
