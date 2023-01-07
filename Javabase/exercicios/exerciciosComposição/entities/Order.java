package Javabase.exercicios.exerciciosComposição.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Javabase.exercicios.exerciciosComposição.entities.enums.OrderStatus;

public class Order {
     private LocalDateTime momment; 
     private OrderStatus status;
     private List<OrderItem> orderLista = new ArrayList<>(); 
     private Cliente  cliente;
  
     public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public Order(LocalDateTime momment, OrderStatus processing) {
        this.momment = momment;
        this.status = processing;
    }

    
    public LocalDateTime getMomment() {
        return momment;
    }

    public void setMomment(LocalDateTime momment) {
        this.momment = momment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    
    public void addItem(OrderItem orderItem){
        this.orderLista.add(orderItem);
    }
    

    @Override
    public String toString() {
        
        for (OrderItem orderItem : orderLista) {
            System.out.println(orderItem);
        }
        return "Order [momment=" + momment + ", status=" + status + ",cliente + "+ cliente;
    }
    
}
