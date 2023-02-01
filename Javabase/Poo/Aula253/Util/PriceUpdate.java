package Javabase.Poo.Aula253.Util;

import java.util.function.Consumer;

import Javabase.Poo.Aula253.entities.Product;


public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice()*1.1);
        
    }
    
}
