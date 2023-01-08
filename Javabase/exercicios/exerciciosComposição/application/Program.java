package Javabase.exercicios.exerciciosComposição.application;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
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
        Locale.setDefault(Locale.US);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = /*"Alex Green"*/input.nextLine();
        System.out.print("Email: ");
        String email = /*"alex@gmail.com"/* */input.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDateTime  dateTime2 = LocalDateTime.parse(input.nextLine(),dFormatt);
        
        System.out.print("Enter order data:");
        String status = input.nextLine();
        Cliente cliente = new Cliente(name,email,dateTime2);
        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status));

        
        System.out.print("How many prodtuct to this order? ");
        int N = input.nextInt();
        input.nextLine();
        for (int i = 0; i < N; i++) {
            System.out.println("Enter #"+(i+1)+" item data");
            System.out.print("Product name: ");
            String pName  = input.nextLine();
            System.out.print("Product price: ");
            double price = input.nextDouble();
            System.out.print("Quantity: ");
            int quantity = input.nextInt();
            Product product = new Product(pName, price);
            OrderItem orderItem = new OrderItem (quantity,product);
            order.addItem(orderItem);
            input.nextLine();
           
        }
        
        
        //Product product1 = new Product("Mouse", 40.00);
        
        /*OrderItem orderItem = new OrderItem (1,product);
        OrderItem orderItem2 = new OrderItem (2,product1);*/

        order.setCliente(cliente);
       /* order.addItem(orderItem);
        order.addItem(orderItem2);*/
               
        System.out.println(order);
        System.out.println(cliente);

       System.out.println("Total price: "+String.format("%.2f",order.total()));

       input.close();

    }
}
