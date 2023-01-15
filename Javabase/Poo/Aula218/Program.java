package Javabase.Poo.Aula218;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a folder path");
        String strPath = input.nextLine();
        
        File path = new File(strPath);
        File[] folders =  path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders){
            System.out.println(folder);
        }
        System.out.println();
        File[] files = path.listFiles(File::isFile);
        for(File file : files){
            System.out.println(file);
        }

        boolean success = new File(strPath +"\\subdir").mkdir();
        System.out.println(success);
        input.close();
    }
}
