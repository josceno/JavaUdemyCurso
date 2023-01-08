package Javabase.exercicios.exerciciosComposição.application;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import Javabase.exercicios.exerciciosComposição.entities.enums.OrderStatus;
import Javabase.exercicios.exerciciosComposição.entities.Cliente;
import Javabase.exercicios.exerciciosComposição.entities.Order;
import Javabase.exercicios.exerciciosComposição.entities.OrderItem;
import Javabase.exercicios.exerciciosComposição.entities.Product;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter dFormatt = DateTimeFormatter.ofPattern("dd/MM/yyyy H:mm:ss");

        LocalDateTime  dateTime2 = LocalDateTime.parse("08/08/2001 20:00:00",dFormatt);
        Cliente cliente = new Cliente("Alex Green","alex@gmail.com",dateTime2);
        Order order = new Order(LocalDateTime.now(), OrderStatus.Processing);
        
        Product product = new Product("Tv", 1000.00);
        Product product1 = new Product("Mouse", 40.00);
        
        OrderItem orderItem = new OrderItem (1,product);
        OrderItem orderItem2 = new OrderItem (2,product1);

        order.setCliente(cliente);
        order.addItem(orderItem);
        order.addItem(orderItem2);
               
        System.out.println(order);
        System.out.println(cliente);
        //order.exibitItem();
       System.out.println(order.total(product));

    }
}
