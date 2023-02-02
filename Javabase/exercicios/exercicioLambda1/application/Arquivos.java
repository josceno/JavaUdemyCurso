package Javabase.exercicios.exercicioLambda1.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.sound.sampled.Line;

import Javabase.exercicios.exercicioLambda1.entities.Produto;

public class Arquivos {

    public static String criarCaminhoArquivo(){
        List<Produto> produtos = Arrays.asList(new Produto("TV",900.50));
        
        String path = "C:\\temp\\Produto.csv";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (Produto produto : produtos) {
                bw.write(produto.toString());
                bw.newLine();
            }
        

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return path;
    }
    public static void lerAqrquivo(String path){
        Locale.setDefault(Locale.US);
        List<Produto> produtos = new ArrayList<>();
        try(BufferedReader bf = new BufferedReader(new FileReader(path))) {
           String line = bf.readLine();
            while(line != null){
               
               String[]  lines = line.split(",");
               produtos.add(new Produto(lines[0],Double.parseDouble(lines[1])));
               line = bf.readLine();
              //  lines = bf.readLine().split(",");
            }

           
        } catch (IOException e) {
           
       
        }finally{
            System.out.println(produtos.toString());
        }

    }

    

}
