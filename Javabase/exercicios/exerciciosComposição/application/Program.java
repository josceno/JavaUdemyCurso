package Javabase.exercicios.exerciciosComposição.application;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Javabase.exercicios.exerciciosComposição.entities.enums.OrderStatus;
import Javabase.exercicios.exerciciosComposição.entities.Cliente;
import Javabase.exercicios.exerciciosComposição.entities.Order;
import Javabase.exercicios.exerciciosComposição.entities.OrderItem;
import Javabase.exercicios.exerciciosComposição.entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter dFormatt = DateTimeFormatter.ofPattern("dd/MM/yyyy H:mm:ss");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = "Alex Green";
        System.out.println("Email: ");
        String email = "alex@gmail.com";
        System.out.println("Birth date (DD/MM/YYYY): ");
        LocalDateTime  dateTime2 = LocalDateTime.parse("08/08/2001 20:00:00",dFormatt);

        Cliente cliente = new Cliente(name,email,dateTime2);
        Order order = new Order(LocalDateTime.now(), OrderStatus.Processing);

        System.out.println("Enter order data:");
        System.out.print("How many prodtuct to this order? ");
        int N = 2;
        
        for (int i = 0; i < N; i++) {
            Product product = new Product("Tv", 1000.00);
            OrderItem orderItem = new OrderItem (1,product);
            order.addItem(orderItem);
        }
        
        
        Product product1 = new Product("Mouse", 40.00);
        
        /*OrderItem orderItem = new OrderItem (1,product);
        OrderItem orderItem2 = new OrderItem (2,product1);*/

        order.setCliente(cliente);
       /* order.addItem(orderItem);
        order.addItem(orderItem2);*/
               
        System.out.println(order);
        System.out.println(cliente);

       System.out.println(order.total());

       input.close();

    }
}
