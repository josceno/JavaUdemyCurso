package Javabase.exercicios;

import java.util.Scanner;

public class Exercicio {
    Scanner input = new Scanner(System.in);
    public void Um(){
        System.out.print("insira um numero para contagem");

        int numero = input.nextInt();

        for(int i=1; i<numero+1; i+=2){
            System.out.println(i);
        }

    }
    
    public void dois(){
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
    
    public void tres(){
        System.out.print("insira o numero de repetições");
        int times = input.nextInt();
        
        for(int i=0; i<times;i++){
            double soma =0;
            double pi =0;
           for (int j=0; j<3;j++){
                switch(j){
                    case 0:
                        pi = 2;
                        break;
                    case 1:
                        pi = 3;
                        break;
                    case 2:
                        pi = 5;
                        break;
                }
                System.out.print("insira um numero\n");
                double valor = input.nextDouble();
                soma = soma + (valor*pi);
           }    
           System.out.printf("%.1f",soma/10);
        }
        

    }
    
    public void quatro(){
       System.out.print("insira numero de repetições: \n");
        int N = input.nextInt();
        double numerador =0;
       
        for(int i=0; i<N;i++){
            
            for (int j =0; j<2;j++){
                System.out.print("insira o "+ (j+1)+"° numero");
                double numero  = input.nextInt();
                
                if(j == 0){
                    numerador = numero;
                }
                if(j == 1 ){
                    if(numero==0){
                        System.out.println("divisao impossivel");
                    }
                    else{
                        System.out.println(numerador/numero);
                    }
                }

            }
            
        }
    }
    public void cinco(){
        System.out.println("insira o numero para calcular o fatorial");
        int fatoriado = input.nextInt();
        int fatorial =fatoriado;
        if (fatoriado == 0){
            fatorial = 1;
        }
        for (int i =fatoriado; i>1; i--){
            fatorial = fatorial * (i-1);
        }
        System.out.println(fatorial);
    }
    public void seis(){
        System.out.print("insira numero");
        int numero = input.nextInt();

        for(int i=1; i<=numero;i++){
            if(numero%i == 0){
                System.out.println(i);
            }
        }

    }
    public void sete(){
        System.out.print("Insira o numero para o cubo");
        int numero = input.nextInt();

        for(int i=1;i<=numero;i++){
            System.out.println(i+" "+(i*i)+" "+(i*i*i)); 
        }
    }
    public static void main(String[] args){
        Exercicio questão = new Exercicio();
        questão.sete();
    }
}
