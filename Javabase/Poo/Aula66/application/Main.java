package Javabase.Poo.Aula66.application;

import Javabase.Poo.Aula66.Models.Produto;

public class Main {
    public static void main(String[] args){
        Produto produto = new Produto("produto",2.00,3);
        produto.exibir();
        produto.entradaEstoque(2);
        produto.saidaEstoque(4);
        produto.saidaEstoque(8);
        produto.ValorEstoque();
        System.out.println(produto);
    }
}
