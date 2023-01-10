package Javabase.exercicios.exercicioHerançaPolimorfismo.apllication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Javabase.exercicios.exercicioHerançaPolimorfismo.entities.Pessoa;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Enter de number of tx payers");
        int n = input.nextInt();
        for(int i = 0; i<=n;i++){
            System.out.println("Tax payer #"+i);
            System.out.println("individual or company (i/c)");
            String type = input.next();
            System.out.print("Name: ");
            String name = input.nextLine();
            double rendaAnual = input.nextDouble();
            switch(type.toLowerCase()){
                case "i":
                    System.out.print("Health expenditores: ");
                    double gastosSaude = input.nextDouble();
                    break;
                case "c": 
                    System.out.print("numbers of employees: ");
                    double employees = input.nextDouble();
                    break;

            }
            
        }

        input.close();
    }
}
