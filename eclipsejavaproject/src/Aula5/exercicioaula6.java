package Aula5;

import java.util.Scanner;

public class exercicioaula6 {
    public void Telefoniatempo(){
        Scanner input = new Scanner(System.in);

        double minutos = 103.00; //input.nextInt();
        
        if (minutos <= 100){
            System.out.printf("%.2f minutos custaram R$50,00", minutos);
        }
        else{
            System.out.printf("%.2f minutos cutaram: R$ %.2f%n", minutos,(2*(minutos-100))+50);
        }
    }
    public static void main(String[] args){
        exercicioaula6 exerc = new exercicioaula6();
        exerc.Telefoniatempo();
    }
}
