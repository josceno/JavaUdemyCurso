package Javabase.Poo.Aula238;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    private List<T> integers;
    public PrintService(){
        integers = new ArrayList<>();
    }
    public void addValue(T value){
        integers.add(value);
    }
    public T first(){
        if(integers.isEmpty()){
        throw new IllegalStateException("the list is empty" );
        }
        return integers.get(0);
    }
    public void print(){
        System.out.println(toString());
    }
    @Override
    public String toString(){
        return integers.toString();
    } 
}
