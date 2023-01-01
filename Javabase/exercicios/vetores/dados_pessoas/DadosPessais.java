package Javabase.exercicios.vetores.dados_pessoas;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessais {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = input.nextInt();
        double[] homensAlturas = new double[n];
        double[] mulheresAlturas = new double[n];

        for (int i = 0; i<n;i++){
            System.out.print("Altura da "+(i+1)+"ª pessoa: ");
            double altura = input.nextDouble();
            System.out.print("Genero da "+ (i+1)+"ª pessoa: ");
            String genero = input.next();
            if(genero.equals("M")|| genero.equals("m")){
                homensAlturas[i] = altura;
            }
            if(genero.equals("F")|| genero.equals("f")){
                mulheresAlturas[i] = altura;
            }
        }
        mostraMaiorMenorAltura(homensAlturas, mulheresAlturas);
        mostrarMediaAltura(homensAlturas, mulheresAlturas);
    }
    public static void mostraMaiorMenorAltura(double[] homensAlturas, double[] mulheresAlturas){
        double maior = 0;
        
        for (int i = 0; i < mulheresAlturas.length; i++) {
            if (mulheresAlturas[i]> maior){
                maior = mulheresAlturas[i];
            }
            if(homensAlturas[i]>maior){
                maior =homensAlturas[i];
            }
            
        }
        double menor =maior;
        for (int i = 0; i < mulheresAlturas.length; i++) {
            if(mulheresAlturas[i]!=0.0){
                if(mulheresAlturas[i]<menor){
                    menor = mulheresAlturas[i];
                }
            }
            if(homensAlturas[i]!=0.0){
                if(homensAlturas[i]<menor){
                    menor=homensAlturas[i];
                }
            }
          
           
        }
           
        System.out.printf("Maior altura %.2f\n",maior);
        System.out.printf("Menor altura %.2f\n",menor);
    }
    public static void mostrarMediaAltura(double[] homensAlturas, double[] mulheresAlturas){
        double somaM =0;
        double somaF =0;
        int h =0,f=0;
      
        for (double pessoa : homensAlturas){
            if(pessoa!=0.0){
                somaM += pessoa;
                h++;
            }
            
        }
        for (double pessoa : mulheresAlturas){
            if(pessoa!=0.0){
                somaF += pessoa;
                f++;
            }
        }
        System.out.println("Media das alturas das mulheres = " + String.format("%.2f",somaF/f));
        System.out.println("Numero de homens = " + h);

    }
}
