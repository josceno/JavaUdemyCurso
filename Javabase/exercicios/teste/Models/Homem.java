package Models;

public class Homem extends Pessoa {

    public Homem(String nome, Double altura) {
        super(nome, altura);
        this.sexo = 'M';
    }

    public Homem() {
    }
    public String toString() {
        return "Homem ["+this.nome+"," +this.Altura+"]";
    }
}
