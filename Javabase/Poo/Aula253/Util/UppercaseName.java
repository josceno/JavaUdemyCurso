package Javabase.Poo.Aula253.Util;

import java.util.function.Function;

import Javabase.Poo.Aula253.entities.Product;

public class UppercaseName implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
    
}
