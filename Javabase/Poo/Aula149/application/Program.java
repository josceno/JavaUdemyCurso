package Javabase.Poo.Aula149.application;

import java.lang.System.Logger.Level;
import java.time.LocalDate;
import java.util.Scanner;

import Javabase.Poo.Aula149.entities.Department;
import Javabase.Poo.Aula149.entities.HourContract;
import Javabase.Poo.Aula149.entities.Worker;
import Javabase.Poo.Aula149.entities.enums.WorkerLevel;

public class Program {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print(" Enter department's name: ");
        Department department = new Department("Design"/*input.nextLine()*/);
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String  name = "Alex"; //input.nextLine();
        System.out.print("Level: ");
        WorkerLevel level  = WorkerLevel.MD_LEVEL;
        System.out.print("Base salary: ");
        double baseSalary = 1200.00;//input.nextDouble();

        Worker alex = new Worker(name, baseSalary, level, department);
        HourContract contract1 = new HourContract(LocalDate.of(2018, 8, 20), 50, 20);
        alex.addContracts(contract1);
        HourContract contract2 = new HourContract(LocalDate.of(2018, 6, 13), 30.00, 18);
        alex.addContracts(contract2);
        HourContract contract3 = new HourContract(LocalDate.of(2018,8,25), 80, 10);
        alex.addContracts(contract3);

        System.out.println(alex);

        input.close();
    }
}
