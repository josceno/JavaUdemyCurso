package Javabase.Poo.Aula89.application;

import java.util.Scanner;
import java.util.Vector;

import Javabase.Poo.Aula66.Models.Produto;

public class Program {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("insira o numero de produtos");
        int n = input.nextInt();

        Produto[] vector = new Produto[n];
       
        
        String name;
        double preco;
        double sum = 0.0;
        
        for( int i = 0; i<n;i++){
            System.out.println("nome do produto: ");
            name = input.next();
            System.out.println("preco: ");
            preco = input.nextDouble();
            vector[i] = new Produto(name,preco);
        }
        for (Produto j : vector) {
            sum += j.getPreco();
        }
        System.out.println("a média de preços é: "+ String.format("%.2f", sum/n));
        
        input.close();
    }


    
}
