package Javabase.exercicios.fixaçãoPoo.Q3.models;

import java.util.Scanner;

public class Aluno {
    public String name;
     public double grade;
    
    public Aluno(String name){
        this.name = name;
    }

    public void Calcularnota(){
        double soma = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println(name);
        for(int i=0; i<3;i++){
            if (i==0){
                do{
                    soma = input.nextDouble();
                }while(soma>30);
            }
            else{
                do{
                    soma = input.nextDouble();
                }while(soma>35);
            }
            grade = grade + soma;
            
        }
        input.close();
    }
    public String toString(){
        String reuslt = "PASS";
        if(grade<60){
            reuslt = "FAILD\nMISSING " + String.format("%.2f",(60- grade)) + " POINTS";
        }
        return "FINAL GRADE = "
        + String.format("%.2f", grade)
        + "\n"
        +reuslt;

    }
}
