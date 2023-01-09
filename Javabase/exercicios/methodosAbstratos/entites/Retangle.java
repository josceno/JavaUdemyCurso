package Javabase.exercicios.methodosAbstratos.entites;

import Javabase.exercicios.methodosAbstratos.entites.enums.Colours;

public class Retangle extends Shape {
    private double height;
    private double width;

    public Retangle(Colours color, double height, double width){
        super(color);
        this.height = height;
        this.width = width;

    }
    

    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }


    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area(){
        return height *width;
    }


    @Override
    public String toString() {
        return "Retangle [height=" + height + ", width=" + width +"area="+area()+ "]";
    }
    
}
