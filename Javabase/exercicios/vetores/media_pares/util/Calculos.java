package Javabase.exercicios.vetores.media_pares.util;

public class Calculos {
    public static double media(int[] vector){
        double soma =0;
        double media;
        int dividendo =0;
        for(int i = 0; i<vector.length; i++){
            if(vector[i]%2 == 0){
                soma+=(double)vector[i];
                dividendo++;
            }
        }
        if(soma==0){
            media = 0.0;
        }
        else{
            media = soma/dividendo;
        }
       
        return media;
    }
}
