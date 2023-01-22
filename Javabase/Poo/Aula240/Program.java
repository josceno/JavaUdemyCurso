package Javabase.Poo.Aula240;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
    List<Integer> intlistr =  Arrays.asList(5,2,10);   
    List<String> strlistr =  Arrays.asList("a","b","c");    
    printList(strlistr);
    }
    public static void printList(List<?> list){
        for (Object object : list) {
            System.out.println(object);
        }

    }

}
