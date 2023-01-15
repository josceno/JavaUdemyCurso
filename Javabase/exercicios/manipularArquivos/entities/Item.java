package Javabase.exercicios.manipularArquivos.entities;

public class Item {
    private String nome;
    private Double valorUnitario;
    private Integer quantidade;

    public Item(String nome, Double valorUnitario, Integer quatidade){
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.quantidade = quatidade;
    }



    public Double valorTotal(){
        return valorUnitario * quantidade;
    }
    @Override
    public String toString(){
        return nome+","+String.format("%.2f",valorTotal());
    }

}
