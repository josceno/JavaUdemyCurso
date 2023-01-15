package Javabase.Poo.Aula217;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Program {
    public static void main(String[] args) {
        String[] lines = new String[] {"good mornig","good afternoon","good Night"};

        String path = "E:\\projetos de código\\Java\\JavaUdemyCurso\\Javabase\\readbleFiles\\out.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        } 
        finally{
            readArchive(path);
        }   
    }
    public static void readArchive(String path){
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
