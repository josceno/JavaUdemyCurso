package Javabase.Poo.Aula225.applictation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import Javabase.Poo.Aula225.models.entites.CarRental;
import Javabase.Poo.Aula225.models.entites.Vehicle;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Enter rental data: ");
        System.out.print("Enter model: ");
        String carModel = input.nextLine();
        System.out.print("Pickup (dd/MM/yyyy): ");
        LocalDateTime pickup = LocalDateTime.parse(input.next(),dFormatter);
        System.out.print("Return (dd/MM/yyyy): ");  
        LocalDateTime returndate = LocalDateTime.parse(input.next(),dFormatter);
        System.out.print("Enter price per hour: ");
        Double pricePerHour = input.nextDouble();
        System.out.print("Enter price per Day: ");
        Double pricePerDay  =input.nextDouble();

        CarRental carRental = new CarRental(pickup, returndate, new Vehicle(carModel));
        
        carRental.BasicPaymente(pricePerHour, pricePerDay);
        carRental.calculateTax();
        System.out.println(carRental.getInvoice().getBasicPayment());
        System.out.println(carRental.getInvoice().getTax());
        System.out.println(carRental.getInvoice().getTotalpayment());
        
        input.close();
        
    }
}
