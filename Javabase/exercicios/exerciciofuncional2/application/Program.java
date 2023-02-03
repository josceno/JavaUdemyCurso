package Javabase.exercicios.exerciciofuncional2.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String path = Arquivos.gerarCaminhoArquivo();
        Scanner input = new Scanner(System.in);
        System.out.print("Escreva o salario limite: ");
        Arquivos.lerArquivo(path, input.nextDouble());
    }
}
