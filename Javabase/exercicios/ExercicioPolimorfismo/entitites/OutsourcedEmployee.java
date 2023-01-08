package Javabase.exercicios.ExercicioPolimorfismo.entitites;

public final class OutsourcedEmployee extends Employee {
    private double additionalChange;
    
    public OutsourcedEmployee(){}
    public OutsourcedEmployee(String name, int hours, double valuePerhour, double additionalChange){
        super(name,hours,valuePerhour);
        this.additionalChange = additionalChange;
    }
    public double getAdditionalChange() {
        return additionalChange;
    }
    public void setAdditionalChange(double additionalChange) {
        this.additionalChange = additionalChange;
    }
    @Override
    public double payment(){
        return (valuePerhour *hours) + (additionalChange*1.1);
    }

    @Override
    public String toString(){
        return  name + "- $ "+ payment();
    }
    
}
