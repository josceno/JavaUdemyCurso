package Javabase.exercicios.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       
        List<Integer> id = new ArrayList<>();
        List<String> nome = new ArrayList<>();
        List<Double> salario = new ArrayList<>();
        
        
        System.out.print("How many employees will be registred: ");
        int n = 1;//input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Empolyee #1:");
            System.out.print("Id: ");
            int iden = 1;//input.nextInt();
            System.out.print("Name: ");
            String name = "Nome";//input.nextLine();
            System.out.println("Salary: ");
            double salary = 3000.00;//input.nextDouble();


            id.add(iden);
            nome.add(name);
            salario.add(salary);
        }
        System.out.print("person id: ");
        int indePessoa = 1;//input.nextInt();
        System.out.println("Enter percentege: ");
        double pctg = 10.0;//input.nextDouble();
        int index =id.indexOf(indePessoa);
        System.out.println(salario.get(index));
        salario.set(index, salario.get(index)+salario.get(index)*(pctg/100));
        System.out.println(salario.get(index));
        

        
        
        
    }
}
