package Javabase.exercicios.ExercicioPolimorfismo.entitites;

public class Employee {
    protected String name;
    protected int hours;
    protected double valuePerhour;
   
   
   
    public Employee(){
    }
    public Employee(String name, int hours, double valuePerhour){
        this.name = name;
        this.hours = hours;
        this.valuePerhour = valuePerhour;
        
    } 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public double getValuePerhour() {
        return valuePerhour;
    }
    public void setValuePerhour(double valuePerhour) {
        this.valuePerhour = valuePerhour;
    }

    public double payment(){
        return valuePerhour*hours;
    }
   
    @Override
    public String toString() {
        return  name + "- $ "+ payment();
    }
    

                                                                                                          
}
