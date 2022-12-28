package Javabase.Poo.Aula66.application;

import java.util.Scanner;

import Javabase.Poo.Aula66.Controllers.ProdutoController;
import Javabase.Poo.Aula66.Models.Produto;

public class Main {
    public static void main(String[] args){
        Produto produto = new Produto("produto",2.00);
        produto.exibir();
        ProdutoController.gerenciadorDeestoque(produto);
        System.out.println(produto);
    }
}
