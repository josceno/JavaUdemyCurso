package Javabase.exercicios.exercicioHerançaPolimorfismo.entities;

public abstract class Pessoa {
    protected String nome;
    protected Double rendaAnual;

   public Pessoa() {}
   
    public Pessoa(String nome, double rendaAnual){
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract double valorTributário();
    
}
