package Javabase.exercicios.vetores.negativos;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("quantos numeros vai digitar? ");
        int n = input.nextInt();
        int[] numerosNegativos = new int[n];
        int numeros;
        boolean negativos= false;
        
        for(int i = 0; i<numerosNegativos.length;i++){
            System.out.print("Digite o numero: ");
            numeros = input.nextInt();
            if(numeros<0){
                numerosNegativos[i] = numeros;
                negativos = true;
            }
        }
        
        
        if(!negativos){
            System.out.println("NENHUM NUMERO NEGATIVO ENCONTRADO  ");
        }else{
            System.out.println("NUMEROS NEGATIVOS: ");
            for (int i : numerosNegativos) {
            
                if(i<0){
                    
                    System.out.println(i);
                    
                }
                
            }
        }

    }
}
