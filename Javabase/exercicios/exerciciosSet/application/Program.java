package Javabase.exercicios.exerciciosSet.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner input = new Scanner(System.in); 
       System.out.print("Enter the file path: ");
       Arquivos.lerArquivo(Arquivos.criarArquivo(input.nextLine()));
    
    }
   
    
}
