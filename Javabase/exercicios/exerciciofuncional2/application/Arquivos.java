package Javabase.exercicios.exerciciofuncional2.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Javabase.exercicios.exerciciofuncional2.entites.Funcionário;

public class Arquivos {
    public static String gerarCaminhoArquivo(){
        String path = "C:\\temp\\funcionarios.csv";
        List<Funcionário> funcionarios = Arrays.asList(new Funcionário("joão", "jdamasceno414@gmail.com",1197.90));
        
        funcionarios.forEach(x -> {
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){  
                bw.write(x.toString()); 
                bw.newLine();
            }catch(IOException e){
                System.out.println(e.getMessage());
        }});
        return path; 
    }

    public void lerArquivo(String path){
        List<Funcionário> funcionários = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            
            while(line !=null){
                String[] lines = br.readLine().split("," );
                funcionários.add(new Funcionário(lines[0],lines[1],Double.parseDouble(lines[2])));
                line = br.readLine();
            }

        } catch (IOException e) {
            // TODO: handle exception
        }
    }
}
