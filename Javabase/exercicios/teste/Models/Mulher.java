package Models;

public class Mulher extends Pessoa{

    public Mulher(String nome, Double altura) {
        super(nome, altura);
        this.sexo = 'M';

    }

    public Mulher() {
    }

    @Override
    public String toString() {
        return "Mulher ["+this.nome+"," +this.Altura+"]";
    }
    
    
}
