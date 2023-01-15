package Javabase.Poo.Aula214.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("c:\\temp\\in.txt");
        Scanner archive = null;
        try{
            archive = new Scanner(file);
            while(archive.hasNextLine()){
                System.out.println(archive.nextLine());
            }

        }catch(IOException e){
            System.out.println(e.hashCode());
        }finally{
            if(archive!=null){
                archive.close();
            }
        }    
    
    
    }
}
