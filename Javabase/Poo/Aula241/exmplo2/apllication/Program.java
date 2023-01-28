package Javabase.Poo.Aula241.exmplo2.apllication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(3.14,6.28);
        List<Object> myObjs = new ArrayList<>();
        
        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
        
     }   
     public static void copy(List<? extends Number> source, List<? super Number> target){
        for(Number n : source){
            target.add(n);
        }
     }
     public static void printList(List<?> list){
        for (Object object : list) {
            System.out.print(object+",");
        }
        System.out.println();
     }
}
