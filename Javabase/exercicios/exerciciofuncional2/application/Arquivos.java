package Javabase.exercicios.exerciciofuncional2.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import Javabase.exercicios.exerciciofuncional2.entites.Funcionário;

public class Arquivos {
    public static String gerarCaminhoArquivo(){
        String path = "C:\\temp\\funcionarios.csv";
        List<Funcionário> funcionarios = Arrays.asList(
            new Funcionário("Moão", "jdamasceno414@gmail.com",1197.90),
            new Funcionário("Noão", "Adamasceno414@gmail.com",3197.90),
            new Funcionário("Maão", "Bdamasceno414@gmail.com",1197.90),
            new Funcionário("Taão", "Cdamasceno414@gmail.com",4197.90)
            
            );
        
       
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){  
               for (Funcionário funcionário : funcionarios) {
                    bw.write(funcionário.toString()); 
                    bw.newLine();
               }
               
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        return path; 
    }

    public static void lerArquivo(String path,double limite){
        List<Funcionário> funcionários = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            
            while(line !=null){
                String[] lines = line.split("," );
                funcionários.add(new Funcionário(lines[0],lines[1],Double.parseDouble(lines[2])));
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        double sum = funcionários.stream()
            .filter(x -> x.getNome().charAt(0) == 'M')
            .map(x -> x.getSalario()).reduce(0.0,(x,y)-> x+y);
       
       funcionários.sort((f1,f2)-> f1.getEmail().compareTo(f2.getEmail()));
       funcionários
            .stream()
            .filter(x -> x.getSalario()>limite)
            .collect(Collectors.toList())
            .forEach(x-> System.out.println(x.getEmail()));
    
      
       System.out.println("Soma de todos os salarios com M como primeira letra: "+sum);     
    }
}
