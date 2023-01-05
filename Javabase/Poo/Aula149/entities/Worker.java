package Javabase.Poo.Aula149.entities;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import Javabase.Poo.Aula149.entities.enums.WorkerLevel;

public class Worker {
    private String name;
    private  WorkerLevel level;
    private double baseSalary;

    public Worker(){}
    
    public Worker(String name, double baseSalary, WorkerLevel level){
        this.name = name;
        this.baseSalary = baseSalary;
        this.level = level;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public WorkerLevel getLevel(){
        return level;
    }
    public void setLevel(WorkerLevel Level){
        this.level = level;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    } 

    public void addContracts(HourContract contract){
        Scanner input = new Scanner(System.in);
        System.out.print("value per hour: ");
        double valuePerHour = input.nextInt();
        System.out.print("How many hours: ");
        int hours = input.nextInt();
        
        contract = new HourContract(hours,valuePerHour);
        input.close();
    }


}
