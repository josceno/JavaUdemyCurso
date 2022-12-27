package Javabase.exercicios.fixaçãoPoo.Q2.models;


public class Employee {
    public String nome;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    
}
