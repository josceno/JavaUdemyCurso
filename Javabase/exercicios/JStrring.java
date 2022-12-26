/*package Javabase.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class JStrring {


    Scanner input = new Scanner(System.in);
    public void forUntil(){
        int N = input.nextInt();
        int soma = 0;
        for (int i =0; i<N; i++){
            int n = input.nextInt();
            soma += n;
        }
        System.out.println(soma);
    }
    /**

    public void strManipulation(){
        String str =  "abcde FGHIJ 2222 aaaaa dddd";
        int vogal =0;
        int consoante = 0;
        int palavra = 0;
       
        List<char[]> vogais = new ArrayList<char[]>() {'a','b','c'};
        for(int i = 0; i<str.length();i++){
                char ch = str.charAt(i);
                if(vogais.contains('a')){
                    vogal += 1;
                }
                if( ch == 'b'){
                    consoante +=1;
                }
                if( vogal>0 && consoante> 0 && ch == ' '){
                    palavra+=1;
                    vogal = 0;
                    consoante = 0;
                }
        }
        System.out.println(palavra);

    }
    public void dowhile(){
        char repertir;  
        do{
            System.out.print("Digite a temperatura em celcios: ");
            double celcios = input.nextDouble();
            System.out.printf("Equivalente em feriheint é %.2f \n",((celcios*9)/5)+32);    
            System.out.println("repetir? (s/n)");
            repertir = input.next().charAt(0);
            
        }while(repertir == 's');
    }    
    public static void main(String[] args){
        JStrring repeticao = new JStrring();
        repeticao.strManipulation();
    }
}
 */

