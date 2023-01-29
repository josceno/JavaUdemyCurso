package Javabase.exercicios.exerciciosSet.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;


import Javabase.exercicios.exerciciosSet.entites.Log;


public class Arquivos {
    public static String criarArquivo(String path){
        Set<Log> log = new  HashSet<>();

        log.add(new Log("amanda", Instant.parse("2018-08-26T20:45:08Z")));
        log.add(new Log("alex86", Instant.parse("2018-08-26T21:49:37Z")));
        log.add(new Log("bobbrown", Instant.parse("2018-08-27T03:19:13Z")));
        log.add(new Log("amanda", Instant.parse("2018-08-27T08:11:00Z")));
        log.add(new Log("jeniffer3",Instant.parse("2018-08-27T09:19:24Z")));
        log.add(new Log("alex86",Instant.parse("2018-08-27T22:39:52Z")));
        log.add(new Log("amanda",Instant.parse("2018-08-28T07:42:19Z")));

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (Log string : log) {
                bw.write(string.toString());
                bw.newLine();
            }
            return path;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return null;
        }
        
    }
    public static void lerArquivo(String path){
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            Set<Log> logo = new HashSet<>();

            
            String line = br.readLine();
            while(line!=null){
                String[] s = line.split(" ");
                logo.add(new Log(s[0],Instant.parse(s[1])));
                //System.out.println(line);
                line = br.readLine();
            }
            System.out.println("Total Users: "+logo.size());


        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
   
}
