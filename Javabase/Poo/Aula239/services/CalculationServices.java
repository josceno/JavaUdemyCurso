package Javabase.Poo.Aula239.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Javabase.Poo.Aula239.entities.Product;

public class CalculationServices<T> {
    
    
  
    public static <T extends Comparable<T>>  T max(List<T> list){
        if(list.isEmpty()){
            throw new IllegalStateException("Listt cannot be empty");
        }
        Collections.sort(list);
        return list.get(0);
    }

   
}
