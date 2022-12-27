package Javabase.exercicios.fixaçãoPoo.Q1.modelos;

public class Retangle {
    public double width = 0;
    public double heigh = 0;

    public Retangle(double width, double heigh){
        this.width = width;
        this.heigh = heigh;
    }

    public double area(){
        return width * heigh;
    }
    public double perimeter(){
        return (width *2)+ (heigh*2);
    }
    public double diagonal(){
        return Math.sqrt((width*width)+(heigh*heigh));
    }
}
