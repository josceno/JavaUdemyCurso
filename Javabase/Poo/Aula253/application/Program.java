package Javabase.Poo.Aula253.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

import Javabase.Poo.Aula253.entities.Product;
import Javabase.Poo.Aula253.Util.ProductPredicate;
import Javabase.Poo.Aula253.application.MyComparator;

public class Program {
    
    
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        
        list.add(new Product("TV",900.00));
        list.add(new Product("Mouse",50.00));
        list.add(new Product("Tablet",350.00));
        list.add(new Product("Hd case",80.90));
        
        Comparator<Product> comp = (p1,p2) ->p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        
        
        /*Comparator comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
        };*/
        list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        /*Predicate pred = new Predicate<Product>() {
            public boolean test(Product p){
                return p.getPrice() >=100;
            }
            
        };*/
        Predicate<Product> pred = (p -> p.getPrice() >= 100);
       
        list.removeIf(Product::nonStaticPredicateTest);
        for (Product product : list) {
            System.out.println(product);
        }
    }
    
}
