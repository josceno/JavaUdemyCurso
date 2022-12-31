package Javabase.exercicios.vetores.maior_posicao.util;

public class Finders {
 
    public static double maiorValor(double[] valor){
        double maior = 0;
        for(int i = 0; i<valor.length; i++){
            if(valor[i]>maior){
                maior=valor[i];
            }
        }
        return maior;
    }
    public static int findIndex(double[] valor){
        int index =0;
        for (int i = 0; i < valor.length; i++) {
            if(maiorValor(valor)== valor[i]){
                index = i;
            }
        }
        return index;
        
    }
}
