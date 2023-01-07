package Javabase.Poo.Aula149.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Javabase.Poo.Aula149.entities.enums.WorkerLevel;

public class Worker {
   
    private String name;
    private  WorkerLevel level;
    private double baseSalary;
    
    private Department department;
    private List<HourContract> contracts= new ArrayList<>();

    public Worker(){}
    
    public Worker(String name, double baseSalary, WorkerLevel level, Department department){
        this.name = name;
        this.baseSalary = baseSalary;
        this.level = level;
        this.department = department;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContracts(HourContract contract){
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }
    public double income(int year, int month){
        double sum = baseSalary;
        LocalDate data = LocalDate.of(year,month,1);
        for (HourContract hourContract : contracts) {
            if(hourContract.getDate().getMonth() == data.getMonth() && hourContract.getDate().getYear() == data.getYear()){
                sum+= hourContract.totalValue();
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Name: "+ name+
        "\nDepatament: "+department+
        "\nLevel: "+level+
        "\nBase salary: "+ String.format("%.2f", baseSalary)  +"Worker [name=" + name + ", level=" + level + ", baseSalary=" + baseSalary + ", department=" + department.getName()
                + income(2018, 8)+"]";
    }   
    
    
}
