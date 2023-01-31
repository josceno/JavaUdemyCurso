package Javabase.Poo.Aula253.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import Javabase.Poo.Aula253.entities.Product;
import Javabase.Poo.Aula253.application.MyComparator;

public class Program {
    
    
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        
        list.add(new Product("TV",900.00));
        list.add(new Product("Tablet",900.00));
        list.add(new Product("Notebook",900.00));
        
        Comparator<Product> comp = (p1,p2) ->p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        
        
        /*Comparator comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
        };*/
        list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        
        for (Product product : list) {
            System.out.println(product);
        }
    }
    
}
