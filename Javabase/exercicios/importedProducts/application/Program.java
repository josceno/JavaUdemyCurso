package Javabase.exercicios.importedProducts.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Javabase.exercicios.importedProducts.models.Product;
import Javabase.exercicios.importedProducts.models.UsedProducts;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Product> produtos = new ArrayList<>();
        DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Enter the number of products: ");
        int n = input.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println("Product data #"+(i));
            System.out.println("Commum, used or imported (c/u/i) ");
            String type = input.next();
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("price: ");
            double price = input.nextDouble();
            switch(type){
                case "c":
                //Product produto = new Product(name, price);
                produtos.add(new Product(name, price));
                break;
                case "u":
                    System.out.print("Manfacture date (dd/MM/yyyy): ");
                    LocalDate date = LocalDate.parse("dd/MM/yyyy",dFormatter);
                    produtos.add(new UsedProducts(name, price, date));
                    break;
            }

        }
    
    }
}
