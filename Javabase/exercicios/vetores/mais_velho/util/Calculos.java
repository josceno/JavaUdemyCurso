package Javabase.exercicios.vetores.mais_velho.util;

import Javabase.exercicios.vetores.mais_velho.modelos.Pessoa;

public class Calculos {
    public static void pessoaMaisvelha(Pessoa[] vector){
        int maior = 0;
        String maiorNome = " ";
        for(Pessoa pessoa : vector){
            if(pessoa.getIdade() > maior){
                maior = pessoa.getIdade();
                maiorNome = pessoa.getNome();
            }
            
        }
        System.out.println("Pessoa mais velha: "+maiorNome);
    }
}
