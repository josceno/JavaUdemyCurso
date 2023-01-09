package Javabase.exercicios.methodosAbstratos.entites;

import Javabase.exercicios.methodosAbstratos.entites.enums.Colours;

public class Circle extends Shape {
    private double radius;

    public Circle(Colours color, double radius){
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double area(){
        return 3.14* Math.pow(radius, 2);
    }


    @Override
    public String toString() {
        return "Circle [radius=" + radius +"area="+area()+ "]";
    }

    
}
