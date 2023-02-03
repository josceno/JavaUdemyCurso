package Javabase.exercicios.exercicioLambda1.application;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String path = Arquivos.criarCaminhoArquivo();
        Arquivos.lerAqrquivo(path);
    }
}
