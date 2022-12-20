package Javabase;

import java.util.Scanner;

class Program{
    public void forUntil(){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int soma = 0;
        for (int i =0; i<N; i++){
            int n = input.nextInt();
            soma += n;
        }
        System.out.println(soma);
    }
    public static void main(String[] args){
        System.out.println("hello world");
        Program repeticao = new Program();
        repeticao.forUntil();
    }
}