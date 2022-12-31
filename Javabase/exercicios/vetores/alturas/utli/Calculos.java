package Javabase.exercicios.vetores.alturas.utli;

import Javabase.exercicios.vetores.alturas.models.Pessoa;

public class Calculos {
    public static double calcuLarMédia(Pessoa[] vector){
        double soma = 0;
        for(Pessoa d : vector){
            soma +=d.getAltura();
        }
        return soma/vector.length;
    } 
    public static void menos16(Pessoa[] vector){
        Pessoa[] sub16 = new Pessoa[vector.length];
        double pctg = 0;
        int index = 0;
        for(Pessoa pessoa: vector){
            if(pessoa.getIdade()<16){
                sub16[index] = pessoa;
                pctg+=1.0;
            }
            index++;
        }
        System.out.println(String.format("pessoas com medos de  16 anos: %.1f",(pctg/vector.length)*100)+"%");
        for (int i = 0; i < sub16.length; i++) {
            if(sub16[i] !=null){
                System.out.println(sub16[i].getNome());
            }    
        }
    }
}
