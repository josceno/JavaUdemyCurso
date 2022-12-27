package Javabase.exercicios.fixaçãoPoo.Q2.models;


public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    
    public Employee(String name, double grossSalary, double tax ){
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double netSalary(){
        return grossSalary - tax;
    }
    
    public void icreaseSalary(double perctage){
        grossSalary = grossSalary + grossSalary*perctage/100;

        System.out.println("Updated data "+ name + "R$: " +netSalary() );
    }

    @Override
    public String toString() {
        return "Employee: "
        +name 
        + " $ "
        +netSalary();
    }
    
}
