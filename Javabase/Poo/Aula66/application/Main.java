package Javabase.Poo.Aula66.application;

import Javabase.Poo.Aula66.Models.Produto;

public class Main {
    public static void main(String[] args){
        Produto produto = new Produto("produto",2.00);
        Produto protucao = new Produto();
        produto.exibir();
        /*produto.entradaEstoque(4);
        produto.saidaEstoque(4);
        produto.saidaEstoque(8);*/
        produto.ValorEstoque();
        //System.out.println(produto);
    }
}
