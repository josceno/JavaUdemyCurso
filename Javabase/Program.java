package Javabase;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Program{
    
    
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
        Scanner input = new Scanner(System.in);
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
    public static void matrix() {
        int[][] matrix = new int[3][4];

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        for (int i = 0; i < matrix.length; i++) {
            
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void trYcatch(){
        Scanner input = new Scanner(System.in);
        try{
            String[] vect = input.nextLine().split(" ");
            int position = input.nextInt();
            System.out.println(vect[position]);
        }catch(InputMismatchException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            e.printStackTrace();
            System.out.println("position invalid");
        }
        System.out.println("program End");
        

        input.close();
    }
    

    public static void strSplitter(){
        Scanner input = new Scanner(System.in);
        //String[] palavras = new String[3];
        String palavra = input.nextLine();
        String[] palavras = palavra.split(",");
        for(String pavalra: palavras){
            System.out.println(pavalra);
        }
    }
    
    public static void printList(){
        List<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(1);
        integers.add(2);
        System.out.println(integers.toString());

    }
    public static void  map(){
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username:", "Maria");
        cookies.put("email: ", "maria@gmail.com");
        cookies.put("phone:","99999999");

        cookies.remove("phone:");
        for (String key : cookies.keySet()) {
            System.out.println("key"+ ":"+cookies.get(key));
            
        }
    }
    public static void lambdaTest(){
        int x = 100;
        int y = (x ==100) ? 0 :1;
        System.out.println(y);
    }
    public static void main(String[] args){
        Program repeticao = new Program();
        //repeticao.maxseeker();
        //foeach();
        //matrix();
        //strSplitter();
        //trYcatch();
        //printList();
        lambdaTest();
        
    }

}