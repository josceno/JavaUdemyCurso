package Javabase.Poo.Aula253.Util;

import java.util.List;
import java.util.function.Predicate;

import Javabase.Poo.Aula253.entities.Product;

public class ProductService {
    public static Double sum(List<Product> list, Predicate<Product> criteria){
        double sum = 0;
        for (Product p : list) {
            if(criteria.test(p)){
                sum+=p.getPrice();
            }
        }

        return sum;
    }
}
