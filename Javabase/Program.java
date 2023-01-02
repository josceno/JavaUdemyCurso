package Javabase;

import java.util.Scanner;

class Program{
    Scanner input = new Scanner(System.in);
    
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
    public void compare(){
        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
    }
    public void StrMannging(){
        String original = "abcde FGHIJ ABC abc  DEFG  a";

        String sLower = original.toLowerCase();
        String sUpper = original.toUpperCase();
        String strim  = original.trim();
        String sSubstring = original.substring(27);
        String sreplace = original.replace("a", "x");
        String sSenteceReplace = original.replace("abc", "xyz");
        int i = original.indexOf("a");
        int j = original.lastIndexOf("bc");
        int k = original.indexOf("bc");

        System.out.println("Original: -"+ original + "-");
        System.out.println("toLowerCase: -"+ sLower +"-");
        System.out.println("toUpperCase: -"+ sUpper + "-");
        System.out.println("trim: -" + strim + "-");  
        System.out.println("subtring(0,1): -"+sSubstring+"-");      
        System.out.println("replace(a,x): -"+sreplace+"-");
        System.out.println("replace(abc,xyz): -"+sSenteceReplace+"-");
        System.out.println("indice da letra: -"+i+"-");
        System.out.println("Ultimo indice da sentenssa: -"+j+"-");
        System.out.println("indice da sentenssa: -"+k+"-");
        
    }
    public void splitUse(){
        String s = "potato apple lemon";
        String[] vector = s.split(" ");

        String chara;
        int vogais = 0;
        int consoantes =0;
        int palavras = 0;
        for (String string : vector) {
            System.out.println(string);
            
            for (int i = 0 ;i<string.length();i++){
                
                if( i+1>string.length()){
                    chara = string.substring(i);
                }
                else{
                    chara = string.substring(i, i+1);
                }
                if (chara.equals("a") || chara.equals("e")){
                    vogais +=1;
    
                }
                if (chara.equals("p") || chara.equals("m")){
                    consoantes +=1;
                    
                }
            }
            if(vogais>0 && consoantes>0){
                palavras+=1;               
            }    
            vogais = 0;
            consoantes = 0;
            
            
        }
        System.out.println(palavras);
        
    }
    public int maiorNumero(int a,int b, int c){
        int maior = 0;
        for(int i =0; i<3;i++){
            //int numero = input.nextInt();
            if (a>maior){
                maior = a;
            } 
            if (b>maior){
                maior = b;
            }
            if (c>maior){
                maior = c;
            }
        }
        return maior;
    }

    public void maxseeker(){
        Program maiornum = new Program();
        System.out.println("isira 3 numeros");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println("o maior é " +maiornum.maiorNumero(a,b,c));
    }
    public static void foeach(){
        String[] string = new String[]{"Maria","Bob","Alex"};
        for(String nome : string){
            System.out.println(nome);
        }

    } 
    public static void main(String[] args){
        Program repeticao = new Program();
        //repeticao.maxseeker();
        foeach();
    }

}