package Javabase.exercicios.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args){
        Locale.US.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
       
        List<Integer> id = new ArrayList<>();
        List<String> nome = new ArrayList<>();
        List<Double> salario = new ArrayList<>();
        
        
        System.out.print("How many employees will be registred: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Empolyee #1:");
            System.out.print("Id: ");
            int iden = input.nextInt();
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Salary: ");
            double salary = input.nextDouble();


            id.add(iden);
            nome.add(name);
            salario.add(salary);
        }
       
        System.out.println();
        System.out.print("Enter the emplyee that will have salary incrase: ");
        int indePessoa =  input.nextInt();
        System.out.print("Enter the percentege: ");
        double pctg =  input.nextDouble();
        int index =id.indexOf(indePessoa);
        
        
        System.out.println();
        salario.set(index, salario.get(index)+salario.get(index)*(pctg/100));
        for (int i =0; i<n;i++){
            System.out.println(id.get(i)+", "+ nome.get(i)+", "+String.format("%.2f",salario.get(i)));
        }
        

    }
}
