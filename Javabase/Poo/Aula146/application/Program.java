package Javabase.Poo.Aula146.application;

import java.sql.Date;

import Javabase.Poo.Aula146.models.Order;
import Javabase.Poo.Aula146.models.enums.OrderStatus;

public class Program {
    public static void main(String[] args){
        Order order = new Order(1,new Date(0),OrderStatus.PENDDING_PAYMENT);
        System.out.println(order);
    }
}
