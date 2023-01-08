package Javabase.exercicios.ExercicioPolimorfismo.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Javabase.exercicios.ExercicioPolimorfismo.entitites.OutsourcedEmployee;
import Javabase.exercicios.ExercicioPolimorfismo.entitites.Employee;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the numbers of employees: ");
        int n = input.nextInt();

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Employee #"+(i+1)+" data");
            System.out.print("Outsourced (y/n)?");    
            String choice = input.next();
            input.nextLine();
            if(choice.equals("y")){
                System.out.print("Name: ");
                
                String name = input.nextLine();
                System.out.print("Hours: ");
                int hours = input.nextInt();
                System.out.print("Value per hour: ");
                double valuePerhour = input.nextDouble();
                System.out.print("Aditional charge: ");
                double additionalChange = input.nextDouble();
                Employee employee = new OutsourcedEmployee(name,hours,valuePerhour,additionalChange);
                employees.add(employee);
            }                                       
            if(choice.equals("n")){
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Hours: ");
                int hours = input.nextInt();
                System.out.print("Value per hour: ");
                double valuePerhour = input.nextDouble();
                Employee employee = new Employee(name,hours,valuePerhour);
                employees.add(employee);
            }  
        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for(Employee employee : employees){
            System.out.println(employee);
        }

        input.close();
        
        
        
    }
}
