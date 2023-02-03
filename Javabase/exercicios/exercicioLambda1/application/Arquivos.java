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
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.sound.sampled.Line;

import Javabase.Poo.Aula239.entities.Product;
import Javabase.exercicios.exercicioLambda1.entities.Produto;

public class Arquivos {

    public static String criarCaminhoArquivo(){
        List<Produto> produtos = Arrays.asList(new Produto("TV",900.50),new Produto("AV",400.00));
        
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
    public static List<Produto> lerAqrquivo(String path){
        Locale.setDefault(Locale.US);
        List<Produto> produtos = new ArrayList<>();
        try(BufferedReader bf = new BufferedReader(new FileReader(path))) {
           String line = bf.readLine();
            while(line != null){
               String[]  lines = line.split(",");
               produtos.add(new Produto(lines[0],Double.parseDouble(lines[1])));
               line = bf.readLine();         
            }
   
        } catch (IOException e) {
           System.out.println(e.getMessage());
       
        }
        exibirListaProdutos(produtos);
        return produtos;
    }

    public static Double mediapreço(List<Produto> list )throws NullPointerException{
      
        List<Double> lista = list.stream().map(p -> p.getPreco()).collect(Collectors.toList());
        
        Double sum = lista.stream().reduce(0.0,(x,y)-> x+y);

        return sum/lista.size();
    }
    public  static void exibirListaProdutos(List<Produto> list){
        list.sort((p1,p2)-> p1.getNome().compareTo(p2.getNome()));
        
        for (Produto produto : list) {
            System.out.println(produto);
        }
    }

    

}
