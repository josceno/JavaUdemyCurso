package Javabase.exercicios.importedProducts.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Javabase.exercicios.importedProducts.models.ImportedProducts;
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
        for (int i = 0; i < n; i++) {
            System.out.println("Product data #"+(i));
            System.out.print("Commum, used or imported (c/u/i) ");
            String type = input.next();
            System.out.print("Name: ");
            input.nextLine();
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
                    input.nextLine();
                    LocalDate date = LocalDate.parse(input.nextLine(),dFormatter);
                    produtos.add(new UsedProducts(name, price, date));
                    break;
                case "i":
                    System.out.print("Custom fee: ");
                    double customfee = input.nextDouble();
                    produtos.add(new ImportedProducts(name, price, customfee));
                    break;
            }

        }
        System.out.println("PRICE TAGS: ");
        for (Product product : produtos) {
            System.out.println(product);
        }
    
    }
}
