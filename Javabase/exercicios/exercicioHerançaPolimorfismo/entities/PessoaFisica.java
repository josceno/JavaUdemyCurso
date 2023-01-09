package Javabase.exercicios.exercicioHerançaPolimorfismo.entities;

public class PessoaFisica extends Pessoa {
    private Double gastosSaude;
    
    public PessoaFisica(){}
    public PessoaFisica(String nome, double rendaAnual, double gastosSaude){
        super(nome,rendaAnual);
        this.gastosSaude = gastosSaude;
    }
    
    public Double getGastosSaude() {
        return gastosSaude;
    }
    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }
    
    @Override
    public double valorTributário(){
        double tributos = 0;
        if(rendaAnual<=20000.00){
            tributos = (rendaAnual *0.15) - (gastosSaude*0.5);
        }
        if(rendaAnual>20000.00){
            tributos = (rendaAnual*0.25)- (gastosSaude*0.5);
        }
        return tributos;
    }
   
    
    
}
