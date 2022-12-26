package Javabase.Poo.Aula63.Models;

import java.util.Scanner;

public class Triangle {

   private double a = 1;
   private double b = 0;
   private double c = 0;
   
   public double A(){
    return a;
   }
   public double B(){
    return b;
   }
   public double C(){
    return c;
   }
   public void Setartriangulo(){
    Scanner input = new Scanner(System.in);

    a = input.nextDouble();
    b = input.nextDouble();
    c = input.nextDouble();

    
   }
   public double calcularArea(){
      double area;
      double p =  (a + b + c)/2;

      area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
      return area;
} 
}
