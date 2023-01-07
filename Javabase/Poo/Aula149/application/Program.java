package Javabase.Poo.Aula149.application;


import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import Javabase.Poo.Aula149.entities.Department;
import Javabase.Poo.Aula149.entities.HourContract;
import Javabase.Poo.Aula149.entities.Worker;
import Javabase.Poo.Aula149.entities.enums.WorkerLevel;

public class Program {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter dFormat =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        
        System.out.print(" Enter department's name: ");
        Department department = new Department(input.nextLine());
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String  name = input.nextLine();
        System.out.print("Level: ");
        WorkerLevel level  = WorkerLevel.MD_LEVEL;
        System.out.print("Base salary: ");
        
        double baseSalary = input.nextDouble();
        System.out.print("houw many contracts to this worker? ");
        int N = input.nextInt();
        Worker alex = new Worker(name, baseSalary, level, department);
       
        for (int i = 0; i < N; i++) {
            System.out.println("Enter contract #"+(i+1));
            System.out.print("Date (DD/MM/YYYY): ");
            input.nextLine();
            LocalDate date = LocalDate.parse(input.nextLine(), dFormat);
            System.out.print("value per hour: ");
            double valuePerHour = input.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = input.nextInt(); 
            HourContract contract1 = new HourContract(date,  valuePerHour, hours);
            alex.addContracts(contract1);

        }
        System.out.println();
        System.out.print("Enter month to calculate income(MM/YYYY): ");
        input.nextLine();
        LocalDate date = LocalDate.parse("01/"+input.nextLine(), dFormat);
        
        System.out.println("Name: "+ alex.getName());
        System.out.println("Depatament: "+department.getName());
        System.out.println("income for"+ date.format(dFormat)+ ": "+ String.format("%.2f",alex.income(date.getYear(),date.getMonthValue()) ) );

        input.close();
    }
}
