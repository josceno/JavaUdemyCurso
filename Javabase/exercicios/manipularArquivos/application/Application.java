package Javabase.exercicios.manipularArquivos.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import Javabase.exercicios.manipularArquivos.entities.Item;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault (Locale.US);
        Scanner input = new Scanner(System.in);
        String path = "c:";
        

        boolean success = new File(path + "\\out").mkdir();
        List<Item> items = new ArrayList<>(){};
        String[] entrada = null;
        try{
            System.out.println("insira Itens na seginte estrutura:");
            System.out.println("nome,Valor unitário,quantidade");
            do{
                entrada = input.nextLine().split(","); 
                String nome = entrada[0];
                Double valorUnitario = Double.parseDouble(entrada[1]);
                Integer quantidade = Integer.parseInt(entrada[2]);
                items.add(new Item(nome, valorUnitario, quantidade));
            }while(!entrada.equals("0"));
        }catch(ArrayIndexOutOfBoundsException e){
            if(entrada[0].equals("0")){
                System.out.println("encerrando o programa, prepardo para exibir...");
            }else{
                throw new ArrayIndexOutOfBoundsException("formato de invalido\n o item deve ser inserido no seguinte formato:\n"+
                "nome,Valor unitário,quantidade");
            }

        }
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path+"\\out\\sumary.csv"))){
            bw.write("nome do item,ValorTotal");
            bw.newLine();
            for (Item item : items) {
                bw.write(item.toString());
                bw.newLine();
            }
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        try(BufferedReader br = new BufferedReader(new FileReader(path+"\\out\\sumary.csv"))){
            String line = br.readLine();
            while(line!=null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch(IOException e){}
        input.close();
    }
}
