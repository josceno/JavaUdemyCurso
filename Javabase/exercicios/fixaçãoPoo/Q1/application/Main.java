package Javabase.exercicios.fixaçãoPoo.Q1.application;

import java.util.Scanner;

import Javabase.exercicios.fixaçãoPoo.Q1.modelos.Retangle;

public class Main {
    public static void exibir(Retangle obj){
        System.out.printf("AREA: %.2f\n",obj.area());
        System.out.printf("PERIMETER: %.2f\n",obj.perimeter());
        System.out.printf("DIAGNAL: %.2f\n",obj.diagonal());        
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("insira a largura: ");
        double largura = input.nextDouble();
 
        System.out.print("insira a altura: ");
        double altura = input.nextDouble();

        Retangle retangle = new Retangle(largura, altura);

        exibir(retangle);
    }
}
