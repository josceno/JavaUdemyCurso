package Javabase.Poo.Aula253.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Javabase.Poo.Aula253.entities.Product;
import Javabase.Poo.Aula253.Util.MyComparator;
import Javabase.Poo.Aula253.Util.PriceUpdate;
import Javabase.Poo.Aula253.Util.ProductPredicate;
import Javabase.Poo.Aula253.Util.UppercaseName;

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
       
        //list.removeIf(Product::nonStaticPredicateTest);
        
        //Function<Product, String> function = p -> p.getName().toUpperCase();
        
        //List<String>  list2 = list.stream().map(function).collect(Collectors.toList());
        //List<String> list2 = list.stream().map(Product::nonStaticApply).collect(Collectors.toList());
        List<String> list2 = list.stream().map(p->p.getName().toUpperCase()).collect(Collectors.toList());

        list2.forEach(System.out::println);

        /*for (Product product : list) {
            System.out.println(product);
        }

       /* Consumer con = new Consumer<Product>(){
            public void accept(Product p){
                p.setPrice(p.getPrice()*1.1);
            }

        };*//* 
        Consumer<Product> con = (p -> p.setPrice(p.getPrice()*1.1));
        //list.forEach(p -> p.setPrice(p.getPrice()*1.1));
        list.forEach(Product::nonStaticUpdatePrice);
        System.out.println("---------------");
        for (Product product : list) {
            System.out.println(product);
        }*/

        
    }
    
}
