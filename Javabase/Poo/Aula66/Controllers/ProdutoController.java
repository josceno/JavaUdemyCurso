package Javabase.Poo.Aula66.Controllers;

import java.util.Scanner;

import Javabase.Poo.Aula66.Models.Produto;

public class ProdutoController {
    
    public static void gerenciadorDeestoque(Produto produto){
        Scanner input = new Scanner(System.in);
        int quantidade = 0;
        
        while(true){
            System.out.println("insira 1 para entradas 2 para saidas");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.printf("Insert the quantity to be added");
                
                    quantidade = input.nextInt();
                    produto.entradaEstoque(quantidade); 
                    break;
                case 2:
                    System.out.println("Insert the quantity to be removed");
    
                    quantidade = input.nextInt();
                    produto.saidaEstoque(quantidade);
                    break;

            }
            if(choice == 0){
                break;
            }   

        }
        

    }
}
