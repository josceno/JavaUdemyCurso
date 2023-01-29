package Javabase.exercicios.exercicioMap.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import Javabase.exercicios.exercicioMap.entities.Voto;

public class Arquivos {
    public static String criarArquivo(){
        String path = "C:\\temp\\votos.csv";
        List<String> votos =  Arrays.asList(
            new Voto("Alex Blue",15).toString(),
            new Voto("Maria Green",22).toString(),
            new Voto("Bob Brown",21).toString(),
            new Voto("Alex Blue",30).toString(),
            new Voto("Bob Brown",15).toString(),
            new Voto("Maria Green",27).toString(),
            new Voto("Maria Green", 22).toString(),
            new Voto("Bob Brown", 25).toString(),
            new Voto("Alex Blue",31).toString()
        );
        try(BufferedWriter bw  = new BufferedWriter(new FileWriter(path))) {
            for (String string : votos) {
                bw.write(string);
                bw.newLine();
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return path;
    }
    public static void lerArquivo(String path){
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String lines = br.readLine();
            while(lines!=null){
                System.out.println(lines);
                lines = br.readLine();

            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static List<Voto> votos(String path) throws NullPointerException{
        List<Voto> votos  = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String[] lines = br.readLine().split(",");
            while(lines[0] != null){
                votos.add(new Voto(lines[0],Integer.parseInt(lines[1])));
                lines = br.readLine().split(",");
                
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            return votos;
        } 
        
    }
    public static void ExibirTotalVotos(List<Voto> votos){
        
        Map<String,Integer> totalVotos = new LinkedHashMap<>();
        for (Voto voto : votos) {
            int votoNumero = 0;
            for (Voto voto2 : votos) {
                if(voto.equals(voto2)){
                    votoNumero+=voto2.getVotos();
                    totalVotos.put(voto.getNome(), votoNumero);
                }
            }
        }
        for (String key : totalVotos.keySet()) {
            System.out.println(key+": "+ totalVotos.get(key));
            
        }

    }
}
