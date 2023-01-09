package Javabase.exercicios.methodosAbstratos.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Javabase.exercicios.methodosAbstratos.entites.Retangle;
import Javabase.exercicios.methodosAbstratos.entites.Circle;
import Javabase.exercicios.methodosAbstratos.entites.Shape;
import Javabase.exercicios.methodosAbstratos.entites.enums.Colours;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numer of shapes:  ");
        List<Shape> shapes = new ArrayList<>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Shape #"+(i+1)+" data");
            System.out.print("Retangle or Circle (r/c)? ");
            String shape = input.next();
            System.out.print("Color (WHITE/BLACK/RED/GREEN/BLUE): ");
            String color = input.next();
            switch (shape.toLowerCase()) {
                case "c":
                    System.out.print("Radius: ");
                    double radius = input.nextDouble();
                    shapes.add(new Circle(Colours.valueOf(color.toUpperCase()), radius));
                    break;
                case "r":
                    System.out.print("Width: ");
                    double width = input.nextDouble();
                    System.out.print("Height: ");
                    double height = input.nextDouble();
                    shapes.add(new Retangle(Colours.valueOf(color.toUpperCase()), height, width));
                    break;
                default:
                    break;
            }
        }
        System.out.println("\nShape Areas: ");
        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    
        input.close();
    }
}
