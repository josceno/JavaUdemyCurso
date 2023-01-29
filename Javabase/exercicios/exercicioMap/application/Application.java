package Javabase.exercicios.exercicioMap.application;

public class Application {
    public static void main(String[] args) {
        Arquivos.ExibirTotalVotos(Arquivos.votos(Arquivos.criarArquivo()));
    }
}
