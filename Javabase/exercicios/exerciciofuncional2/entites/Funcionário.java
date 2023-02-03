package Javabase.exercicios.exerciciofuncional2.entites;

public class Funcionário {
    private String nome;
    private String email;
    private double salario;

    public Funcionário(){
    }

    public Funcionário(String nome, String email, double salario){
        this.nome = nome;
        this.salario = salario;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return nome + "," + email + "," + salario;
    }

    
    

}
