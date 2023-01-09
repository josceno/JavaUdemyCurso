package Javabase.exercicios.methodosAbstratos.entites;

import Javabase.exercicios.methodosAbstratos.entites.enums.Colours;

public abstract class Shape {
    protected Colours color;

    public Colours getColor() {
        return color;
    }

    public void setColor(Colours color) {
        this.color = color;
    }
    public  Shape(Colours color){
        this.color = color;
    }
    
    public abstract double area();

}
