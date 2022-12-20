package Javabase.exercicios;

import java.util.Scanner;

public class Exercicio {
    public void Um(){
        Scanner input = new Scanner(System.in);
        System.out.print("insira um numero para contagem");

        int numero = input.nextInt();

        for(int i=1; i<numero+1; i+=2){
            System.out.println(i);
        }

    }
    public void dois(){
        Scanner input = new Scanner(System.in);
        System.out.print("insira um numero de entradas");

        int numero = input.nextInt();
        int in = 0;
        int out =0;
        for(int i = 0; i <numero; i++){
            int n = input.nextInt();
            if(n >= 10 && n <=20){
                in+=1;
            }
            else{
                out+=1;
            }
        }
        System.out.printf("%d in\n%d out",in,out);
    }
    public static void main(String[] args){
        Exercicio questão = new Exercicio();
        questão.dois();
    }
}
