package Javabase.exercicios.manipularArquivos.application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Javabase.exercicios.manipularArquivos.entities.Item;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault (Locale.US);
        String path = "c:";
        

        boolean success = new File(path + "\\out").mkdir();
        List<Item> items = new ArrayList<>(){};
        
        items.add(new Item("Ovo", 2.50, 3));
        items.add(new Item("leite", 5.50, 7));
        items.add(new Item("manteiga", 1.00, 3));

        
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
    }
}
