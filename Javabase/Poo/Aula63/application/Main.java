package Javabase.Poo.Aula63.application;

import java.util.Scanner;

public class Main {
   
    public static double areaTriangulo(double a,double b,double c){
            double area;
            double p =  (a + b + c)/2;

            area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            return area;
    } 
    public static void main(String[] args){
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
    
}
