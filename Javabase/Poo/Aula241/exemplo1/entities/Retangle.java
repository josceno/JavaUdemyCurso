package Javabase.Poo.Aula241.exemplo1.entities;

public class Retangle implements Shape{
    private double width;
    private double height;

    public Retangle(){

    }
    public Retangle(double width, double height){
        super();
        this.height = height;
        this.width = width;
    }
    
    
    
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double area(){
        return width * height;
    }

}
