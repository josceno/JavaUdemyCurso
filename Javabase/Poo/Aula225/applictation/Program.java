package Javabase.Poo.Aula225.applictation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Javabase.Poo.Aula225.models.Car;


public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Enter rental data: ");
        System.out.print("Enter model: ");
        String carModel = "Civc";//input.nextLine();
        //input.nextLine();
        System.out.print("Pickup (dd/MM/yyyy): ");
        LocalDateTime pickup = LocalDateTime.parse("25/08/2018 10:30"/*input.next()*/,dFormatter);
        System.out.print("Return (dd/MM/yyyy): ");  
        LocalDateTime returndate = LocalDateTime.parse("25/08/2018 14:40"/*input.next()*/,dFormatter);
        System.out.print("Enter price per hour: ");
        Double pricePerHour = 10.00;//input.nextDouble();
        System.out.print("Enter price per Day: ");
        Double pricePerDay  = 130.00;/*input.nextDouble();*/;

        Car car = new Car(carModel, pickup, returndate,pricePerHour, pricePerDay);
        
        System.out.println(car.BasicPaymente());

        input.close();
        
    }
}
