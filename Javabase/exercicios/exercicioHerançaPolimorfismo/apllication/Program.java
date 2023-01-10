package Javabase.exercicios.exercicioHerançaPolimorfismo.apllication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Javabase.exercicios.exercicioHerançaPolimorfismo.entities.Pessoa;
import Javabase.exercicios.exercicioHerançaPolimorfismo.entities.PessoaFisica;
import Javabase.exercicios.exercicioHerançaPolimorfismo.entities.PessoaJuridica;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Enter de number of tax payers ");
        int n = input.nextInt();
        for(int i = 1; i<=n;i++){
            System.out.println("Tax payer #"+i);
            System.out.print("individual or company (i/c)");
            String type = input.next();
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Annual income: ");
            
            double rendaAnual = input.nextDouble();
            
            switch(type.toLowerCase()){
                case "i":
                    System.out.print("Health expenditores: ");
                    double gastosSaude = input.nextDouble();
                    pessoas.add(new PessoaFisica(name,rendaAnual,gastosSaude));
                    break;
                case "c": 
                    System.out.print("numbers of employees: ");
                    double employees = input.nextDouble();
                    pessoas.add(new PessoaJuridica(name,rendaAnual,employees));
                    break;

            }
            
            
        }
        System.out.println("\nTaxes Paid: ");
        for (Pessoa pessoa : pessoas) {
            System.out.println(String.format("%.2f",pessoa.valorTributário()));
        }
        input.close();
    }
}
