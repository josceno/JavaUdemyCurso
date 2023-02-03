package Javabase.exercicios.exerciciofuncional2.application;

public class Program {
    public static void main(String[] args) {
        String path = Arquivos.gerarCaminhoArquivo();
        Arquivos.lerArquivo(path);
    }
}
