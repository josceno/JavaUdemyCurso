package Javabase.exercicios.fixaçãoPoo.Q2.application;

import Javabase.exercicios.fixaçãoPoo.Q2.models.Employee;

public class Main {
    public static void main(String[] args){
        Employee employee = new Employee("joao", 1150, 150);
        System.out.println(employee.toString());
        employee.icreaseSalary(10);
        System.out.println(employee);
        
    }
}
