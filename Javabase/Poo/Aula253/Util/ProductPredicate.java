package Javabase.Poo.Aula253.Util;

import java.util.function.Predicate;

import Javabase.Poo.Aula253.entities.Product;

public class ProductPredicate implements Predicate<Product>{

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.00;
    }
    
}
