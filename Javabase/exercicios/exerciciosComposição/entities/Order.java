package Javabase.exercicios.exerciciosComposição.entities;

import java.lang.System.Logger.Level;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Javabase.Poo.Aula66.Models.Produto;
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
    public void exibitItem()
        {for (OrderItem orderItem : orderLista) {
            System.out.println(orderItem);  
        }
    }
    public double total(Product product){
        double sum=0;
        for (OrderItem orderItem : orderLista) {
            System.out.println(orderItem); 
            //sum += product.getPrice()*orderItem.getQuantity(); 
            sum+= orderItem.getProduct().getPrice() *orderItem.getQuantity();
        }
        return sum; 
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMARY:\n");
        sb.append("Order momment:");
        sb.append(momment+"\n");
        sb.append("Order status: ");
        sb.append(status);
 
        return sb.toString();
    }
    
}
