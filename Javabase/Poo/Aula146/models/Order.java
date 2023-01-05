package Javabase.Poo.Aula146.models;

import java.sql.Date;

import Javabase.Poo.Aula146.models.enums.OrderStatus;

public class Order {
    private int id;
    private Date momment;
    private OrderStatus status; 
    public Order(){}
    public Order(int id, Date momment, OrderStatus status){
        this.id = id;
        this.momment = momment;
        this.status = status;
    } 
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public Date getMomment(){
        return momment;
    }
    public void setMomment(){
        this.momment = momment;
    }
    public OrderStatus getStatus(){
        return status;
    }
    public void setStatus(OrderStatus status){
        this.status = status;
    }
    public String toString(){
        return id +" "+momment+" "+status;
        
    }
}
