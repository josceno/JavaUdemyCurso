package Models;

public abstract class Pessoa {
    protected String nome;
    protected Double Altura;
    protected char sexo;
    public Pessoa(String nome, Double altura) {
        this.nome = nome;
        Altura = altura;
    }
    public Pessoa() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getAltura() {
        return Altura;
    }
    public void setAltura(Double altura) {
        Altura = altura;
    }
    public char getSexo() {
        return sexo;
    }
    
    

    
    





}
