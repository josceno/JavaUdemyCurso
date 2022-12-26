package Javabase.Poo.Aula63.application;

import Javabase.Poo.Aula63.Models.Triangle;
import java.util.Scanner;



public class Main {
   
    public static double areaTriangulo(double a,double b,double c){
            double area;
            double p =  (a + b + c)/2;

            area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            return area;
    } 
    public static void areaProgram(){
        double a;
        double b;
        double c;
        
        double x=0;
        double y=0;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i<2;i++){
            if(i==0) System.out.println("Enter triagle X mesures");
            if(i==1) System.out.println("Enter triagle y mesures");
            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();

            if(i==0)x = areaTriangulo(a, b, c);
            if(i==1)y = areaTriangulo(a, b, c);
        }
        System.out.printf("Triangle X area: %.4f\nTriangle y area: %.4f\n",x,y);
        if(x>y){System.out.println("Larger area: X");}else{System.out.println("Larger area: Y");}
    }
    public static void comparador(double X, double Y){
        if(X>Y){
            System.out.println("Larger area: X");
        }
        else{
            System.out.println("Larger area: Y");
        }
    }
    public static void main(String[] args){
       // areaProgram();
       Triangle triangleX = new Triangle();
       Triangle triangleY = new Triangle();
       
       System.out.println("Enter triagle X mesures");
       triangleX.Setartriangulo();
       //System.out.println(areaTriangulo(triangleX.A(), triangleX.B(), triangleX.C()));
       System.out.printf("%.4f\n",triangleX.calcularArea());
       
       System.out.println("Enter triagle Y mesures");
       triangleY.Setartriangulo();
       //System.out.println(areaTriangulo(triangleY.A(), triangleY.B(), triangleY.C()));
       System.out.printf("%.4f\n",triangleY.calcularArea());
       
       comparador(triangleX.calcularArea(),triangleY.calcularArea());
        
    }
    
}
