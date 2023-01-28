package Javabase.Poo.Aula241.exemplo1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Javabase.Poo.Aula241.exemplo1.entities.Circle;
import Javabase.Poo.Aula241.exemplo1.entities.Retangle;
import Javabase.Poo.Aula241.exemplo1.entities.Shape;



public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Shape> list = new ArrayList<>();    
        list.add(new Circle(2.0));
        list.add(new Retangle(3.0, 2.0));

        System.out.println("sum of all areas is "+ String.format("%.2f", sumTotalArea(list) ));
    }
    public static double sumTotalArea(List<? extends Shape> list){
        double sum = 0;
        for (Shape shape : list) {
            sum+= shape.area();
        }
        return sum;
    }

}
