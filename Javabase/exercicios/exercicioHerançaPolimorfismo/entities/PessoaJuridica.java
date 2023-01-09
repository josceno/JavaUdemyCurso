package Javabase.exercicios.exercicioHerançaPolimorfismo.entities;

public class PessoaJuridica extends Pessoa {
    private Double numeroFuncionarios;

    public PessoaJuridica(){
    }
    public PessoaJuridica(String nome, double rendaAnual, double numeroFuncionarios){
        super(nome,rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public double getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(double numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double valorTributário(){
        double tributos=0;
        if(numeroFuncionarios>10){
            tributos = rendaAnual * 0.14;
        }else{
            tributos = rendaAnual* 0.16;
        }
        
        return tributos;
    }

}
