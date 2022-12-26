package Javabase.Poo.Aula63.Models;

import java.util.Scanner;

public class Triangle {

   private double a = 1;
   private double b = 0;
   private double c = 0;
   
   Scanner input = new Scanner(System.in);

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
    a = input.nextDouble();
    b = input.nextDouble();
    c = input.nextDouble();
   }
}
